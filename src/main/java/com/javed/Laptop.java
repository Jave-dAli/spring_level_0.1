package com.javed;

public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop construct successfully!");
    }
    public void compile(){
        System.out.println("compile successfully on a Laptop!");
    }
}
