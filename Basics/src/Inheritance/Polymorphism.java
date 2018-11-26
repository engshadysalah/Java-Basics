/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author root
 */
public class Polymorphism {

    public void move() {
        System.out.println("Animals can move");
    }

    public static void main(String args[]) {
        Polymorphism a = new Polymorphism();// Animal reference and object
        Polymorphism b = new Dog();// Animal reference but Dog object
        a.move();// runs the method in Animal class
        b.move();//Runs the method in Dog class
        b.bark();
    }
}

class Dog extends Polymorphism {

    @Override
    public void move() {
        System.out.println("Dogs can walk and run");
    }

    public void bark() {
        System.out.println("Dogs can bark");
    }
}
