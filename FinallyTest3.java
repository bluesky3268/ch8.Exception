public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1()의 수행을 마치고 main메소드로 돌아왔습니다.");
    }// End Main

    static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            return; // 메소드 종료.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally블럭이 실행되었습니다.");
        }
    }
    // try블럭에서 return문을 만나서 종료되는 경우에도 finally블럭의 문장들이 먼저 실행 된 후 메소드를 종료함.
}
