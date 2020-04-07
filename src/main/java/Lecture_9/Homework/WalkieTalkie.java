package Lecture_9.Homework;

public class WalkieTalkie extends Phone {
    int radius;

    //Переопределение
    public int down() {
        double downCalls = dialing * 10 / 30;
        System.out.println(String.format("Calls can broke: %s %s at %s", getProvider(), getModel(), getType()));
        return (int) downCalls;
    }
    public WalkieTalkie(String provider, String type, String os, String model, int dialing, int radius) {
        super(provider, type, os, model, dialing, radius);
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
