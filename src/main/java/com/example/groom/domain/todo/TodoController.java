package com.example.groom.domain.todo;

import com.example.groom.domain.todo.Dto.TodoDetailDto;
import com.example.groom.domain.todo.Dto.TodoDto;
import com.example.groom.domain.todo.Dto.TodoListResponseDto;
import com.example.groom.domain.todo.Dto.TodoSearchCondition;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public TodoListResponseDto getTodoList(TodoSearchCondition todoSearchCondition, Pageable pageable) {
        return todoService.searchByCondition(todoSearchCondition, pageable);
    }

    @GetMapping("/{id}")
    public TodoDetailDto getTodoDetail(@PathVariable Long id) {
        return todoService.getTodoDetail(id);
    }

    @PostMapping
    public TodoDetailDto createTodo(@RequestBody TodoDto todoDto) {
        return todoService.createTodo(todoDto);
    }

    @DeleteMapping
    public Long deleteTodo(@RequestParam("todoId") Long id) {
        todoService.deleteTodo(id);
        return id;
    }

    @PatchMapping
    public TodoDetailDto updateTodo(@RequestBody TodoDetailDto todoDetailDto) {
        return todoService.updateTodo(todoDetailDto);
    }
}
