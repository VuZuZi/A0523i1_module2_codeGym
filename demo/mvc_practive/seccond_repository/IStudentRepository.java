package demo.mvc_practive.seccond_repository;

import demo.mvc_practive.first_model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getListStudent();
    void addStudent(Student student);
    void updateStudentById(int id);
    void deleteStudent();
    Student searchById(int id);
    Student searchByName(String name);
}
