package demo.mvc_practive.fourth_controller;

import demo.mvc_practive.seccond_repository.IStudentRepository;
import demo.mvc_practive.third_service.IStudentsService;
import demo.mvc_practive.third_service.implement.StudentsService;

import java.util.Scanner;

public class StudentsController {
    public static void displayMenus(){
        IStudentsService studentsService = new StudentsService();
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display by name and id" +
                    "\n 2.Add" +
                    "\n 3.Edit" +
                    "\n 4.Delete" +
                    "\n 5.Search by name" +
                    "\n 6.Exit"
            );
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Code chức năng hiển thị");
                    studentsService.display();
                    break;
                case 2:
                    System.out.println("Code chức năng thêm mới");
                    studentsService.add();
                    break;
                case 3:
                    System.out.println("Code chức năng sửa");
                    break;
                case 4:
                    System.out.println("Code chức năng xoá");
                    studentsService.delete();
                    break;
                case 5:
                    System.out.println("Code chức năng xoá");
                    studentsService.searchByName();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}
