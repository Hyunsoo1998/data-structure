import java.util.Random;
public interface chapter3_loop_4 {
public static void main(String[]args) {
	Random random = new Random();
	final int ARRAY_LENGTH = 10;
	int []arr = new int [ARRAY_LENGTH];
	for (int i = 0 ; i< ARRAY_LENGTH; i++) { //배열의 크기만큼 돈다.
		boolean isPrimeNumber = true;
		int randomValue = random.nextInt(ARRAY_LENGTH); //난수생성
	if (randomValue == 1) {
		continue;
	}
	if(randomValue == 2) {
		arr[i] = randomValue;
		continue;
	}
	for (int j = 2; j < randomValue; j ++) {
		if (randomValue % j == 0) {
			isPrimeNumber = false;
			break;
		}
	}
	if (isPrimeNumber) {
		arr[i] = randomValue ;
	}	
	}
	System.out.println("[배열에 저장된 소수]");
	for(int k: arr) {
		if(k>0) {
			System.out.println(k);
		}
	}
	//zz

}
}
//10번만큼 반복하는 프로그램을 구현 해보았다. ARRAY_LENGTH = 10 배열의 크기를 담은 변수를 생성하고,
//소수를 배열에 담아야 하므로 arr이라는 참조 변수를 선언과 동시에 초기화를 해 주었다. 배열의 크기만큼
//반복을 시작하는데, 난수를 사용하기 위해 Random클래스에서 제공하는 nextInt(ARRAY_LENGTH)를 사용하고
//난수를 담을 수 있는 randomValue 변수를 생성했다. nextInt의 인수(argument)는 ARRAY_LENGTH를
//넘겨주었는데 0 부터 9까지의 난수를 반환하라는 의미이다.

//if(randomValue == 1) {
//	continue;
//}
//if(randomValue == 2) {
//	arr[i] = randomValue;
//	continue;
//}


// 소수를 구하기 위해선 2부터 해당 값을 나누어야 하는데 만약 1또는 2의 난수가 반환된 경우 굳이 소수를 확인하는
//로직을 사용할 필요는 없으므로, 배열에 저장한 뒤 continue로 아래 로직을 수행하지않고,

//for (int j = 2; j<randomValue ; j++) {
//	if(randomValue % j == 0) {
//		isPrimeNumber = false;
//		break;
//		
//	}
//}

//3이상의 난수가 반환되면 소수를 확인하기 위해 중첩된 for 문인 위의 로직을 수행한다.
//j는 2부터 시작하여 randomValue 보다 작을 때까지 계속 나누는데 한 번이라도 나눈 값이 0이 된다면,
//isPrimeNumber = false 로 초기화를 해 주고 break 문을 통해 빠져나온다
//is PrimeNumber 변수는 무분별한 반복을 피하기 위해 사용한 플래그이다.
//만약 10000의 난수가 생성되었다고 했을 때, isPrimeNumber를 사용하지 않는다면 이미 j =2에서
//소수가 아닌 것으로  판단이 되어도 j<randomValue의 조건을 만족할 때까지 의미없는 반복이 이루어진다