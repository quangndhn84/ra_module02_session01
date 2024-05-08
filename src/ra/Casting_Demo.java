package ra;

public class Casting_Demo {
    public static void main(String[] args) {
        int number1 = 10;//int - 4 bytes
        double number2;//doublt - 8 bytes
        //Implicit Casting: ép kiểu ngầm định - chương trình ngầm hiểu - Ép kiểu dữ liệu thấp lên cao
        number2 = number1;
        int number3;
        double number4 = 5.6;
        //format code: Ctrl + alt + L
        //Explicit Casting: ép kiểu tường minh - LTV tự ép kiểu - Ép kiểu dữ liê từ cao xuống thấp
        number3 = (int)number4;
    }
}
