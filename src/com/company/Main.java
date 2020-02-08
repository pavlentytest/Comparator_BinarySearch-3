package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
         //Collections.sort();
         //Arrays.sort();
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Alex");
        names.add("Anton");
        names.add("Dmitry");

        Collections.sort(names);
        for(String i: names) {
          //  System.out.print(i + " ");
        }
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov",30));
        students.add(new Student("Sidorov",24));
        students.add(new Student("Petrov",15));
        students.add(new Student("AAAAA",32));
        students.add(new Student("VVVVV",27));

        Comparator<Student> my_sort_rule = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {                // регулируете логику

                return o2.getAge()-o1.getAge();
            }
        };

        Collections.sort(students,my_sort_rule);
        for(Student ii: students) {
        //    System.out.println(ii.getAge() + ": " + ii.getName());
        }

        Collections.sort(students);

        // Collections.binarySearch();
        // Collection

        int[] a = {100,4564,4,5,6,7,9};
        Arrays.sort(a);
        int result = Arrays.binarySearch(a,1000);
        System.out.println(result);







    }
}
