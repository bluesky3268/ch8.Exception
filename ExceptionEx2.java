/**
 * ExceptionEx1
 */
public class ExceptionEx1 {

    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10); // 0으로는 나눌 수 없기 때문에 예외발생함.
            System.out.println(result);
        }
    }
}