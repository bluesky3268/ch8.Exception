public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메소드에 예외 발생.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        throw new Exception();
    }

}
