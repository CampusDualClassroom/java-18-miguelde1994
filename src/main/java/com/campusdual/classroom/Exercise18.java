package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {
		int array[] = createAndInitializeArray(5);
		showInlineArray(array);

	}

	static int[] createAndInitializeArray(int num){
		int[] array = new int[num];
		for (int i = 0; i < num; i++)
			array[i] = i+1;

		return array;
	}

	static void showInlineArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			if(i != array.length-1){
				System.out.print(" ");
			}
		}
	}
}
