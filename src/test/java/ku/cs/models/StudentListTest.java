package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class StudentListTest {

    @Test
    @DisplayName("Add new student without score")
    public void testAddNewStudentWithoutScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx1", "A");

        Student student = studentList.findStudentById("6xxxxxxxx1");

        assertNotNull(student, "Student should be added to the list");
        assertEquals("A", student.getName(), "Student name should be A");
        assertEquals(0, student.getScore(), "Initial score should be 0");
    }

    @Test
    @DisplayName("Add new student with score")
    public void testAddNewStudentWithScore() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx2", "B", 75);

        Student student = studentList.findStudentById("6xxxxxxxx2");

        assertNotNull(student, "Student should be added to the list");
        assertEquals("B", student.getName(), "Student name should be B");
        assertEquals(75, student.getScore(), "Initial score should be 75");
    }

    @Test
    @DisplayName("Find student by ID")
    public void testFindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx3", "C");

        Student student = studentList.findStudentById("6xxxxxxxx3");

        assertNotNull(student, "Student should be found by ID");
        assertEquals("C", student.getName(), "Student name should be C");
    }

    @Test
    @DisplayName("Return null when student is not found by ID")
    public void testFindStudentByIdNotFound() {
        StudentList studentList = new StudentList();

        Student student = studentList.findStudentById("6xxxxxxxx4");

        assertNull(student, "Student should not be found by a non-existing ID");
    }

    @Test
    @DisplayName("Give score to existing student by ID")
    public void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx5", "D", 50);

        studentList.giveScoreToId("6xxxxxxxx5", 30);

        Student student = studentList.findStudentById("6xxxxxxxx5");

        assertNotNull(student, "Student should be found by ID");
        assertEquals(80, student.getScore(), "Score should be updated to 80");
    }

    @Test
    @DisplayName("View grade of student by ID")
    public void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx6", "E", 85);

        String grade = studentList.viewGradeOfId("6xxxxxxxx6");

        assertEquals("A", grade, "Student should have grade A");
    }

    @Test
    @DisplayName("Return null when viewing grade of non-existing student")
    public void testViewGradeOfIdNotFound() {
        StudentList studentList = new StudentList();

        String grade = studentList.viewGradeOfId("6xxxxxxxx7");

        assertNull(grade, "Grade should be null for a non-existing student");
    }

    @Test
    @DisplayName("Get all students")
    public void testGetStudents() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx8", "F");
        studentList.addNewStudent("6xxxxxxxx9", "G");

        ArrayList<Student> students = studentList.getStudents();

        assertEquals(2, students.size(), "There should be 2 students in the list");
    }
}
