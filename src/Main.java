import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        double sum = 0;
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Nhap 1 so bat ky:");
//        int number = myObj.nextInt();
//        int i = 1;
//        while (i <= number) {
//            sum += (double) 1 / (i * i * i);
//            i++;
//        }
//        System.out.println(sum);
//    }
//}

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chiều cao: ");
//        int height = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Nhập độ dài bé:");
//        int smallWidth = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Nhập độ dài lớn:");
//        int bigWidth = Integer.parseInt(scanner.nextLine());
//
//        TwoSum twoSum = new TwoSum(height, smallWidth, bigWidth);
//        twoSum.calculateTwoSum();
//        System.out.println(twoSum);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the student's management number: ");
        //String studentManagementNumber = sc.nextLine();

        System.out.println("Enter the student's coverage score: ");
        Integer coverageScore = sc.nextInt();

        System.out.println("Enter the class's name ");
        String className = sc.next();

        System.out.println("Enter the student's age ");
        Integer age = sc.nextInt();

        System.out.println("Enter the student's name ");
        String studentName = sc.next();

        Student student = new Student(studentManagementNumber, coverageScore, age, className);
        student.checkAge();
        student.checkClass();
        student.checkCoverageScore();
        System.out.println(student);
    }
}