package com.company;

import java.util.Scanner;

public class ptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        double a = scanner.nextDouble();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        System.out.println("nhap c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta>=0){
            System.out.println("phuong trinh co hai nghiem la : " + quadraticEquation.getRoot1() + "va"+quadraticEquation.getRoot2());
        }System.out.println("The equation has no roots");

    }
    static class QuadraticEquation {
        double a,b,c;
        public QuadraticEquation(){}
        public QuadraticEquation(double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double  getDiscriminant(){
            return this.b*this.b - 4*this.a*this.c;
        }
        public double getRoot1() {
            return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        }
        public double getRoot2() {
            return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        }


    }
}
