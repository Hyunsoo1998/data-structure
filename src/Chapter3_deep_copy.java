import java.util.Arrays;

public class Chapter3_deep_copy {
public static void main(String[]args) {
	String[] folderA = {"myComputer","myDocument"};
	String[] folderB = new String[folderA.length];
	System.out.println("[사본 배열의 값 변경 전] 원본 배열: " + Arrays.toString(folderA));

	//배열의 요소들을 각각 저장
	for(int i = 0; i<folderA.length; i++) {
		folderB[i] = folderA[i];
	}
	folderB[0]="newFolder"; // 사본 배열의 첫 번째 인덱스 값 변경
	System.out.println("[사본 배열의 값 변경 후] 원본 배열:" + Arrays.toString(folderA));
	System.out.println("[사본 배열의 값 변경 후] 사본 배열:" + Arrays.toString(folderB));
}
}
//얕은 복사를 피하기 위해서 새 배열을 생성하고 원본 배열의 요소 값들을 저장해 주어야 하며, 사본 배열의 값이 변경되더라도
//원본 배열의 값은 보존 되어야 한다. 이것을 깊은복사(deep copy)라고 한다.
