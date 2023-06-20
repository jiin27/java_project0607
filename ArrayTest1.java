class ArrayTest1{

	public static void main(String[] args){
		/*js는 배열 선언시 크기를 명시하지 않아도 되지만
		대부분의 프로그래밍 언어에서는 배열 선언시엔 반드시 그 크기를 명시하는 게 원칙이다.
		숫자
			정수 byte < short < int < long
			실수 float < double
		문자
			문자 char
			문자열 String
		논리값 boolean
		*/

		int[] arr=new int[4];
		arr[0]=5;
		arr[1]=8;
		arr[2]=9;
		arr[3]=12;

		//for문을 이용하여 모든 요소를 출력하시오.
		//Sytem.out.println();
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}