import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean check=false;
        String str="";
        int n1=0, n2=0,i=0;
        char op=' ';
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.print("Input the operation:");
                str=sc.nextLine();
                //kiem tra xem co phep toan trong chuoi nhap vao hay khong
                if(str.contains("+")) op='+';
                else
                    if(str.contains("-")) op='-';
                    else
                        if(str.contains("*")) op='*';
                        else
                            if (str.contains("/")) op='/';
                            else throw new Exception();
                //lay ra vi tri phep toan
                i=str.indexOf(op);
                //lay ra so thu nhat
                String s1=str.substring(0, i);
                s1=s1.trim();
                n1=Integer.parseInt(s1);
                //System.out.println(n1);
                //lay ra so thu hai
                String s2=str.substring(i+1);
                s2=s2.trim();
                n2=Integer.parseInt(s2);
                //System.out.println(n2);
                if(op=='/'&& n2==0) throw new Exception();
                check=true;
            }catch(Exception e){
                System.out.println(e);
                System.out.println("Wrong input. Try again!");
            }  
        }while(check==false);
        //System.out.println("Input:"+str);
        switch(op){
            case '+':
                System.out.println(n1+""+op+""+n2+"="+(n1+n2));
                break;
            case '-':
                System.out.println(n1+""+op+""+n2+"="+(n1-n2));
                break;
            case '*':
                System.out.println(n1+""+op+""+n2+"="+(n1*n2));
                break;
            case '/':
                float t=(float)n1/(float)n2;
                System.out.println(n1+""+op+""+n2+"="+t);
                break;                        
        }
    }
    
}
