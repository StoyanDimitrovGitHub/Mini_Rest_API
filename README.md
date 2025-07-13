Mini REST API for Task Management

This project is a simple REST API for managing tasks. It allows clients to create new tasks and retrieve all existing tasks via HTTP requests. Each task consists of a unique ID, a title, and a completion status.

Task — the model representing a task with fields: id, title, and completed.

TaskService — a service that stores tasks in memory and provides methods to add and retrieve tasks.

TaskController — a REST controller exposing endpoints to add a task (POST /tasks) and get all tasks (GET /tasks).

This API is a basic example built with Spring Boot, demonstrating REST principles and simple CRUD operations without persistent storage.
