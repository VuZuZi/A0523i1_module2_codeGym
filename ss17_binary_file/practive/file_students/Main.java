package ss17_binary_file.practive.file_students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void writeToFile(String path, List<Student> studentList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static List<Student> readFile(String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
//        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
//        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
//        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
//        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//
//        writeToFile("/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/students.csv",students);
        for (Student student: (students = readFile("/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/students.csv"))
             ) {
            System.out.println(student.toString());
        }
    }
}
