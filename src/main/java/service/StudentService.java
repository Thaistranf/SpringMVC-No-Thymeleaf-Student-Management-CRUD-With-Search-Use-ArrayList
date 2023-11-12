package service;

import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService implements IStudentService{

    List<Student> findAll = new ArrayList<>();

    public StudentService(){
        findAll.add(new Student(1, "Nguyen Van A","1995-01-15", "nguyenvana@gmail.com", "Ha Noi", "0987654321", "C0822I1"));
        findAll.add(new Student(2, "Nguyen Van B","1997-11-22", "nguyenvanb@gmail.com", "Ninh Binh", "0987655321", "C0822I1"));
        findAll.add(new Student(3, "Nguyen Van C","1997-05-20", "nguyenvanc@gmail.com", "Vinh Phuc", "0987656321", "C0922H1"));
        findAll.add(new Student(4, "Nguyen Van D","1998-09-09", "nguyenvand@gmail.com", "Ha Noi", "0987657321", "C0922H1"));
        findAll.add(new Student(5, "Nguyen Van E","1996-01-30", "nguyenvane@gmail.com", "Quang Ninh", "0987658321", "C1022I1"));
    }
    @Override
    public List<Student> findAll() {
        return findAll;
    }

    @Override
    public Student findById(int id) {
        for (Student student: findAll) {
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
//        student.setId((int)(Math.random() * 100));
        findAll.add(student);
    }

    @Override
    public void update(int id, Student student) {
        Student student1 = findById(id);
        student1.setName(student.getName());
        student1.setDateOfBirth(student.getDateOfBirth());
        student1.setEmail(student.getEmail());
        student1.setAddress(student.getAddress());
        student1.setPhone(student.getPhone());
        student1.setClassroom(student.getClassroom());
    }

    @Override
    public void delete(int id) {
        Student student1 = findById(id);
        if (student1 != null){
            findAll.remove(student1);
        }
    }

    @Override
    public List<Student> search(String keyword) {
        return findAll.stream().filter(student -> student.getName().toLowerCase()
                .contains(keyword.toLowerCase())).collect(Collectors.toList());
    }
}
