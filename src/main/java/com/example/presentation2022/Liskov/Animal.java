package com.example.presentation2022.Liskov;


public abstract class Animal {
    abstract public Sound speak();
}

class Human extends Animal{
    @Override
    public Sound speak(){
        return new Sound("Hello");
    }
}

class Cat extends Animal{
    @Override
    public Sound speak() {
        return new Sound("Meow");
    }
}

class Snail extends Animal {
    @Override
    public Sound speak() {
        throw new UnsupportedOperationException();
    }
}
