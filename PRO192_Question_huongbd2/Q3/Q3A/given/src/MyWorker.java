/**
 *
 * @author CuongSchmidt
 **/
import java.util.ArrayList;
import java.util.Collections;


public abstract class MyWorker implements IWorker {
    private final ArrayList<Worker> workerList;

    public MyWorker(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }

    public int f1() {
        int count = 0;
        //count = workerList.stream().filter((worker) -> (Character.isDigit(worker.getName().charAt(1)))).map((_item) -> 1).reduce(count, Integer::sum);
        for (Worker w : workerList) {
            Character c = w.getName().charAt(1);
            if(Character.isDigit(c)){
                    count++;
            }                
        }
        return count;
    }

    public void f2() {
        int maxAge = Integer.MIN_VALUE;
        int secondMaxAge = Integer.MIN_VALUE;
        int maxAgeIndex = -1;
        int secondMaxAgeIndex = -1;

        for (int i = 0; i < workerList.size(); i++) {
            int age = workerList.get(i).getAge();
            if (age > maxAge) {
                secondMaxAge = maxAge;
                secondMaxAgeIndex = maxAgeIndex;
                maxAge = age;
                maxAgeIndex = i;
            } else if (age > secondMaxAge && age < maxAge) {
                secondMaxAge = age;
                secondMaxAgeIndex = i;
            }
        }

        if (secondMaxAgeIndex != -1) {
            workerList.remove(secondMaxAgeIndex);
        }
    }

    public void f3() {
        Collections.sort(workerList, (w1, w2) -> {
            char c1 = w1.getName().charAt(1);
            char c2 = w2.getName().charAt(1);
            return Character.compare(c1, c2);
        });
    }
}
