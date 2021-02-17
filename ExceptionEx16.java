import java.io.File;

public class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File f = createFile("test");
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시 입력해 주세요.");
        }
    } // End Main

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("유효한 파일이름이 아닙니다.");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}