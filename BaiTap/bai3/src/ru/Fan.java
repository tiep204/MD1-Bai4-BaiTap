package ru;

public class Fan {
    /// 1. cac thuoc tinh
    public static final int SLOW = 1;
    public static final int MEIUN = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //2. cac ham tao(contrustors)
    public Fan(){
        //khoi tao gia tri mac dinh cho cac thuoc tinh
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    ///3 các phương thức (methot)
    //3.1 get and set


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (this.on){
            return "Speed:" + this.speed+ "- Color: "+ this.color+ "-  Radius: "+ this.radius + "- Fan is on";
        }else{
        return "color: "+ this.color + "- Radius: " +this.radius + "- Fan is off";
        }

    }

}
