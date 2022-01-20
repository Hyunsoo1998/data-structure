import java.util.Arrays;
//내림차순으로 배열을 출력
public class chapter3_loop_2 {
public static void main(String[]args) {
	int [] students= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("변경 전: " +Arrays.toString(students));

	int[]students2 = new int[students.length];
	for(int i = 0 ; i<students.length; i++) {
		students2[(students.length-1)-i] = students[i];
	}
	System.out.println("변경 후 : " +Arrays.toString(students2));

	//오름차순을 내림차순으로 바꾸는 것은 배열을 역순으로 만들면 된다.
	//역순으로 만들기 전 원본 배열을 출력후, 다음 생성할 students2라는 참조 변수를 
	//생성하는데, 배열의 크기는 students 와 동일하므로 students.length를 이용한다.

	
	
}
}
