package controller;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;
    public StudentController(){
        studentService = new StudentService();
    }

    @GetMapping("/list")
    public ModelAndView showList(){
        List<Student> studentList = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("listStudent", studentList);
        return modelAndView;
    }

    @GetMapping("/create-form")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("newStudent", new Student());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(Student student){
        studentService.save(student);
        return ("redirect:/students/list");
    }

    @GetMapping("/update/{id}")
    public ModelAndView showFormUpdate(@PathVariable int id){
        Student student = studentService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/update");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping
    public String update(Student student){
        studentService.update(student.getId(), student);
        return ("redirect:/students/list");
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        studentService.delete(id);
        return ("redirect:/students/list");
    }

    @GetMapping("/search")
    public String search(@RequestParam("keyword") String keyword, Model model){
        List<Student> listStudent = studentService.search(keyword);
        model.addAttribute("students", listStudent);
        return "/list";
    }
}
