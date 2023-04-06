package InterfaceDemon;
/**
 *
 * @author CuongSchmidt
 **/
public abstract class RemoteMVN {
    static int MAXofButtons = 20;
    static int price = 50;
    public static void setTimer(int number){
        System.out.println("Shut down after " +number+ "seconds");
    }
    public abstract void onDevice();
    public abstract void offDevice();
    void setLock(){
        System.out.println("Set lock in the default method!");
    }
}
