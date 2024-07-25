package main.java.com.example.taskmanager;

public class TaskManager {
    private static TaskManager instance;

    private TaskManager() {}

    public static synchronized TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        // Implementation to add task
    }
}
