package org.example;

public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        manager.addStudent(new Student("Alice", new double[]{18, 17, 19, 16}));
        manager.addStudent(new Student("Bob",   new double[]{12, 11, 13, 10}));
        manager.addStudent(new Student("Yassine", new double[]{15, 14, 16, 13}));

        System.out.println("=== Student Grade Manager ===\n");

        for (Student s : manager.getStudents()) {
            System.out.printf("%-10s | Moyenne: %.2f | Statut: %s%n",
                    s.getName(), s.getAverage(), s.getStatus());
        }

        System.out.println("\nMoyenne de la classe : " + String.format("%.2f", manager.getClassAverage()));
        System.out.println("Meilleur etudiant   : " + manager.getBestStudent().getName());
    }
}