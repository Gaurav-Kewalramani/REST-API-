package assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import assignment2.service.StudentService;
import assignment2.student.Student;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {

        return studentService.add(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {

        return studentService.getAll();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {

        return studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteStudent(@PathVariable String id) {

        return studentService.delete(id);
    }
}
