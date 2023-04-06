/**
 *
 * @author CuongSchmidt
 **/

public class SpecWorker extends Worker {
    private int ability;
    
    public SpecWorker() {
        super();
        this.ability = 0;
    }
    
    public SpecWorker(int ability, String name, int age) {
        super(name, age);
        this.ability = ability;
    }
    
    @Override
    public String toString() {
        return super.getName() + ", " + super.getAge() + ", " + this.ability;
    }
    
    public void setData() {
        String name = super.getName();
        if (name.length() >= 2) {
            String newName = name.substring(0, 1) + "XY" + name.substring(2);
            super.setName(newName);
        }
    }
    
    public int getValue() {
        if (this.ability % 2 == 1) {
            return super.getAge() + 2;
        } else {
            return super.getAge() + 6;
        }
    }
}

    

