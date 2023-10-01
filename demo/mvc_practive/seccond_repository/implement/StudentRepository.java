package demo.mvc_practive.seccond_repository.implement;

import demo.mvc_practive.first_model.Student;
import demo.mvc_practive.seccond_repository.IStudentRepository;
import demo.mvc_practive.util.ReadAndWriteFile;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    Scanner sc = new Scanner(System.in);
    private final String PATH = "/Users/vuzuzi/Documents/GitHub/module2/demo/mvc_practive/data/Students.csv";
    @Override
    public List<Student> getListStudent() {
        List<Student> studentList = new ArrayList<>();
        //
        List<String> listString = ReadAndWriteFile.readFile(PATH);
        String[] arr = null;
        for (String s:listString) {
            arr = s.split(",");
            Student student = new Student(Integer.parseInt(arr[0]),arr[1],arr[2]);
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        List<String> stringList = null;
        stringList.add(student.getInforToCSV());
        ReadAndWriteFile.writeFile(PATH,stringList,true);
    }

    @Override
    public void updateStudentById(int id) {
        List<Student> studentList = getListStudent();
        for (Student student: studentList) {
            if (student.getId()==id){
                System.out.println("1 - Update Name");
                System.out.println("2 - Update Class Name");
                System.out.println("3 - Exit");
                System.out.print("Your option: ");
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        System.out.print("Old name: "+student.getName()+" name to chang: ");
                        student.setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Old class name: "+student.getName()+" class name to chang: ");
                        student.setClassName(sc.nextLine());
                        break;
                }
            }
        }
        List<String> stringList = null;
        for (Student student:studentList
             ) {
            stringList.add(student.getInforToCSV());
            stringList.add("\n");
        }
        ReadAndWriteFile.writeFile(PATH,stringList,false);
    }


    @Override
    public void deleteStudent() {

    }

    @Override
    public Student searchById(int id) {
        return null;
    }

    @Override
    public Student searchByName(String name) {
        return null;
    }
}
