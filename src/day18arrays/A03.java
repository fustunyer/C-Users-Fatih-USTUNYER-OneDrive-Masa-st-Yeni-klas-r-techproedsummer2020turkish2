package day18arrays;

public class A03 {

	public static void main(String[] args) {

		String s[]= {"Ali","Can","Veli"};

		System.out.println(s[1]);//Can
		
		int arr[]=new int[2];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		char arr1[]=new char[5];
		System.out.println(arr1.length);
		
		
		float arr2[]= {15,1,25,23,15.2f,15.85f};
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"-");
		}
	}

}
