package CoreJavaSp;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class ToDoListApp {
	    private List<Task> tasks; // List to store tasks

	    public ToDoListApp() {
	        tasks = new ArrayList<>();
	    }

	    public void addTask(String taskDescription) {
	        Task newTask = new Task(taskDescription);
	        tasks.add(newTask);
	        System.out.println("Task added: " + taskDescription);
	    }

	    public void removeTask(int taskIndex) {
	        if (taskIndex >= 0 && taskIndex < tasks.size()) {
	            tasks.remove(taskIndex);
	            System.out.println("Task removed.");
	        } else {
	            System.out.println("Invalid task index.");
	        }
	    }

	    public void markTaskAsCompleted(int taskIndex) {
	        if (taskIndex >= 0 && taskIndex < tasks.size()) {
	            tasks.get(taskIndex).markAsCompleted();
	            System.out.println("Task marked as completed.");
	        } else {
	            System.out.println("Invalid task index.");
	        }
	    }

	    public void viewTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks to display.");
	        } else {
	            for (int i = 0; i < tasks.size(); i++) {
	                System.out.println(i + 1 + ". " + tasks.get(i));
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ToDoListApp toDoListApp = new ToDoListApp();

	        while (true) {
	            System.out.println("\nTo-Do List App:");
	            System.out.println("1. Add Task");
	            System.out.println("2. Remove Task");
	            System.out.println("3. Mark Task as Completed");
	            System.out.println("4. View All Tasks");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task description: ");
	                    String taskDescription = scanner.nextLine();
	                    toDoListApp.addTask(taskDescription);
	                    break;

	                case 2:
	                    System.out.print("Enter task number to remove: ");
	                    int removeIndex = scanner.nextInt() - 1;
	                    toDoListApp.removeTask(removeIndex);
	                    break;

	                case 3:
	                    System.out.print("Enter task number to mark as completed: ");
	                    int completeIndex = scanner.nextInt() - 1;
	                    toDoListApp.markTaskAsCompleted(completeIndex);
	                    break;

	                case 4:
	                    toDoListApp.viewTasks();
	                    break;

	                case 5:
	                    System.out.println("Exiting app...");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid option, please try again.");
	            }
	        }
	    }
	}
	 

