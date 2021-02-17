public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킴.");
            throw e; // 예외 발생 시킴.
        } catch (Exception e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료.");
        // Exception 인스턴스 생성 시, 생성자에 String을 넣어주면 원하는 에러메시지를 얻을 수 있음.
    }

}
