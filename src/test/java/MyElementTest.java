import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MyElementTest {

    MyElement elem = new MyElement("test", 50);

    @Test
    public void getNameTest() {
        assertEquals("test",elem.getName());
    }

    @Test
    public void getIDTest() {
        assertEquals(50, elem.getID());
    }

    @Test
    public void compareTest() {
        MyElement elem2 = new MyElement("test", 30);
        List<Boolean> tested = elem.compare(elem2);
        assertEquals(true, tested.get(0));
        assertEquals(false, tested.get(1));
    }
}