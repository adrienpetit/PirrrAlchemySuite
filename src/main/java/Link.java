import java.util.Set;





/**
 * Link between two elements
 * Contains linked element and result of the merge
 */
public class Link {

    /**
     * IDs of the linked element
     */
    private Set<Integer> ids;

    /**
     * ID of the created element
     */
    private int created;

    /**
     * IDs getter
     * @return ids
     */
    public Set<Integer> getIds() {
        return ids;
    }

    /**
     * ID of the created element getter
     * @return created
     */
    public int getCreated() {
        return created;
    }


    /**
     * First constructor, without result (for the fake link)
     * @param ids Set of ID
     */
    public Link(Set<Integer> ids){
        this.ids = ids;
    }

    /**
     * Second constructor, with the result (for the database loader)
     * @param ids Set of ID
     * @param created State
     */
    public Link(Set<Integer> ids, int created){
        this.created = created;
        this.ids = ids;
    }

    /**
     * Compares two links
     * @param other Other link
     * @return ids.equals(other.getIds())
     */
    public boolean  compare(Link other){
        return ids.equals(other.getIds());
    }
}
