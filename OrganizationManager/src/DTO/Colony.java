package DTO;
/**
 *
 * @author CuongSchmidt
 **/
public abstract class Colony extends Organization {

    String place;

    public Colony() {
        this.place = "land";
    }

    public Colony(String place) {
        this.place = place;
    }

    @Override
    public abstract void communicateByTool();

    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring.");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process.");
    }

    @Override
    public String toString() {
        return "This colony size is " + this.size + ", The colony's place is " + this.place + ".";
    }
}
