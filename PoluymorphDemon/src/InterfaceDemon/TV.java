
package InterfaceDemon;
/**
 *
 * @author CuongSchmidt
 **/

public class TV extends RemoteMVN {
    @Override
    public void offDevice(){
        System.out.println("Off TV!");
    }
    
    @Override
    public void onDevice(){
        System.out.println("On TV!");
    }
    public static void main(String[] args){
        RemoteMVN remote = new TV();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        RemoteMVN.setTimer(10000);
        System.out.println("TV's remote price: "+ RemoteMVN.price);
        System.out.println("The remote has " +RemoteMVN.MAXofButtons+ " buttons" );
    }
}
