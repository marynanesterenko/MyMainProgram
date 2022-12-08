package com.java.class34_Dec05;

public class TestApple {
    public static void main(String[] args) {

        BaseIphone ip7 = new IPhone7("iPhone7", 512, "white", "7");

        BaseIphone ip8 = new IPhone8("iPhone8", 512, "black", "8");

        System.out.println(whichIphone(ip7));
        System.out.println(whichIphone(ip8));

        BaseIphone deviceId1 = new BaseIphone("Iphone7", 512, "Black", "16.0");
        BaseIphone deviceId2 = new BaseIphone("Iphone8", 256, "Silver", "14.0");
        BaseIphone deviceId3 = new BaseIphone("Iphone10", 156, "matte", "15.0");
        BaseIphone deviceId4 = new BaseIphone("Iphone8", 156, "Matte", "15.0");

        deviceId2.setiOSVersion("16.0");
        System.out.println(deviceId2.getiOSVersion());

        BaseIphone[] allIphones = new BaseIphone[4];
        allIphones[0] = deviceId1;
        allIphones[1] = deviceId2;
        allIphones[2] = deviceId3;
        allIphones[3] = deviceId4;

        updateIOS(allIphones);
    }

    // dynamic polymorphism
    public static String whichIphone (BaseIphone baseIphone){
        return baseIphone.getModel();
    }

    public static void updateIOS(BaseIphone[] baseIphones) {

        for (int i = 0; i < baseIphones.length; i++){
            if (!baseIphones[i].getiOSVersion().equals("16.0")){
                baseIphones[i].setiOSVersion("16.0");
            }
        }
    }
}
