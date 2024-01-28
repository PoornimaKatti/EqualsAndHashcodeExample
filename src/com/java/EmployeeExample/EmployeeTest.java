package com.java.EmployeeExample;
import java.io.*;
import  java.util.*;
public class EmployeeTest {
    public static void main(String[] args) {


            Employee e1 = new Employee(1, "Poornima", "female");
            Employee e2 = new Employee(2, "Pooja", "female");
            System.out.println(e1 == e2);
            System.out.println(e1.equals(e2));

        System.out.println("e1.hashCode(): " + e1.hashCode());
        System.out.println("e2.hashCode(): " + e2.hashCode());



    }
}

