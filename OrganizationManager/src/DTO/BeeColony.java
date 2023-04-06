package DTO;
/**
 *
 * @author CuongSchmidt
 **/
public class BeeColony extends Colony implements Role {
    private int size;
    private String place;
    private String type;

    public BeeColony() {
        this.size = 0;
        this.place = "";
        this.type = "";
    }

    public BeeColony(int size, String place, String type) {
        this.size = size;
        this.place = place;
        this.type = type;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void communicateByTool() {
        System.out.println("The bee colony is communicating by dancing.");
    }

    @Override
    public String toString() {
        return "The colony's type is " + this.type + ", Size is about " + this.size + ", and the place is " + this.place + ".";
    }

    @Override
    public void createWorker() {
    System.out.println("Worker bees perform all the work of the bees");
    }
}

