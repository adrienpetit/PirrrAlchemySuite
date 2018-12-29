import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    private Context context_true;
    private Context context_false;
    private Context context_void;
    private Context context_too_much;


    @Before
    public void setUp() throws Exception {
        MyApp.load();
        String[] parsed_true = new String[]{"earth", "water"};
        String[] parsed_false = new String[]{"idontexist", "meneither"};
        String[] parsed_void = new String[]{};
        String[] parsed_too_much = new String[]{"earth", "water", "air"};

        context_true = new Context(parsed_true);
        context_false = new Context(parsed_false);
        context_void = new Context(parsed_void);
        context_too_much = new Context(parsed_too_much);
    }


    @Test
    public void TestCreateMud() {
        /*
        MyElement elem1 = new MyElement("water", 2);
        MyElement elem2 = new MyElement("earth", 3);
        MyElement elem3 = new MyElement("mud", 5);

        MyApp.getKnownElements().add(elem1);
        MyApp.getKnownElements().add(elem2);

        //MyApp.elementMerged(elem3);

        context_true.create();
        assertTrue(MyApp.getKnownElements().contains(elem3));
        */
    }

    @Test (expected = AssertionError.class)
    public void TestCreate_false() {
        context_true.create();
        assertTrue(MyApp.getKnownElements().contains("mud"));
    
    }

}