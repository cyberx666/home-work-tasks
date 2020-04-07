package Lecture_9.Homework;

import java.util.Objects;
import java.util.Random;

public class Phone {


    private String provider;
    private String type;
    private String os;
    private String model;
    public int dialing;
    public int radius;


    public Phone(String provider, String type, String os, String model, int dialing) {
        this.provider = provider;
        this.type = type;
        this.os = os;
        this.model = model;
        this.dialing = dialing;
    }

    public Phone(String provider, String type, String os, String model, int dialing, int radius) {
        this.provider = provider;
        this.type = type;
        this.os = os;
        this.model = model;
        this.dialing = dialing;
        this.radius = radius;
    }


    public int getDialing() {
        return dialing;
    }

    public String getModel() {
        return model;
    }

    public String getProvider() {
        return provider;
    }

    public String getType() {
        return type;
    }

    public String getOs() {
        return os;
    }

    public int sellPhones() {
        System.out.println(String.format(" %s at %s were sold:", this.provider, this.model));
        return new Random().nextInt(500);

    }

    public int call() {
        int callsInMinute = 60 / dialing;
        System.out.println(String.format("Calls made in minute: %s %s at %s", this.provider, this.model, this.type));
        return callsInMinute;
    }

    // перегрузка
    public int call(int number) {
        double callsInMinute = 60 / dialing;
        System.out.println(String.format("Calls made in minute: %s %s at %s", this.provider, this.model, this.type));
        return number;

    }

    public int down() {
        double downCalls = dialing * 10 / 40;
        System.out.println(String.format("Calls can broke: %s %s at %s", this.provider, this.model, this.type));
        return (int) downCalls;

    }

//    public boolean equals(Object obj) {
//    }
//}


    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        Phone phone = (Phone) obj;
        return phone.dialing == this.dialing && phone.provider.equals(this.provider);
    }

    //@Override
    public int hashCode(Object obj) {
        return Objects.hash(provider, os, model, dialing);
    }
}


