package array;

public class ArraySinka {
    public static void main(String[] args) {
        // 2행 3열짜리 배열을 가정
        int rows = 2;
        int columns = 3;

        // i는 순서대로 들어갈 숫자
        int i = 1;

        // 외부 for문 = '행(row)'을 제어
        for (int row = 0; row < rows; row++) {
            System.out.println("▶ 행(row) " + row + " 시작!");

            // 내부 for문 = '열(column)'을 제어
            for (int column = 0; column < columns; column++) {
                System.out.println("  → arr[" + row + "][" + column + "] = " + i);
                i = i + 1;   // 다음 숫자로 이동
            }

            // 내부 for문이 다 끝난 뒤 실행
            System.out.println("◎ 행(row) " + row + " 완료!\n");
        }

        System.out.println("✅ 모든 반복이 끝났습니다!");
    }
}
