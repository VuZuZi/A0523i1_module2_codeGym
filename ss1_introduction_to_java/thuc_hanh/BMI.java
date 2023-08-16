package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng của bạn: ");
        double weight = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều cao của bạn: ");
        double height = Double.parseDouble(sc.nextLine());
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        System.out.println(bmi);

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
