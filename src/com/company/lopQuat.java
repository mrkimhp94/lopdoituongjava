package com.company;

public class lopQuat {
    public static void main(String[] args) {
Fan fan1 = new Fan(2,10,"yellow",false);
Fan fan2 = new Fan(3,5,"blue",true);
Fan fan3 = new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());

    }
    public static  class Fan{
        final int SLOW = 1,MEDIUM = 2,FAST = 3;
        private int speed;
        boolean on = false;
        private double radius;
        private String color ;

        public Fan(){
            speed = SLOW;
            radius = 5;
            color = "blue";
            on = false;
        }
        public Fan(int speed,double radius,String color,boolean on){
            this.speed = speed;
            this.radius = radius;
            this.color = color;
            this.on = on;
        }

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
            if (!this.isOn()){
                return "speed : "+ this.speed+ " radius : " + this.radius + " color : " + this.color + " fan is on";
            }
            return "speed : "+ this.speed+ " radius : " + this.radius + " color : " + this.color + " fan is off";
        }
    }
}
