import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*; // 用 JUnit 自带断言

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JavaExercisesTest {

    @Test
    public void testStarTriangle() {
        JavaExercises.starTriangle();
        // Visually check the console output!
    }

    @Test
    public void testPrintIndexed() {
        JavaExercises.printIndexed("hello");
        // Visually check the console output!
    }

    @Test
    public void testStutter() {
        assertEquals("hheelllloo", JavaExercises.stutter("hello"));
        assertEquals("aabbcc", JavaExercises.stutter("abc"));
        assertEquals("", JavaExercises.stutter(""));
    }

    @Test
    public void testQuadrant() {
        assertEquals(1, JavaExercises.quadrant(3, 4));
        assertEquals(2, JavaExercises.quadrant(-3, 4));
        assertEquals(3, JavaExercises.quadrant(-3, -4));
        assertEquals(4, JavaExercises.quadrant(3, -4));
        assertEquals(0, JavaExercises.quadrant(0, 5));
        assertEquals(0, JavaExercises.quadrant(5, 0));
    }
}
