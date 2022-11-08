import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Testing {
    @Test
    public void rader() {
        logic MyInput = new logic();
        int expected = 0;
        int actual = MyInput.Getwordcount();

        assertEquals(expected, actual);
    }

    @Test
    public void rader2() {

        logic MyInput = new logic();
        MyInput.setInput("hej");

        int expected = 1;
        int actual = MyInput.Getwordcount();

        assertEquals(actual, expected);


    }

    @Test
    public void testGetcharcount() {
        logic MyInput = new logic();

        int actual = MyInput.Getcharcount();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testGetcharcount2() {
        logic MyInput = new logic();
        MyInput.setInput("hallå");

        int actual = MyInput.Getcharcount();
        int expected = 5;

        assertEquals(actual, expected);
    }
    @Test
    public void testLongestword(){
        logic MyInout = new logic();

        MyInout.setInput("jättelångtordhallåhallå");
        int actual = MyInout.GetlongestWord();
        int expected = 23;

        assertEquals(actual,expected);

    }

}
