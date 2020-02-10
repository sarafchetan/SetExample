package example;

import org.junit.*;

import static org.junit.Assert.*;

public class SetExampleTest {
    private SetExample subject;

    @Before
    public void setUp() throws Exception {
        subject = new SetExample();
    }

    @Test
    public void checkSetIsEmpty() {
        assertTrue(subject.isEmpty());
    }

    @Test
    public void checkSetIsNotEmpty() {
        // when
        subject.add(10);

        // then
        assertFalse(subject.isEmpty());
    }

    @Test
    public void checkSizeOfEmptySet() {
        assertEquals(0, subject.size());
    }

    @Test
    public void checkSizeOfNonEmptySet() {
        subject.add(10);
        assertEquals(1, subject.size());

        subject.add(20);
        assertEquals(2, subject.size());
    }

    @Test
    public void checkSizeOfDuplicateElementInSet() {
        subject.add(10);
        subject.add(10);
        subject.add(10);
        subject.add(10);
        subject.add(10);
        assertEquals(1, subject.size());

        subject.add(20);
        assertEquals(2, subject.size());
    }

    @Test
    public void checkContainsDuplicateElement() {
        subject.add(10);
        assertTrue(subject.contains(10));
        assertFalse(subject.contains(20));
    }

    @Test
    public void checkDeleteSet() {
        assertTrue(subject.delete());
        
    }
    
    @Test
    public void checkIndexOf() {
        assertTrue(subject.indexOf());
        
    }
    
    // Given - Preparation for ACTION
    // When - ACTION (one)
    // Then - EFFECT's (Test Cases)
    // YAGNI - You Ain't Gonna Need It
}
