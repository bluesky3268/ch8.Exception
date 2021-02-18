public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();
        }
    } // End Main

    // deleteTempFiles()는 예외발생하든 안하든 실행되어야 하는 메소드이다.
    // finally블럭을 사용. -> 예외발생여부에 관계없이 try블럭의 문장을 실행하는 동안 finally블럭을 실행하게 함.

    static void startInstall() {
        /* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
    }

    static void copyFiles() {
        /* 파일들을 복사한 코드를 적는다. */}

    static void deleteTempFiles() {
        /* 임시파일들을 삭제하는 코드를 적는다. */}
}
