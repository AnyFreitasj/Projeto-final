package main.java.com.example.taskmanager;

public class SimpleTask implements Task {
    @Override
    public void execute() {
        System.out.println("Executing simple task.");
    }
}
