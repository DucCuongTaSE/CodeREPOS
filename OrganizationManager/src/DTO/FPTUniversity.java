package DTO;
/**
 *
 * @author CuongSchmidt
 **/
public class FPTUniversity extends University implements Role {
    private int id;
    private String name;
    private String address;

    public FPTUniversity() {
        this.id = 0;
        this.name = "";
        this.address = "";
    }

    public FPTUniversity(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void communicateByTool() {
        System.out.println("Communicating by tool...");
    }

    @Override
    public void enroll() {
        System.out.println("Enrolling students...");
    }

    @Override
    public void educate() {
        System.out.println("Educating students...");
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
    
    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }
}

