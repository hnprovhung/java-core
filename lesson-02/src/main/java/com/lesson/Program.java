package com.lesson;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) throws CloneNotSupportedException {
        Map<String, Integer> studentP = new HashMap<>();
        studentP.put("A", 1);
        studentP.put("B", 3);
        studentP.put("C", 3);

        System.out.println("studentP = " + studentP);
        Map.Entry<String, Integer> maxEntry = Collections.max(studentP.entrySet(), Map.Entry.comparingByValue());
        System.out.println("maxEntry = " + maxEntry);

        Employee employee = new Employee();
        employee.clone();
    }
}