package main.java.com.example.taskmanager;

public class TaskFactory {
    public Task createTask(String type) {
        switch (type) {
            case "Simple":
                return new SimpleTask();
            case "Urgent":
                return new UrgentTask();
            default:
                throw new IllegalArgumentException("Unknown task type");
        }
    }
}
