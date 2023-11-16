package TaskPro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTest {
    @Test
    public void testGetLineCount() {
        Task counter = new Task(0,0,"stop");
        int expected = 0;
        int actual = counter.getLineCount();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetCharacterCount() {
        Task counter = new Task(0,0,"stop");
        int expected = 0;
        int actual = counter.getCharacterCount();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetInput() {
        Task counter = new Task(0,0,"stop");
        String expected = "stop";
        String actual = counter.getInput();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetIsValid() {
        Task counter = new Task(0,0,"stop");
        boolean expected = true;
        boolean actual = counter.getIsValid();
        assertEquals(expected, actual);
    }
}
