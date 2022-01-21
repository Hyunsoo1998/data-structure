import java.util.Arrays;

public class Chapter3_copy {
public static void main(String[]args) {
	String [] folderA = {"myComputer","myDocument"};
	String [] folderB = folderA;
	System.out.println("[사본 배열의 값 변경전] 원본배열: "+Arrays.toString(folderA));

	folderB[0] = "newFolder";// 사본 배열의 첫번째(0번째) 인덱스 값 변경 
	System.out.println("[사본 배열의 값 변경후] 원본 배열: "+Arrays.toString(folderA));
	System.out.println("[사본 배열의 값 변경후] 사본 배열: "+Arrays.toString(folderB));
}
}
//배열의 복사 부분인 9번째 줄 folderB[0]= "newFolder"로 변경했기 때문에 folderB의 참조 변수 값만 바뀌는줄 알았다.
//위 코드에 출력 결과는 folderA배열과 folderB둘다 바뀐 참조변수의 값으로 출력된다.
//이는 Call by reference Call by Value를 따른것이다.
//변수는 무조건 주소를 저장하는데, 배열이나 Object와 같은 메모리가 큰 변수들은 Value 값들을 복사하는 것이아닌,
//주소값을 저장(복사)하기 때문에 String[] folderB= folderA 에서 folderB는 folderA와 같은 주소값을 같게된다.
//그로 인해서 folderA와 folderB는 같은 주소값을 갖고, 같은 주소에서 참조 변수를 변경했기때문에 
//folderA와 folderB는 동시에 참조변수들이 바뀐다. 이는 Call by Reference를 따른것이다.
//이는 메소드에 Object를 넣었을때도 작용하기 때문에 매우 중요한 개념이다.
//사본 배열의 값을 변경했을 뿐인데, 원본 배열의 값도 변경이 되어 서로 같은 배열의 공간을 바라보고 있는것을 알 수있다.
//위와 같은 경우는 원본의 보존성을 유지하지 못한다. 이것을 얕은복사(shallow copy)라고 한다.