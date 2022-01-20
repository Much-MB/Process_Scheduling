import java.util.LinkedList;
import java.util.Queue;

public class Management {

    Queue<Task> ready = new LinkedList<>();
    Queue<Task> waiting = new LinkedList<>();
    Queue<Task> running = new LinkedList<>();
    Queue<Task> tasks = new LinkedList<>();

    int n;
    public void manage(){
       /* tasks.add(new Task( taskType.y , 3 , "T1")) ;
        tasks.add(new Task( taskType.x , 6 , "T2")) ;
        tasks.add(new Task( taskType.x , 5 , "T3")) ;
        tasks.add(new Task( taskType.z , 1 , "T4")) ;

        n=4;*/
        IO io = new IO();
        tasks = io.getTask();


    }

}
