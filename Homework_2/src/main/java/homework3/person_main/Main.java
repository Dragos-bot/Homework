package homework3.person_main;

import homework3.model.*;
import java.util.*;


public class Main {

    public static void main(String... args) {
        Employee employee1 = new Employee("Miron Sandu", 43, 10000);
        Employee employee2 = new Employee("Florean Ioana", 28, 8000);
        Employee employee3 = new Employee("Giurgiu Sanda", 26, 6000);

        Set<Employee> employees = new TreeSet<>(Person::compareTo);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee employee : employees) {
            System.out.println(employee.toString() + "\n");
        }

        //System.out.println(employees.size());

        Student student1 = new Student("Moldovan George", 19, StudentType.COLLEGE);
        student1.addClass("Maths");
        student1.addClass("Basics of programming");

        Student student2 = new Student("Moldovan George", 18, StudentType.SECONDARY);
        student2.addClass("Mathematical analysis");
        student2.addClass(" Oriented programming");

        Set<Student> students = new TreeSet<>(Comparator.comparing(Student::getName));

        students.add(student1);
        students.add(student2);

        for (Student student : students) {
            System.out.println(student.toString() + "\n");
        }

        //System.out.println(students.size());

        Country country1 = new Country("England", "London", 55_980_000);
        Address address1 = new Address("Oxford", 41, "London", "Great London", "16721348", country1);
        Address address2 = new Address("Regent", 23, "London", "Great London", "3921318", country1);

        Hobby hobby1 = new Hobby("Basketball", 12);
        hobby1.addAddress(address1);

        List<Hobby> hobbies1 = new ArrayList<>();

        hobbies1.add(hobby1);

        Hobby hobby2 = new Hobby("Rugby", 4);
        hobby2.addAddress(address1);
        hobby2.addAddress(address2);

        List<Hobby> hobbies2 = new ArrayList<>();
        hobbies2.add(hobby1);
        hobbies2.add(hobby2);

        Map<Person, List<Hobby>> people = new HashMap<>();

        people.put(employee1, hobbies1);
        people.put(employee2, hobbies2);

        for (Map.Entry<Person, List<Hobby>> entry : people.entrySet()) {
            System.out.println("*** " + entry.getKey().toString() + ", has the following hobbies: ");
            List<Hobby> hobbyList = entry.getValue();
            for (Hobby hobby : hobbyList) {
                System.out.println(hobby.toString() + "\n");
            }
        }
    }
}
