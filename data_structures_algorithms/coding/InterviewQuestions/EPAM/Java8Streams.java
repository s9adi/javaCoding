package data_structures_algorithms.coding.InterviewQuestions.EPAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Streams {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        // Add some customer data to the list including duplicates
        customers.add(new Customer(1, "John Doe", 50000.0));
        customers.add(new Customer(1, "John Doe", 50000.0));
        customers.add(new Customer(2, "Jane Smith", 60000.0));
        customers.add(new Customer(2, "Jane Smith", 60000.0));
        customers.add(new Customer(3, "Alice Johnson", 55000.0));
        customers.add(new Customer(3, "Alice Johnson", 55000.0));

        // highest salary of unique customers

        Map<Integer, Double> collect = customers.stream()
                .collect(Collectors.toMap(Customer::getId, Customer::getSalary, Double::max));
        double highestSalary = collect.values().stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);

        // Display the highest salary among unique customers
        System.out.println("Highest Salary among unique customers: $" + highestSalary);
    }
}

class Customer {
    private int id;
    private String name;
    private double salary;

    public Customer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters for the Customer class
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}