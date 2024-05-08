package ra;

public class Output_Statements {
    public static void main(String[] args) {
        //1. System.out.println("String"): in ra dữ liệu "String", sau khi in ra sẽ xuống dòng
        //-In ra câu Xin chào các bạn lớp Java
        System.out.println("Xin chào các bạn lớp Java");
        //2. System.out.print("String"): in ra dữ liệu "String", sau khi in ra không xuống dòng
        //-In ra câu chúc các bạn có việc sau khi học xong khóa học
        System.out.print("Chúc các bạn có việc sau khi học xong khóa học");
        //3. System.out.printf("Control String",value1,value2....): in ra chuỗi có định dạng
        //- Control String: Chuỗi chứa các định dạng dữ liệu cần in
        /*
         * int - %d
         * float,double - %f
         * char - %c
         * String - %s
         * boolean - %b
         * */
        //- value1, value2 ...: trong chuỗi control String có bao nhiêu định dạng dữ liệu thì phải truyền từng đó giá trị tương ứng
        String studentId = "SV001";
        String studentName = "Nguyễn Văn A";
        int age = 18;
        float avgMark = 8.7F;
        System.out.printf("\nMã sinh viên: %s \t Tên SV: %s - Tuổi: %d - Điểm TB: %f",
                studentId, studentName, age, avgMark);
    }
}
