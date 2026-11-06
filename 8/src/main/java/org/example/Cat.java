package org.example;

public abstract class Cat {
    public String name;
    public Cat(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract void eat();
    public void sound(){
        System.out.println("Кот мяукает");
    }
}
