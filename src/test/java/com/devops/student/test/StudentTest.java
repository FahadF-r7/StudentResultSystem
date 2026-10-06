package com.devops.student.test;

// Add this import statement pointing to your main class package
import com.devops.student.main.Student; 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentCalculations() {
        Student student = new Student("Alice", 80, 70, 90);
        
        assertEquals(240, student.calculateTotal(), "Total should be 240");
        assertEquals(80.0, student.calculateAverage(), "Average should be 80.0");
        assertEquals("A", student.determineGrade(), "Grade should be A");
    }
}