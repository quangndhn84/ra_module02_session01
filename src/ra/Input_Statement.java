package ra;

import java.util.Scanner;

public class Input_Statement {
    public static void main(String[] args) {
        //1. Khai báo đối tượng từ lớp Scanner (java.util)
        Scanner scanner = new Scanner(System.in);
        //2. Thông báo nhập dữ liệu (System.out.println, print, printf)
        System.out.println("Nhập vào mã sinh viên:");
        //3. Sử dụng các phương thức của lớp Scanner để lấy dữ liệu tương ứng lưu vào biến
        /*
         * nextLine(): lấy dữ liệu kiểu String
         * nextInt(): lấy dữ liệu kiểu int
         * nextFloat(): lấy dữ liệu kiểu float
         * nextDouble(): lấy dữ liệu kiểu double
         * nextBoolean(): lấy dữ liệu kiểu boolean
         * nextLine().charAt(0): lấy 1 ký tự đầu tiên (char)
         * */
        /*
        * Convert String --> các kiểu dữ liệu khác
        * String --> int: Integer.parseInt("String")
        * String --> float: Float.parseFloat("String")
        * String --> double: Double.parseDouble("String")
        * String --> boolean: Boolean.parseBoolean("String")
        * */
        String studentId = scanner.nextLine();
        //Nhập vào tên sinh viên
        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        //Nhập vào tuổi sinh viên
        System.out.println("Nhập vào tuổi sinh viên:");
//        int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
        //Nhập vào điểm trung bình của sinh viên
        System.out.println("Nhập vào điểm trung bình của sinh viên:");
//        float avgMark = scanner.nextFloat();
        float avgMark = Float.parseFloat(scanner.nextLine());
        //Nhập vào địa chỉ sinh viên
        System.out.println("Nhập vào địa chỉ sinh viên:");
        String address = scanner.nextLine();

        System.out.println("THÔNG TIN SINH VIEN:");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm TB: " + avgMark);
        System.out.println("Địa chỉ: " + address);
    }
}
