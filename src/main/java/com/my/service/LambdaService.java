package com.my.service;

import com.my.entity.LambdaTestEntity;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author jyt
 * @date 2018/6/24 下午1:56
 */
public class LambdaService {

    public static void testHello()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();

        new Thread(()->{
            System.out.println("hello");
            System.out.println("hh");
        }).start();

        Collections.sort(new ArrayList<String>(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        Collections.sort(new ArrayList<String>(),
                (String s1,String s2)->{return 0;}
                );
    }

    
//    public static void main(String args[])
//    {
//        List<String> list = Arrays.asList("1","2","3");
//
//        list.forEach(n->System.out.println(n+"\t"));
//
//        list.forEach(System.out::println);
//
//        List<Integer> integerList = Arrays.asList(100,200,300,400);
//        List integerList1 = integerList.stream().map(x->x+.12*x).collect(Collectors.toList());
//        integerList1.forEach(System.out::println);
//
//        List<LambdaTestEntity> entityList = new ArrayList<>();
//        LambdaTestEntity entity1 = new LambdaTestEntity();
//        entity1.setAge(10);
//        LambdaTestEntity entity2 = new LambdaTestEntity();
//        entity2.setAge(100);
//        entityList.add(entity1);
//        entityList.add(entity2);
//        entityList.stream().map(n->n.getAge());
////        entityList.forEach(n->System.out.println(n.getAge()));
//
//        // 将字符串换成大写并用逗号链接起来
//        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
//        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
//        System.out.println(G7Countries);
//    }

    public static void main(String[] args) {

        LambdaService lambdaService = new LambdaService();

            lambdaService.doTask();


        while(Thread.activeCount()>1)
        {
            Thread.yield();
        }
        System.out.println(lambdaService.getTaskId());
    }


    private volatile int taskId=0;

    private AtomicInteger anInt = new AtomicInteger();

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void doTask()
    {
        Integer index = 0;
        for(int i=0;i<10;i++)
        {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    doBiz(index);
                }
            }).start();
        }
    }

    public void doBiz(Integer i){
        for(int j=0;j<1000;j++)
        {
            taskId++;
        }
    }
}
