package com.greenfoxacademy.connectionwithsql.Controller;


import com.greenfoxacademy.connectionwithsql.Model.Todo;
import com.greenfoxacademy.connectionwithsql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {



  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  @GetMapping("/todo")
  public String todoController (){
    return "todo";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) String isActive, Model model){
    if (isActive == null){
      model.addAttribute("todos", todoRepository.findAll());
    } else if (isActive.equals("false")){
      model.addAttribute("todos", todoRepository.findAllByDoneIsFalse());
    } else if (isActive.equals("true")) {
      model.addAttribute("todos", todoRepository.findAllByDoneIsTrue());
    }
    return "todolist";
  }

  @GetMapping("/addTodo")
  public String addtodo(){
    return "createtodo";
  }

  @PostMapping("/addTodo")
  public String submitTodo(@ModelAttribute (value = "input") String input){
    todoRepository.save(new Todo(input, false, false));
    return "redirect:/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable("id") Long id){
    todoRepository.deleteById(id);
    return "redirect:/list";
  }

  @GetMapping("/{id}/edit")
  public String showEditForm(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute(todoRepository.findById(id).orElse(null));
    return "editTodo";
  }

  @PostMapping("/{id}/edit")
  public String submitEdit(@ModelAttribute(value = "todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/";
  }

}
