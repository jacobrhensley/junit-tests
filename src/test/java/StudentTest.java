import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student jacob;

    @Before
    public void setUp() {
        jacob = new Student("Jacob", "Hensley", 21345678L);
    }

    @Test
    public void testStudentName() {
        assertEquals("Jacob", jacob.firstName);
        assertEquals("Hensley", jacob.lastName);
    }

    @Test
    public void testStudentId() {
        assertEquals(21345678, jacob.id, 0);
    }

    @Test
    public void testAddGrade() {
        assertTrue(jacob.grades.isEmpty());
        jacob.addGrade(89);
        assertFalse(jacob.grades.isEmpty());
        assertEquals(1, jacob.grades.size());
        assertEquals(89, jacob.grades.get(0), 0);
    }
}
