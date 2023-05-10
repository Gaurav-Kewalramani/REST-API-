package assignment2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import assignment2.student.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}

