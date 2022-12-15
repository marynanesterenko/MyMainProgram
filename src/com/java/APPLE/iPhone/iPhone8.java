package com.java.APPLE.iPhone;

public class iPhone8 extends BaseIphone{
    iPhone8(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void lock() {
        System.out.println("Locking... using touchID OR faceID");
    }

    @Override
    public void unLock() {
        System.out.println("unLocking... using touchID OR faceID");
    }
}
