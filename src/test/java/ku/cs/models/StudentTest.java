package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 100 คะแนน")
    void testAddScore() {
        Student s1 = new Student("6xxxxxxxxx", "Jay");
        s1.addScore(90.5);
        assertEquals(90.5, s1.getScore());
        s1.addScore(9.5);
        assertEquals(100, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 60 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade() {
        Student s1 = new Student("6xxxxxxxxx", "Jay", 50);
        s1.addScore(10);
        assertEquals("C", s1.grade());
    }
}