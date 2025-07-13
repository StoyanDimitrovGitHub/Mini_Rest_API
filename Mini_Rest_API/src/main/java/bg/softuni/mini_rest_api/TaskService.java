package bg.softuni.mini_rest_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class TaskService {
    private Map<Long, Task> tasks = new HashMap<>();
    private long idCounter = 1;
    public Task add(Task task) {
        task.setId(idCounter);
        tasks.put(task.getId(), task);
        return task;
    }
    public List<Task> getAll() {
        return new ArrayList<>(tasks.values());

    }
}
