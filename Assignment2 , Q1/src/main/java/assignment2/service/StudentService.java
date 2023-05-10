package assignment2.service;

import org.springframework.stereotype.Service;

import assignment2.student.Student;

import java.util.List;
import java.util.Map;

@Service
public interface StudentService {

    Student add(Student school);

    List<Student> getAll();

    Student update(Student school);

    Map<String, String> delete(String id);

}
