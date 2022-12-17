package com.java.class41_Dec16_CollectionsFramework;
// Let's imagine that the "Box" is the DataStructure
public class Box <T>{
    private T data;

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}
