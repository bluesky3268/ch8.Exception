public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) { // Exception e를 쓰면 모든 예외 처리 가능함.
            System.out.println(5);
        }
        System.out.println(6);
        // 0으로 나눌 수 없는 예외가 발생했기 때문에 4를 출력하지 않고 catch블럭으로 이동후 catch블럭 내 문장들을 수행
        // 모든 예외는 Exception 클래스의 자손임. 그렇기 때문에 catch블럭 ()안에 Exception클래스 타입의 참조변수를 둔다면
        // 어떤 종류의 예외도 처리할 수 있음.
    }

}
