package homework3.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<List<String> classes;
    private StudentType studentType;

    public Student(String name, int age, StudentType studentType) {
        super(name, age);
        this.classes = new ArrayList<List<String>>();
        this.studentType = studentType;
    }

    public void addClass(String class) { classes.add(class); }

    @Override
    public String toString() {
        String studentToString;
        studentToString = "Student{" + super.toString() + ", has the classes=(";
        for (int i = 0; i < classes.size(); i++) {
            studentToString = studentToString + classes.get(i);
            if (i < classes.size() - 1) {
                studentToString = studentToString + ",";
            }
        }
        studentToString = studentToString + "), studentType=" + studentType + "}";
        return studentToString;
    }
}
