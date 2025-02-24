import java.lang.annotation.*;
import java.lang.reflect.*;

// Define the custom annotation @TaskInfo
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo{
    int priority();
    String assignedTo();
}

// Apply the annotation in the TaskManager class
public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Abhishek")
    public void completeTask(){
        System.out.println("Task completed!");
    }

    public static void main(String[] args){
        TaskManager manager = new TaskManager();
        manager.completeTask();

        // Retrieve annotation details using Reflection API
        try {
            Method method = TaskManager.class.getMethod("completeTask");
            if (method.isAnnotationPresent(TaskInfo.class)){
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
