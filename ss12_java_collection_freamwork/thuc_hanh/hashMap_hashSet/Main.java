package ss12_java_collection_freamwork.thuc_hanh.hashMap_hashSet;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("a",1,"a");
        Student s2 = new Student("b",2,"b");
        Student s3 = new Student("c",3,"c");
        Student s4 = new Student("d",4,"d");
        Student s5 = new Student("e",5,"e");
        Student s6 = new Student("e",6,"e");
        Student s7 = new Student("e",7,"e");

        Map<Integer,Student> studentsMap = new HashMap<>();
        studentsMap.put(6,s6);
        studentsMap.put(7,s7);
        studentsMap.put(1,s1);
        studentsMap.put(3,s3);
        studentsMap.put(4,s4);
        studentsMap.put(5,s5);
        studentsMap.put(2,s2);


        for (Map.Entry<Integer,Student> student: studentsMap.entrySet()
             ) {
            System.out.println(student.toString());
        }
    }
}
