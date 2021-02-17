public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
        // 예외가 발생하지 않았기 때문에 catch문을 거치지 않고 빠져나와서 6을 출력.
    }

}
