package org.example;

import org.example.core.Task;
import org.example.core.TaskService;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskService service = new TaskService();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            switch (scanner.nextLine().trim()) {
                case "1" -> addTask();
                case "2" -> completeTask();
                case "3" -> deleteTask();
                case "4" -> printTasks(service.getAllTasks(), "Все задачи:");
                case "5" -> printTasks(service.getActiveTasks(), "Активные задачи:");
                case "6" -> printTasks(service.getCompletedTasks(), "Завершённые задачи:");
                case "0" -> {
                    System.out.println("Выход...");
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Меню задач ---");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Завершить задачу");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Показать все задачи");
        System.out.println("5. Показать активные задачи");
        System.out.println("6. Показать завершённые задачи");
        System.out.println("0. Выход");
        System.out.print("Выберите пункт: ");
    }

    private static void addTask() {
        System.out.print("Введите описание задачи: ");
        String desc = scanner.nextLine();
        Task task = service.addTask(desc);
        System.out.println("Добавлена: " + task);
    }

    private static void completeTask() {
        System.out.print("Введите ID задачи для завершения: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (service.completeTask(id)) {
            System.out.println("Задача завершена.");
        } else {
            System.out.println("Задача не найдена или уже завершена.");
        }
    }

    private static void deleteTask() {
        System.out.print("Введите ID задачи для удаления: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (service.deleteTask(id)) {
            System.out.println("Задача удалена.");
        } else {
            System.out.println("Задача не найдена.");
        }
    }

    private static void printTasks(List<Task> tasks, String title) {
        System.out.println("\n" + title);
        if (tasks.isEmpty()) {
            System.out.println("Нет задач.");
        } else {
            tasks.forEach(System.out::println);
        }
    }
}
