package com.step.data;

public class Manager {
    private String name;
    private Integer salary;

    public void work() {
        System.out.println("Work");
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }
}

class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Manager anonymous = new Manager() { //Demo$1@1234567a, $1 -> a catalea obiect anonim
            @Override
            public void work() {
                System.out.println("Work anonymous");
            }
        };

        System.out.println(manager);
        manager.work();
        System.out.println(anonymous);
        anonymous.work();
    }
}

