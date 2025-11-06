package array;

public class Array01 {
    public static void main(String[] args) {
            // 2x3 2차원 배열을 만듭니다.
            int[][] arr = new int[2][3];


            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 3; column++) {
                    System.out.print(arr[row][column] + " ");
                }
                System.out.println(); //한 행이 끝나면 라인을 변경한다.
            }

            for (int row = 0; row < arr.length; row++) {
                System.out.println("행 " + row + " 출력 시작");  // 디버깅용 메시지
                for (int column = 0; column < arr[row].length; column++) {
                    int value = arr[row][column];   // 중간 변수로 한 박자 거쳐가기
                    System.out.print(value + " ");
                }
                System.out.println();  // 줄바꿈
            }
            
        }
    }
