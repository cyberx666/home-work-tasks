package Lecture_9.Homework;

public class LandLinePhone extends Phone {
    public LandLinePhone(String provider, String type, String os, String model, int dialing) {
        super(provider, type, os, model, dialing);
    }

    public String getDetachableHandset() {
        return detachableHandset;
    }

    public void setDetachableHandset(String detachableHandset) {
        this.detachableHandset = detachableHandset;
    }

    private String detachableHandset;
}
