package ra;

public class Operators_Demo {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = firstNumber++;//Thơm,Anh: 11, Hồng, Danh, Thúy: 10
        int thirtNumber = ++firstNumber;//Danh, Thúy: 11, Anh:12
        System.out.println("Giá trị secondNumber: " + secondNumber);
        System.out.println("Giá trị thirtNumebr: " + thirtNumber);
    }
}
