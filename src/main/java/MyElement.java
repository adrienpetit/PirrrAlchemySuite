import java.util.ArrayList;
import java.util.List;





/**
 * Parts of the design pattern interpreter
 */
public class MyElement extends TerminalExpression {

    /**
     * name of the element
     */
    private String name;

    /**
     * id of the element
     */
    private int id;

    /**
     * constructor
     * @param name Name of the Element
     * @param id ID of the Element
     */
    public MyElement(String name, int id){
        this.name = name;
        this.id = id;
    }

    /**
     * Name getter
     * @return this.name
     */
    public String getName(){
        return this.name;
    }

    /**
     * ID getter
     * @return this.id
     */
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

	
	/**
	 * Comparing Element with another 
	 * @param element Element to compare to
	 * @return compared
	 */
	
    public List<Boolean> compare(MyElement element){
        List<Boolean> compared = new ArrayList<>();
        compared.add(element.getName().equals(this.getName()));
        compared.add(element.getID() == this.getID());

        return compared;
    }
}
