package org.example;

public class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() { return name; }
    public double[] getGrades() { return grades; }

    public double getAverage() {
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }

    public String getStatus() {
        double avg = getAverage();
        if (avg >= 16) return "Excellent";
        if (avg >= 14) return "Bien";
        if (avg >= 10) return "Passable";
        return "Echec";
    }
}