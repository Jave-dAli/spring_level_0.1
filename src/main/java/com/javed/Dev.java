package com.javed;

public class Dev {

    private Laptop laptop;
    private int age;

    public Dev(){
        System.out.println("Dev construct successfully!");
    }
    public Dev(int age) {
        this.age = age;
        System.out.println("Parameterized constructor!");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        System.out.println("project built successfully!");
        laptop.compile();
    }
}
