/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class Employee implements Serializable {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Employee e = new Employee("Sahdy", 22);

        try {
            FileOutputStream outputStream = new FileOutputStream("/home/shady/(1)Optimal/(3)Work/OldNetBeansProjects/Basics File/serialization");
            ObjectOutputStream out = new ObjectOutputStream(outputStream);

            out.writeObject(e);

            outputStream.close();

        } catch (IOException i) {
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("/home/shady/(1)Optimal/(3)Work/OldNetBeansProjects/Basics File/serialization");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            try {
                e = (Employee) inputStream.readObject();
                System.out.println(e.name + e.age);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }

            fileInputStream.close();

        } catch (IOException i) {
        }
    }
}
