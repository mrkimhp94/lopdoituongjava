package com.company;

import java.time.LocalTime;

public class lopstopwatch {
    public static void main(String[] args) {
        int []a= new int [100000];
        for (int i = 0; i < 100000; i++) {
            a[i]=(int)(Math.random()*100000);
        }
        LocalTime start = LocalTime.now();
        a=selectionSort(a);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start, end);
        System.out.println("Time: "+sw.getElapsedTime());
        for(int x : a){
            System.out.println(x);
        }
    }
    public static class StopWatch{
        private LocalTime startTime;
        private LocalTime endTime;

        public StopWatch(){
            startTime = LocalTime.now();
        }
        public StopWatch(LocalTime startTime, LocalTime endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
        public LocalTime getStartTime() {
            return startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }
        public void start(){
            startTime=LocalTime.now();
        }

        public void stop(){
            endTime=LocalTime.now();
        }
        public int getElapsedTime(){
            return (endTime.getHour() - startTime.getHour()) * 3600 + endTime.getMinute() * 60 - startTime.getMinute() * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000;
        }

        }
    public static int[] selectionSort(int...a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int tempt = a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
        return a;
    }
    }

