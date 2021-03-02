/*
 * Copyright (c) 2020. BoostTag E.I.R.L. Romell D.Z.
 * All rights reserved
 * porfile.romellfudi.com
 */

package com.romellfudi.ussdlibrary;

import android.accessibilityservice.AccessibilityService;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * AccessibilityService for ussd windows on Android mobile Telcom
 *
 * @author Romell Dominguez
 * @version 1.1.c 27/09/2018
 * @since 1.0.a
 */
public class USSDService extends AccessibilityService {

    private static String TAG = USSDService.class.getSimpleName();

    private static AccessibilityEvent event;

    /**
     * Catch widget by Accessibility, when is showing at mobile display
     *
     * @param event AccessibilityEvent
     */
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        this.event = event;

        Log.d(TAG, "onAccessibilityEvent");
//hamara kam
        Log.d(TAG, String.format(
                "onAccessibilityEvent: [type] %s [class] %s [package] %s [time] %s [text] %s",
                event.getEventType(), event.getClassName(), event.getPackageName(),
                event.getEventTime(), event.getText()));
///////////////////////////////
        if (USSDController.instance == null || !USSDController.instance.isRunning) {
            Log.d("ball", " 1 chala");
            return;
        }

        if (LoginView(event) && notInputText(event)) {
            // first view or logView, do nothing, pass / FIRST MESSAGE
            Log.d("ball", " 2 chala");
            clickOnButton(event, 0);
            USSDController.instance.isRunning = false;
            USSDController.instance.callbackInvoke.over(event.getText().get(0).toString());
        } else if (problemView(event) || LoginView(event)) {
            // deal down
            Log.d("ball", " 3 chala");
            clickOnButton(event, 1);
            USSDController.instance.callbackInvoke.over(event.getText().get(0).toString());
        } else if (isUSSDWidget(event)) {
            // ready for work
            Log.d("ball", " 4 chala");//4 6 4 5
            String response = event.getText().get(0).toString();
            if (notInputText(event)) {
                // not more input panels / LAST MESSAGE
                // sent 'OK' button
                Log.d("ball", " 5 chala");
                clickOnButton(event, 0);
                USSDController.instance.isRunning = false;
                USSDController.instance.callbackInvoke.over(response);
            } else {
                // sent option 1
                Log.d("ball", " 6 chala");
                if (USSDController.instance.callbackMessage == null) {
                    cancel();
                    USSDController.instance.callbackInvoke.responseInvoke(response);
                }
                else {
                    Log.d("ball", " 7 chala");
                    cancel();
                    USSDController.instance.callbackMessage.responseMessage(response);
                    USSDController.instance.callbackMessage = null;
                }
            }
        }

    }

    /**
     * Send whatever you want via USSD
     *
     * @param text any string
     */
    public static void send(String text) {
        setTextIntoField(event, text);

    }

    /**
     * Cancel USSD
     *
     */
    public static void cancel() {
        clickOnButton(event, 0);
    }

    /**
     * set text into input text at USSD widget
     *
     * @param event AccessibilityEvent
     * @param data  Any String
     */
    private static void setTextIntoField(AccessibilityEvent event, String data) {
        USSDController ussdController = USSDController.instance;
        Bundle arguments = new Bundle();
        arguments.putCharSequence(
                AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, data);

        for (AccessibilityNodeInfo leaf : getLeaves(event)) {
            if (leaf.getClassName().equals("android.widget.EditText")
                    && !leaf.performAction(AccessibilityNodeInfo.ACTION_SET_TEXT, arguments)) {
                ClipboardManager clipboardManager = ((ClipboardManager) ussdController.context
                        .getSystemService(Context.CLIPBOARD_SERVICE));
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("text", data));
                }

                leaf.performAction(AccessibilityNodeInfo.ACTION_PASTE);
            }
        }
    }

    /**
     * Method evaluate if USSD widget has input text
     *
     * @param event AccessibilityEvent
     * @return boolean has or not input text
     */
    protected static boolean notInputText(AccessibilityEvent event) {
        boolean flag = true;
        for (AccessibilityNodeInfo leaf : getLeaves(event)) {
            if (leaf.getClassName().equals("android.widget.EditText")) flag = false;
        }
        return flag;
    }

    /**
     * The AccessibilityEvent is instance of USSD Widget class
     *
     * @param event AccessibilityEvent
     * @return boolean AccessibilityEvent is USSD
     */
    private boolean isUSSDWidget(AccessibilityEvent event) {
        return (event.getClassName().equals("amigo.app.AmigoAlertDialog")
                || event.getClassName().equals("android.app.AlertDialog"));
    }

    /**
     * The View has a login message into USSD Widget
     *
     * @param event AccessibilityEvent
     * @return boolean USSD Widget has login message
     */
    private boolean LoginView(AccessibilityEvent event) {
        return isUSSDWidget(event)
                && USSDController.instance.map.get(USSDController.KEY_LOGIN)
                .contains(event.getText().get(0).toString());
    }

    /**
     * The View has a problem message into USSD Widget
     *
     * @param event AccessibilityEvent
     * @return boolean USSD Widget has problem message
     */
    protected boolean problemView(AccessibilityEvent event) {
        return isUSSDWidget(event)
                && USSDController.instance.map.get(USSDController.KEY_ERROR)
                .contains(event.getText().get(0).toString());
    }

    /**
     * click a button using the index
     *
     * @param event AccessibilityEvent
     * @param index button's index
     */
    protected static void clickOnButton(AccessibilityEvent event, int index) {
        int count = -1;
        for (AccessibilityNodeInfo leaf : getLeaves(event)) {
            if (leaf.getClassName().toString().toLowerCase().contains("button")) {
                count++;
                Log.d("count", count+"");
                if (count == index) {
                    leaf.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                }
            }
        }
    }

    private static List<AccessibilityNodeInfo> getLeaves(AccessibilityEvent event) {
        List<AccessibilityNodeInfo> leaves = new ArrayList<>();
        if (event.getSource() != null) {
            getLeaves(leaves, event.getSource());
        }

        return leaves;
    }

    private static void getLeaves(List<AccessibilityNodeInfo> leaves, AccessibilityNodeInfo node) {
        if (node.getChildCount() == 0) {
            leaves.add(node);
            return;
        }

        for (int i = 0; i < node.getChildCount(); i++) {
            getLeaves(leaves, node.getChild(i));
        }
    }

    /**
     * Active when SO interrupt the application
     */
    @Override
    public void onInterrupt() {
        Log.d(TAG, "onInterrupt");
    }

    /**
     * Configure accessibility server from Android Operative System
     */
    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Log.d(TAG, "onServiceConnected");
    }
}