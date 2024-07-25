package main.java.com.example.taskmanager;

public class Main {
    public static void main(String[] args) {
        // Singleton
        TaskManager taskManager = TaskManager.getInstance();
        
        // Factory Method
        TaskFactory taskFactory = new TaskFactory();
        Task simpleTask = taskFactory.createTask("Simple");
        Task urgentTask = taskFactory.createTask("Urgent");
        
        // Strategy
        simpleTask.execute();
        urgentTask.execute();
        
        // Observer
        NotificationService notificationService = new NotificationService();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        
        notificationService.addObserver(user1);
        notificationService.addObserver(user2);
        
        notificationService.notifyObservers("New task added!");
    }
}
