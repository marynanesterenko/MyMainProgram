package com.java.class34_Dec05;

    public class TouchIDIphones extends BaseIphone {

        public TouchIDIphones(String model, int memoryInMG, String color, String iOSVersion) {
            super(model, memoryInMG, color, iOSVersion);
        }

        String[] fingerprintData = {"fingerprint1", "fingerprint2", "fingerprint3"};

        public boolean getUserTouchID(String fingerprint){
            boolean isUnlocked = false;
            for (int i = 0; i < fingerprintData.length; i++) {
                if (fingerprint.equals(fingerprintData[i])) {
                    isUnlocked = true;
                }
            }
            return isUnlocked;
        }
    }
