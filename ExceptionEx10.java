public class ExceptionEx10 {
    public static void main(String[] args) {
        throw new Exception();
        // Exception클래스와 그 자손들은 예외처리가 되어야 할 부분에 되지 않으면 컴파일이 되지 않음.
        // 하지만 RuntimeException의 경우, 예외처리를 하지 않아도 컴파일은 성공함. 하지만 실행결과는
        // Exception이 발생하여 비정상 종료되게 됨.
        // 이렇듯 Exception클래스와 그 자손은 컴파일러가 예외처리를 확인한다고 해서 checked Exception
        // RuntimeException은 확인하지 않는다고 해서 unchecked Exception이라고 한다.
    }
}
