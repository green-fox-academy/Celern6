package com.greenfoxacademy.connectionwithsql.Controller;


import com.greenfoxacademy.connectionwithsql.Model.Assignee;
import com.greenfoxacademy.connectionwithsql.Model.Todo;
import com.greenfoxacademy.connectionwithsql.Repository.AssigneeRepo;
import com.greenfoxacademy.connectionwithsql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@Controller
public class TodoController {

  TodoRepository todoRepository;
  AssigneeRepo assigneeRepo;

  @Autowired
  public TodoController(TodoRepository todoRepository, AssigneeRepo assigneeRepo) {
    this.todoRepository = todoRepository;
    this.assigneeRepo = assigneeRepo;
  }


  @GetMapping("/todo")
  public String todoController() {
    return "todo";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) String isActive, Model model) {
    if (isActive == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else if (isActive.equals("false")) {
      model.addAttribute("todos", todoRepository.findAllByDoneIsFalse());
    } else if (isActive.equals("true")) {
      model.addAttribute("todos", todoRepository.findAllByDoneIsTrue());
    }
    return "todolist";
  }

  @GetMapping("/addTodo")
  public String addtodo() {
    return "createtodo";
  }

  @PostMapping("/addTodo")
  public String submitTodo(@ModelAttribute(value = "input") String input) {
    todoRepository.save(new Todo(input, false, false));
    return "redirect:/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable("id") Long id) {
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

  @GetMapping("/search")
  public String searchlist(@RequestParam(value = "content") String content, Model model) {
    model.addAttribute("todos", todoRepository.findByTitleContaining(content));
    return "todolist";
  }

  @GetMapping("/assignees")
  public String listAssignees(Model model){
    model.addAttribute("assignees", assigneeRepo.findAll());
    return "assigneelist";
  }

  @GetMapping("/assignees/{id}/delete")
  public String deleteAssignee(@PathVariable("id") Long id) {
    assigneeRepo.deleteById(id);
    return "redirect:/assignees";
  }

  @GetMapping("/addAssignee")
  public String createAssignee(Model model){
    model.addAttribute(new Assignee());
    return "createassignee";
  }

  @PostMapping("/addAssignee")
  public String submitAssignee(@ModelAttribute(value = "assignee") Assignee input) {
    assigneeRepo.save(input);
    return "redirect:/assignees";
  }
}
