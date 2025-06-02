package org.example.core;

import java.util.*;

public class TaskService {
    private final Map<Integer, Task> tasks = new HashMap<>();
    private int nextId = 1;

    public Task addTask(String description) {
        Task task = new Task(nextId++, description);
        tasks.put(task.getId(), task);
        return task;
    }

    public boolean completeTask(int id) {
        Task task = tasks.get(id);
        if (task != null && !task.isCompleted()) {
            task.markCompleted();
            return true;
        }
        return false;
    }

    public boolean deleteTask(int id) {
        return tasks.remove(id) != null;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public List<Task> getActiveTasks() {
        return tasks.values().stream().filter(t -> !t.isCompleted()).toList();
    }

    public List<Task> getCompletedTasks() {
        return tasks.values().stream().filter(Task::isCompleted).toList();
    }
}
