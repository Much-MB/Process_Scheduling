import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IO {
    Queue<Task> tasks = new LinkedList<>();

    public Queue getTask(){
        scan();
        return tasks;
    }
    private void scan(){
        File file = new File("Input.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            //System.out.println(sc.nextLine());
            addTask(sc.nextLine());
        }
       /*while (!tasks.isEmpty()){
           tasks.poll().printTask();
       }*/

    }
    private void addTask(String line){
        //System.out.println(line.substring(3,4));
        //System.out.println(line.substring(5));
        if (line.substring(3,4).equalsIgnoreCase("x")){
           tasks.add(new Task(taskType.x,Integer.valueOf(line.substring(5)),line.substring(0,2)));
        }
        if (line.substring(3,4).equalsIgnoreCase("y")){
            tasks.add(new Task(taskType.y,Integer.valueOf(line.substring(5)),line.substring(0,2)));
        }
        if (line.substring(3,4).equalsIgnoreCase("z")){
            tasks.add(new Task(taskType.z,Integer.valueOf(line.substring(5)),line.substring(0,2)));
        }
    }
}
