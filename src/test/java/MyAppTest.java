import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;


public class MyAppTest {

    Link valid_link;
    MyElement valid_element;

    @Before
    public void setUp() {
        System.out.println("il est passé par ici");
        MyApp.load();

        Set<Integer> valid_ids = new HashSet<Integer>();
        valid_ids.add(2);
        valid_ids.add(3);
        Link valid_link = new Link(valid_ids, 5);

        Set<Integer> bad_ids = new HashSet<Integer>();
        bad_ids.add(0);
        bad_ids.add(0);
        Link bad_link = new Link(valid_ids, 0);

        MyElement valid_element = new MyElement("mud", 5);
    }

    @Test
    public void getKnownElementsTest() {
        assertEquals(1, MyApp.getKnownElements().size());
    }

    @Test
    public void getUnknownElementsTest() {
        Boolean x = MyApp.getUnknownElements().contains(valid_element);
        MyApp.getUnknownElements().add(valid_element);
        assertNotEquals(x, MyApp.getUnknownElements().contains(valid_element));
    }

    @Test
    public void getLinks() {

    }

    @Test
    public void loadTest() {

    }

    @Test
    public void askIfWin() {
    }

    @Test
    public void save() {
    }

    @Test
    public void elementMerged() {
    }

    @Test
    public void findLink() {
        //assertTrue(MyApp.findLink(valid_link).compare(valid_link));
        //bad_link should throw an exception
    }

    @Test
    public void getCreated() {
        // One should create separate resources for tests.
    }
}