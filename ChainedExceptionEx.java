public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // End Main

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외발생.");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외발생.");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    } // End install()

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족함.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족함.");
            // throw new RuntimeException(new MemoryException("메모리가 부족함."));
        }
    } // End startInstall()

    static void copyFiles() {
        /* 파일들을 복사하는 코드 */}

    static void deleteTempFiles() {
        /* 임시파일들을 삭제하는 코드 */}

    static boolean enoughSpace() {
        // 설치하는데 필요한 공간 확인 코드
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리 확인 코드
        return true;
    }
} // End ExceptionTest

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

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