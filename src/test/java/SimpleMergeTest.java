import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.HashSet;


public class SimpleMergeTest {

    Set<MyElement> Elements;
    SimpleMerge simpleMerge;

    @Before
    public void setUp() {
        MyApp.load();
    }

    @Test
    public void interpret() {
        MyElement elem1 = new MyElement("water", 2);
        MyElement elem2 = new MyElement("earth", 99);
    
        Elements.add(elem1);
        Elements.add(elem2);
    
        SimpleMerge simpleMerge = new SimpleMerge(Elements);
        MyElement result = new MyElement("mud", 5);
        assertEquals(simpleMerge.interpret(), null);
    }
}