/**
 *
 * @author CuongSchmidt
 **/

public class ACRemote {
    @Override
    public void subtitle(String language){
        System.out.println("Display " +language);
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
}
