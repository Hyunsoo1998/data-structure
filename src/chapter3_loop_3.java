import java.util.Random;

//100개의 랜덤한 값을 저장한 배열에서 최솟값과 최대값을 구하는 코드

//1. 100개의 데이터를 일일이 입력하는 것은 비효율적이기 때문에 난수 생성을 지원하는
// Random클래스를 사용한다.

public class chapter3_loop_3 {
public static void main(String[]args) {
Random random = new Random();
final int ARRAY_LENGTH = 100;
int[]arr = new int[ARRAY_LENGTH];
for(int i =0 ; i<ARRAY_LENGTH; i++) {
	arr[i] = random.nextInt(100);
}
int min = 0;
int max = 0;
for (int k:arr) {
	if(min > k) {
		min = k;
		}else if (max < k) {
		 max = k;
		}
}
System.out.println("최솟값: " + min);
System.out.println("최댓값: " + max);
}
}
//random.nextInt(100);에서 메소드 호출에 사용되는 인수(argument)를 보면 100이라는
//정수 값을 넘겨주고있다. 인자 (parameter)를 받는 nextInt는 0부터 받은인자 (parameter)-1까지
//난수를 반환한다는 의미이며, 위 코드에서 0부터 99까지의 난수를 반환한다는 의미이다.
//nextInt() 메서드에서 인수를 넘겨주지 않는다면 int 32bit 범위만큼의 난수를 반환한다.
// 최솟값과 최댓값을 저장할 두 개의 변수 int min = 0; int max=0; 을 선언과 동시에 0으로 초기화 해주었다.
//값을 구하기 위해 배열의 요소들에 모두 접근하므로 for 문이 아닌 foreach 문을 사용했다.
//K변수는 각각의 배열 요소들이 저장되는 변수이다. 최솟값을 구하기 위해 if 문의
// min>K에서 min 값이 k보다 클 경우 현재 k 값이 작은 수이므로 min변수에 저장한다.
// else if 문의 max<k 에서 k가 max보다 큰 값이면 max 변수에 값을 저장한다.
// 이렇게 배열의 크기만큼 반복하면 최종적으로 min변수에는 최솟값이 저장되고, max 변수에는 최댓값이 저장된다.

