
public class chapter3_loop_foreach {
public static void main(String[]args) {
	int[] students = {1,2,3,4,5,6,7,8,9,10};
	for(int studentNumber:students) {
		System.out.println("학생 번호:" + studentNumber);
	}
}
}
