package main.java.com.example.taskmanager;

public class UrgentTask implements Task {
    @Override
    public void execute() {
        System.out.println("Executing urgent task!");
    }
}
