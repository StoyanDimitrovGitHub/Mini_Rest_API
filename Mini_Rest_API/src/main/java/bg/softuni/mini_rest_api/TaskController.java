package bg.softuni.mini_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")

public class TaskController {
@Autowired
    private TaskService taskService;
@PostMapping
    public Task addTask(@RequestBody Task task) {
    return taskService.add(task);
}

@GetMapping
    public List<Task> getTasks() {
    return taskService.getAll();
}
}
