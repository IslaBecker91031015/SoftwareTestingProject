package packer;

/**
 *
 * @author I.M.Bad
 */
public class Depot {
    private String name;
    private Address address;

    /**
     * Depot:
     * @param name Depot name
     * @param address Depot Address
     */
    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    /**
     * Get Name:
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Get Co-ordinates:
     * @return co-ordinates of the address
     */
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }


    /**
     * To String:
     * @return name and address to string
     */
    public String toString() {
        return
                (this.getName() + "\n" + address);
    }

}
