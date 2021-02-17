import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) {
        File f = createFile("");
        System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("유효한 파일이름이 아닙니다.");
            }
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createFile(f);
            return f;
        }
    }

    static void createFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {
        }
    }
}
