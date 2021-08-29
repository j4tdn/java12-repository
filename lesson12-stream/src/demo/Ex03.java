package demo;

import bean.Apple;

public class Ex03 {

    //global variable =
    public static void main(String[] args) {
        //local variable


        //final >> final at stack
        final int a = 10;

        final Apple a1 = new Apple();
        final Apple a2 = new Apple();

        //a1=a2 : not allows
        a1.setColor("yellow");

        //final >> primitive: cannot reassign value
        //final >> object : cannot reassign refence's address
        Runnable runnbale = run(2000);
        runnbale.run();

    }

    private static Runnable run(int time) {
        //lexical scope
        //local variable
        //outer scope
        String jobName = "Queue Job";
        Apple jobDetail = new Apple(1, "black", 100, "Lào");

        //anonymous class >> contains run method
        //Ex03 and anonymous class are separately
        return new Runnable() {
            @Override
            public void run() {
                //local variable
                //inner scope
                int time = 2000;
                //jobName = "stack job";
                jobDetail.setColor("white");
                System.out.println(jobName + "is running about " + time + "ms");
                System.out.println("jobDetail: " + jobDetail);
            }
        };
    }
}