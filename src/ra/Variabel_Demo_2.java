package ra;

public class Variabel_Demo_2 {
    public static void main(String[] args) {
        //1. Khai báo các biến mã sinh viên và tên sinh viên
        //Sytax: Datatype + VariableName
        String studentId;
        String studentName;
        //2. Khởi tạo giá trị cho biến mã sinh viên là SV001, tên sinh viên là Nguyễn Văn A
        //Syntax: Variable = Value
        studentId = "SV001";
        studentName = "Nguyễn Văn A";
        /*
        * 3. Khai báo và khởi tạo giá trị cho các biến giới tính là nam, địa chỉ là Hà Nội,
        * điểm trung bình là 8.7, biến xếp loại là 1 trong các giá trị G, M, L,
        * tuổi sinh viên có giá trị là 18
        * */
        //Syntax: Datatype + VariableName = Value
        boolean sex = true;
        String address = "Hà Nội";
        float avgMark = 8.7F;
        char rank = 'G';
        int age = 18;
        //4. Khai báo 2 biến số nguyên có giá trị là 10 và 20 trong cùng 1 câu lệnh
        int firstNumber = 10, secondNumber = 20;
        //5. Khai báo hằng số điểm qua môn của sinh viên là 5.0
        //Syntax: final + Datatype + constantName = value
        final float MARK_PASS = 5.0F;
    }
}
