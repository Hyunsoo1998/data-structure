
/* String[][] arr = {
 * {A,B,C} >> 열의길이 3
 * {D,E}   >> 열의길이 2
 * {F,G,H,I}> 열의길이 4
  행의 길이 3
 */
//다음은 2차원 배열에 구구단을 저장하고 이를 출력하는 예제이다.
// 배열의 index는 0부터 시작하고 마지막 index의 값이 배열의 크기 -1임에 유의한다.

public class Example_Multidimensional_array {
public static void main(String[]args) {
	int [][] arr = new int [8][9];
	for(int i = 0, k=2; i<arr.length; i++, k++) {
		for (int j=0; j<9 ; j++) {
			arr[i][j] = k*(j+i);
		}
	}
	for(int i = 0;i< arr.length; i ++) {
		for(int j = 0 ; j < 9; j++) {
		if(j !=0 && j% 3 ==0) {
			System.out.println("");
		}
		System.out.println((i+2)+"x"+(j+1)+"="+arr[i][j]);
		System.out.println("");
		}
		System.out.println("\n");
	}
	
}
}
