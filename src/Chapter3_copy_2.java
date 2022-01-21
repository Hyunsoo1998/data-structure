import java.util.Arrays;

//깊은 복사를 다루는 방법은 앞 코드처럼 직접 구현할 수 있지만, 코드량이 늘어날 수있고, 예외처리를 직접 해주어야 하는 불편함이 있다.
//java 에서는 배열 복사를 지원하는 여러가지 메서드를 제공한다.
//1. clone()
//2.System.arraycopy(Object src,intsrcPos,Object dest, int destPos, int length)
//3.Arrays.copyOf()
//4.Arrays.copyRange()

public class Chapter3_copy_2 {
public static void main(String[]args) {
	String[] folderA = {"myComputer","myDocument","recycleBin"};
	System.out.println("clone()메서드 호출");
	
	String[] folderB = folderA.clone();
	folderB[0]= "newFolder";
	
	System.out.println("원본 배열: " + Arrays.toString(folderA));
	System.out.println("사본 배열: " + Arrays.toString(folderB));

	System.out.println("\nsystem.arrayCopy() 메서드 호출");
	String[] folderC = new String[folderA.length];
	System.arraycopy(folderA, 0, folderC, 0, 2);
	folderC[0] = "newFolder";

	System.out.println("원본 배열: " +Arrays.toString(folderA));
	System.out.println("사본 배열: " +Arrays.toString(folderC));

	System.out.println("\nArrays.copyOf() 메서드 호출");
	
	String[] folderD = Arrays.copyOf(folderA, 1);
	folderD[0] = "newFolder";
	System.out.println("원본 배열: " + Arrays.toString(folderA));
	System.out.println("사본 배열: " + Arrays.toString(folderD));
	
	System.out.println("\nArrays.copyOfRange()메서드 호출");
	String[] folderE= Arrays.copyOfRange(folderA, 0, 1);
	folderE[0] = "newFolder";
	System.out.println("원본 배열: " + Arrays.toString(folderA));
	System.out.println("사본 배열: " + Arrays.toString(folderE));
}
}
