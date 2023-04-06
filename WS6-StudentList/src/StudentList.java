/**
 *
 * @author CuongSchmidt
 **/
import java.util.ArrayList;
public class StudentList extends ArrayList<Student>{

    
    public StudentList(){
        super();
    }
    public Student search(String code){
        code = code.trim().toUpperCase();
        for (int i=0; i<this.size(); i++)
            if(this.get(i).getCode().equals(code)) return this.get(i);
        return null;
    }
    private boolean isCodeDuplicated (String code){
        code = code.trim().toUpperCase();
        return search(code) !=null;
    }
    public void addStudent(){
        String newCode, newName = null;
        int newMark;
        boolean codeDuplicated = false;
        do {
            newCode = Inputter.inputPattern("Student code: ", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDuplicated(newCode);
            if (codeDuplicated) System.out.println("This code is duplicated");
        }
        while (codeDuplicated==true);
        newName = Inputter.inputNonBlankStr("Name of new student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark: ", 0, 10); 
        Student st = new Student (newCode, newName, newMark);
        this.add(st);
        System.out.println("Student " + newCode + " has been added!");
    }
    
    public void searchStudent(){
        if(this.isEmpty())
            System.out.println("The list is empty. Searching is cancelled!");
        else{
            String sCode = Inputter.inputStr("Input student code: ");
            Student st = this.search(sCode);
            if(st==null)
                System.out.println("Student " + sCode + " doesn't exist!");
            else System.out.println("We found: " + st);
        }
    }
    
    public void updateStudent(){
        if (this.isEmpty()){
            System.out.println("The list is empty. Cancelling update!");
        } else {
            String uCode = Inputter.inputStr("Input code: ");
            Student st = this.search(uCode);
            if(st!=null){
                String oldName = st.getName();
                String msg = "Old name: " + oldName + ", new name: ";
                String newName = Inputter.inputNonBlankStr(msg);
                st.setName(newName);
                int oldMark = st.getMark();
                msg = "Old mark: " + oldMark + ", new mark 0...10: ";
                int newMark = Inputter.inputInt(msg, 0, 10);
                st.setMark(newMark);
                System.out.println("Student " + uCode + " has been updated!");
            } else {
                System.out.println("Student " + uCode + " doesn't exist!");
        }
    }
}    
    public void removeStudent(){
        if (this.isEmpty())
            System.out.println("The list is empty. Cancelling remove operation!");
        else {
            String rCode = Inputter.inputStr("Input code: ");
            Student st = this.search(rCode);
            if (st==null)
                System.out.println("Student " + rCode + " doesn't exist!");
            else {
                this.remove(st);
                System.out.println("Student " + rCode + " has been removed!");
            }
        }
    }
    
    public void printAll(){
        if(this.isEmpty())
            System.out.println("The list is empty!");
        else{
            System.out.println("Student list: ");
            this.forEach((st) -> {
                System.out.println(st);
            });
            System.out.println("Total: " + this.size() + " student(s)");
        }
    }
}    
