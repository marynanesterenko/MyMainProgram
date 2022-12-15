package com.java.APPLE.iPhone;

public class iPhone10 extends BaseIphone{

    iPhone10(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void unLock() {
        System.out.println("unLocking... using faceID");
    }
}
