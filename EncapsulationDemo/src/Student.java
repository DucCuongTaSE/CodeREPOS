public class Student {
    private String code;
    private String name;
    private int bYear;
    private String address;

    public Student() {
    }

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
        this.address = address;
    }

    public Student(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Student(String code) {
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getbYear() {
        return bYear;
    }

    public String getAddress() {
        return address;
    }

    
    
    
    @Override
    public String toString() {
        return code + " | " + name + " | " + bYear + " | " + address;
    }
    
}
