package Date1105;

public class TestRef {
    public static void main(String[] args) {
        int grade = 1;
        int coupon = 0; // 초기값 설정!

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            // 다른 경우도 추가 가능
            default:
                coupon = 0;
        }

        System.out.println("もらったクーポンは " + coupon);
    }
}
