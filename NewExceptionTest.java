public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러메세지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 후 다시 설치하시기 바랍니다.");
        } catch (MemoryException me) {
            System.out.println("에러메세지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    } // End Main

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치공간이 부족함.");
        if (!enoughMemory())
            throw new MemoryException("메모리 부족");
    }

    static void copyFiles() {
        /* 파일들을 복사하는 코드 */ }

    static void deleteTempFiles() {
        /* 임시파일들을 삭제하는 코드 */}

    static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드
        return true;
    }
} // End NewExceptionTest

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}