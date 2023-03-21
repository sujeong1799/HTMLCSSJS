package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 3개의 값을 담을 수 있는 String배열 생성후 
		 * 국어, 영어, 수학이라는 글자 담은 후 출력
		 * */
		/* 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 이후 추가/삭제가 불가능
		 * 배열의 길이를 늘리거나, 줄이고 싶을 경우 배열복사 ArrayCopy를 이용
		 * */
		
		
		String[] arr = new String[3];
		arr[0]="국어";
		arr[1]="영어";
		arr[2]="수학";
		// 적는값이 다 틀려서 for문써서 못넣음 하나씩 써줘야함
		
		//향상된 for문써서 출력
		for(String tmp : arr) {
			System.out.print(tmp+" ");

		}
		System.out.println();
		
		//사회, 과학 추가 // 추가하려면 더 큰 배열을 만들어서 이사시켜야한다.
//		String arr2[] = arr;  // 하나의 객체를 공유 출력하면 주소 똑같음
		String arr2[] = new String[6]; // 더 큰 배열 생성
		System.out.println(arr);
		System.out.println(arr2); // 
		
		// arr2안에는 null null null null null null이던걸  arr을 넘겨받아
		// 앞에 3개는 국어 영어 수학으로 채워짐
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i]; // arr배열을 arr2번 배열로 넘길거야.
		}
		
		for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		
		//내가 담고자하는 범위를 []안에 넣고 늘릴만큼 +,* 하면됨
		String arr3[] = new String[arr.length*2]; //기존 arr배열보다 2배 많은 크기
//		System.arraycopy(복사할 배열, 시작번지, 새 배열, 시작번지, 개수);
		System.arraycopy(arr, 0, arr3, 0, arr.length); // arr에 있는거 전부. arr3안에 넣어주세요 
		for(String tmp : arr3) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		System.arraycopy(arr, 0, arr3, 1, arr.length-1); // arr에 있는거 전부. arr3안에 넣어주세요 
		for(String tmp : arr3) {
			System.out.print(tmp+" ");
		}
		
	}

}
