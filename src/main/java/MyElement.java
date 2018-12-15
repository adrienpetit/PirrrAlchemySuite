import java.util.ArrayList;
import java.util.List;



/**
 * @author
 * Groupe 5
 * Bertrand
 * Degeldt
 * Peeters
 * Raxhon
 */


//Parts of the design pattern interpreter
public class MyElement extends TerminalExpression {

    //name of the element
    private String name;

    //id of the element
    private int id;

    //constructor
    public MyElement(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Name getter
    public String getName(){
        return this.name;
    }

    //ID getter
    public int getID(){
        return this.id;
    }

    @Override
    public AbstractExpression interpret(){
        return this;
    }

    @Override
    public String toString() {
        return name;
    }

    public List<Boolean> compare(MyElement element){
        List<Boolean> compared = new ArrayList<>();
        compared.add(element.getName().equals(this.getName()));
        compared.add(element.getID() == this.getID());

        return compared;
    }
}
