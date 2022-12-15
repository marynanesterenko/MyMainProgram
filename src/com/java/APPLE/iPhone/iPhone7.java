package com.java.APPLE.iPhone;

public class iPhone7 extends BaseIphone{
    iPhone7(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void lock() {
        System.out.println("Locking... using touchID");
    }

    @Override
    public void unLock() {
        System.out.println("unLocking... using touchID");
    }
}
