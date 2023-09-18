package ss12_java_collection_freamwork.thuc_hanh.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("a",1,"a");
        Student s2 = new Student("b",2,"b");
        Student s3 = new Student("c",3,"c");
        Student s4 = new Student("d",4,"d");
        Student s5 = new Student("e",5,"e");
        Student s6 = new Student("e",6,"e");
        Student s7 = new Student("e",7,"e");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s7);
        list.add(s6);
        list.add(s2);
        list.add(s3);
        list.add(s5);
        list.add(s4);

        for (Student s:list
        ) {
            System.out.println(s.toString());
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().compareTo(o2.getName()) == 0){
                    return o1.getAge()-o2.getAge();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student s:list
             ) {
            System.out.println(s.toString());
        }
    }
}
