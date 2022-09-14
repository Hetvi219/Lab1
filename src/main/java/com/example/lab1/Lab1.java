package com.example.lab1;

import com.example.lab1.Student;

public class Lab1 {
    public static void main(String[] args) {

        {
            Student student1 = new Student("Hetvi",200,"CMPG");
            Student student2 = new Student("Trishya",201,"CMPA");
            Student student3 = new Student("Jay",202,"GBMT");

            System.out.printf("Student 1: %s%n", student1);
            System.out.printf("Student 2: %s%n", student2);
            System.out.printf("Student 3: %s%n", student3);
        }

    }
}
