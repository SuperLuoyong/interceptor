package com.luoy.Test;

public class TicketThread implements Runnable {

    private int i = 1;

    private int Max = 10;

    @Override
    public void run() {
        while (i<=Max){
            System.out.println(Thread.currentThread().getName()+"的号码是"+i++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
