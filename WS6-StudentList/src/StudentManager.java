/**
 *
 * @author CuongSchmidt
 **/

public class StudentManager {
    public static void main(String[] args){
        String[] options = {"Add new student", "Search a student", "Update student's info", "Remove a student", "Print out full list of students", "Exit"};
        int choice = 0;
        StudentList list = new StudentList();
        do{
            System.out.println("##Student Management Program##");
            choice = Menu.getChoice(options);
            switch(choice){
                case 1: list.addStudent();
                break;
                case 2: list.searchStudent();
                break;
                case 3: list.updateStudent();
                break;
                case 4: list.removeStudent();
                break;
                case 5: list.printAll();
                break;
                default: System.out.println("Thank you and have a nice day!");
            }
        }
        while (choice >0 && choice <6);
    }
}
