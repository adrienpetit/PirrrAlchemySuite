import org.junit.Test;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class LinkTest {
    Set<Integer> ids = new HashSet(Arrays.asList(10, 12));
    //Integer[] ids = {12, 20};
    Link lien = new Link(ids, 20);

    Set<Integer> test = new HashSet(Arrays.asList(10, 12));

    @Test
    public void getIDsTest() {
        assertEquals(test, lien.getIds());
    }

    @Test
    public void getCreatedTest() {
        assertEquals(50, lien.getCreated());
    }

    @Test
    public void compare() {
        Link lien2 = new Link(test, 21);
        Boolean compared = lien.compare(lien2);
        assertTrue(compared);
    }
}