package service;

import model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {
    List<Student> findAll();

    Student findById(int id);

    void save(Student student);
    void update(int id, Student student);
    void delete(int id);

    List<Student> search(String keyword);
}
