public class Task {

    String taskName;
    int taskNum;
    int taskDuration;
    taskType type;
    public Task(taskType type,int taskDuration  , String name) {
        this.type =type;
        this.taskDuration = taskDuration;
        this.taskName = name ;
    }
    public void printTask(){
        System.out.println(this.taskName);
        System.out.println(this.taskDuration);
        System.out.println(this.type);
    }
}
