public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception(); // 강제적으로 예외 발생시킴. 하지만 예외처리는 하지 않음.
    }
    // 예외가 발생했을 때, main, method1, method2가 모두 호출스택에 있었는데
    // method2가 예외처리를 하지 않고 자신을 호출한 method1에게 예외처리를 넘기고 종료.
    // method1 또한 마찬가지로 예외처리를 하지 않고 자신을 호출한 main에 넘기고 종료.
    // 그럼 마지막으로 main에서 예외처리를 해주어야 하지만 이 또한 하지 않고 종료.
    // 이로 인해서 프로그램이 비정상 종료됨.
    // 예외가 발생한 곳에서 예외를 처리하지 않고 자신을 호출한 메소드에게 넘겨줄 수는 있지만
    // 어느 한 곳에서는 반드시 예외처리를 해주어야 한다.

}
