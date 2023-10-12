package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{
        for (int X = 10; X > 0; X--){
            System.out.println("Countdown " + X);
            Thread.sleep(1000);
            if(X == 1) System.out.println("LAUNCH!");
        }

    }
}
