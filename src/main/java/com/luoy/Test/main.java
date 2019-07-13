//package com.luoy.Test;
//
//
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class main {
//
//
//    public static void main(String[] args) {
////        final TicketThread ticketThread = new TicketThread();
////        Thread thread = new Thread(ticketThread, "一号窗口的号码是");
////        Thread thread1 = new Thread(ticketThread, "二号窗口的号码是");
////        thread.start();
////        thread1.start();
//////        IntStream.range(0, 5).boxed().forEach(p -> System.out.println(p));
////        IntStream.range(0, 5).boxed().map(i -> new Thread(() -> System.out.println(Thread.currentThread().getName()))).forEach(Thread::start);
////        IntStream.range(0,5).mapToObj(i -> new Thread(()->System.out.println(Thread.currentThread().getName()),"luoy"+i)).forEach(Thread::start);
////        Runnable runnable = new Runnable() {
////            @Override
////            public void run() {
////                IntStream.range(0, 5).forEach(p -> System.out.println(p));
////                System.out.println(Thread.currentThread().getName());
////            }
////        };
////
////        Thread thread = new Thread(runnable,"luo");
////        thread.start();
////        System.out.println(thread.getName()+Thread.currentThread().getName());
//
//        IntStream.range(0,3).mapToObj(main::create).forEach(Thread::start);
//        Thread thread = new Thread();
//        System.out.println(thread.getId()+Thread.currentThread().getName()+thread.getState());
//
//
//    }
//
//    private static Thread create(int index){
//        return new Thread(()->{
//           if (index==0){
//               Thread.yield();
//           }
//           System.out.println(index);
//        });
//    }
//
//}
