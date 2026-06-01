package org.example;

import java.util.ArrayList;
import java.util.List;

public class GradeManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getBestStudent() {
        if (students.isEmpty()) return null;
        Student best = students.get(0);
        for (Student s : students) {
            if (s.getAverage() > best.getAverage()) best = s;
        }
        return best;
    }

    public double getClassAverage() {
        if (students.isEmpty()) return 0;
        double total = 0;
        for (Student s : students) total += s.getAverage();
        return total / students.size();
    }
}