package chap_06;

public class _Quiz_06 {

    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenDate(name, 1));
        System.out.println("주민등록번호 : " + getHiddenDate(id, 8));
        System.out.println("전화번호 : " + getHiddenDate(phone, 9));
    }

    private static String getHiddenDate(String str, int number) {
        String sub = str.substring(0, number);
        for (int i = number; i < str.length(); i++) {
            sub += "*";
        }
        return sub;
    }

}
