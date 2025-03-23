package CoreJavaSp;

public class Task {
    private String taskDescription;
    private boolean isCompleted;

    public Task(String taskDescription) {
        if (taskDescription == null || taskDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Task description cannot be null or empty.");
        }
        this.taskDescription = taskDescription;
        this.isCompleted = false; // Initially, tasks are not completed
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[Done] " : "[Not Done] ") + taskDescription;
    }
}
