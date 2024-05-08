package ra;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Xin chào các bạn lớp Java");
        Hello hello = new Hello();
        hello.methodOne();
        hello.methodTwo();
    }
    public void methodOne(){
        System.out.println("Đây là phương thức số 1");
        //Biến primitive
        int a = 10;
        //Biến references
        int[] arrInt = {1,3,5,7};
    }
    public void methodTwo(){
        System.out.println("Đây là phương thức số 2");
    }
}
