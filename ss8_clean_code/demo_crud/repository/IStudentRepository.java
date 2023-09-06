package ss8_clean_code.demo_crud.repository;


import ss8_clean_code.demo_crud.model.Student;

public interface IStudentRepository {
    Student[] getListStudent();
    void addStudent(Student student);
    void deleteStudentById(int id);
}
