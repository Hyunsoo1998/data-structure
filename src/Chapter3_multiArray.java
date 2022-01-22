
//다차원 배열

//저장할 자료형을 선정한 뒤, 배열 안의 배열을 생성해주면 된다.
//행의 크기는 2이고, 열의 크기는 1인 배열을 생성해보자.
//int [][] arr = new int[2][1];
//첫번째[]는 행의 크기를, 두번째 []는 열의 크기를 나타낸다.
//arr의 참조변수는 두개의 배열로 이루어진 하나의 배열을 참조하고 있으며, arr[0]과 arr[1]두 참조변수는
//어느 연속으로 나열된 메모리 공간을 참조하고있다.
//그래서 arr배열 안에는 두 개의 배열이 존재한다. arr.length를 확인하면 arr배열의 크기인2가 반환된다.
//2차원 배열을 생성만 해 두고 각각초기화를 할 수 있다.



public class Chapter3_multiArray {
public static void main(String[]args) {
	int [][]arr = {//선언과 동시에 초기화
			{1,2,3,},{4,5,6},{7,8,9}
	};
	int [][] arr2 = new int[2][3]; //생성 후 기본값 초기화
	
	arr2[0][0]=1;
	arr2[0][1]=2;
	arr2[0][2]=3;
	arr2[1][0]=4;
	arr2[1][1]=5;
	arr2[1][2]=6;
	System.out.println("arr의 크기:" + arr.length);
	System.out.println("arr2의 크기: " + arr2.length);
	
}
}
