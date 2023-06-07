import java.util.*;
import java.util.ArrayList;

public class WorkersRepository {

    private ArrayList<Worker> workers = new ArrayList<>();

    public void Repository(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public void add (Worker worker){
        this.workers.add(worker);
    }

    public void  getWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }
    }
    public void sortWorkers (){
        workers.sort((w1, w2) -> Integer.compare(w1.age, w2.age));
    }
}
