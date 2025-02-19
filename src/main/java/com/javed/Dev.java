package com.javed;

public class Dev {

    public void setCom(Computer com) {
        this.com = com;
    }

    private Computer com;

    public Dev(){
        System.out.println("Dev construct successfully!");
    }

    public void build() {
        System.out.println("project built successfully!");
        com.compile();
    }
}
