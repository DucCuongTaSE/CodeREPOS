package InterfaceDemon;
/**
 *
 * @author CuongSchmidt
 **/

public class TVOne extends RemoteMVN implements  ちゅうごく{
    @Override
    public void onDevice(){
        System.out.println("On TV!");
    }
    @Override 
    public void offDevice(){
        System.out.println("Off TV!");
    }
    @Override
    public void increaseVolume(){
        System.out.println("Volume increased!");
    }
    @Override 
    public void decreaseVolume(){
        System.out.println("Volume decreased!");
    }
    public static void main(String[] args){
        RemoteMVN remote = new TV();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        RemoteMVN.setTimer(10000);
        System.out.println("TV's remote price: "+ RemoteMVN.price);
        System.out.println("The remote has " +RemoteMVN.MAXofButtons+ " buttons" );
        ちゅうごく remote2 = new TVOne();
        remote2.increaseVolume();
    }
}
