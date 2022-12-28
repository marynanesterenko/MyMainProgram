package com.java.class34_Dec05_Askar_Apple_Interview_Question;

public class BaseIphone {

    private String model;
    private String iOSVersion;
    private String color;
    private int memoryInMG;

    public BaseIphone(String model, int memoryInMG, String color, String iOSVersion) {
        this.model = model;
        this.memoryInMG = memoryInMG;
        this.color = color;
        this.iOSVersion = iOSVersion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }

    public int getMemoryInMG() {
        return memoryInMG;
    }

    public void setMemoryInMG(int memoryInMG) {
        this.memoryInMG = memoryInMG;
    }

    public String whichIphone(BaseIphone baseIphone) {

        return  baseIphone.getModel() + " " +
                baseIphone.getiOSVersion() + " " +
                baseIphone.getColor() + " " +
                baseIphone.getMemoryInMG();

    }

    public String writeAMessage(String messages) {
        return messages;
    }
    public String writeANote(String note) {
        return note;
    }
}
