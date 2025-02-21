package coding.InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {

    public static void main(String[] args) {
        List<Employeee> list = new ArrayList<>();
        list.add(new Employeee(27, "Aditya Sharma"));
        list.add(new Employeee(25, "Muskan Bhardwaj"));
        list.add(new Employeee(30, "Rahul Mehta"));

        // Sorting using Comparable (by age in descending order)
        Collections.sort(list);
        System.out.println("Sorted by age (Comparable):");
        for (Employeee e : list) {
            System.out.println(e.getName() + " - " + e.getAge());
        }

        // Sorting using Comparator (by name in ascending order)
        Collections.sort(list, new Comparator<Employeee>() {
            @Override
            public int compare(Employeee e1, Employeee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("\nSorted by name (Comparator):");
        for (Employeee e : list) {
            System.out.println(e.getName() + " - " + e.getAge());
        }
    }
}

class Employeee implements Comparable<Employeee> {
    int age;
    String name;

    public Employeee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employeee o) {
        return Integer.compare(o.age, this.age); // Descending order by age
    }
}
