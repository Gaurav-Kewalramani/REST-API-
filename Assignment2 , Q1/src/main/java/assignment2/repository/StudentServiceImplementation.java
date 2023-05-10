package assignment2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment2.repository.StudentRepository;
import assignment2.service.StudentService;
import assignment2.student.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository StudentRepository;

    @Override
    public Student add(Student student) {
        return StudentRepository.insert(student);
    }

    @Override
    public List<Student> getAll() {
        return StudentRepository.findAll();
    }

    @Override
    public Student update(Student school) {

        return StudentRepository.save(school);
    }

    @Override
    
    /*public ResponseEntity deleteStudent (String id) {
     * 	Optional<Student> student = this.StudentRepository.findById(id);
     * 	if (student.isPresent()) {
     * 		this.StudentRepository.deleteById(id);
     * 		return ResponseEntity.ok("success");
     *   }
     *   else
     * 		return ResponseEntity.ok("student not found");
     * }
     * 
     */
    public Map<String, String> delete(String id) {

        int beforeDelete = (int) StudentRepository.count();

        StudentRepository.deleteById(id);

  
        int afterDelete = (int) StudentRepository.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }
}
