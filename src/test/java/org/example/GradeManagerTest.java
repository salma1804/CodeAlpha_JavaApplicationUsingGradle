package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeManagerTest {

    @Test
    void testStudentAverage() {
        Student s = new Student("Test", new double[]{10, 20, 15});
        assertEquals(15.0, s.getAverage(), 0.01);
    }

    @Test
    void testStudentStatusExcellent() {
        Student s = new Student("Top", new double[]{18, 19, 17});
        assertEquals("Excellent", s.getStatus());
    }

    @Test
    void testStudentStatusEchec() {
        Student s = new Student("Poor", new double[]{5, 6, 7});
        assertEquals("Echec", s.getStatus());
    }

    @Test
    void testBestStudent() {
        GradeManager manager = new GradeManager();
        manager.addStudent(new Student("Alice", new double[]{18, 19}));
        manager.addStudent(new Student("Bob",   new double[]{10, 11}));
        assertEquals("Alice", manager.getBestStudent().getName());
    }

    @Test
    void testClassAverage() {
        GradeManager manager = new GradeManager();
        manager.addStudent(new Student("A", new double[]{20}));
        manager.addStudent(new Student("B", new double[]{10}));
        assertEquals(15.0, manager.getClassAverage(), 0.01);
    }
}