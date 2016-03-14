package net.panchonet.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] myArray;// Declaracion
		//Si se usa asi se va a generar un erro porque no se inddico cuando se va a guardar
		//la forma correcta es la siguiente
		
		int[] myArray = new int[5]; //indices del 0-4
		myArray [2] = 5;
		myArray [4] = 3;
		System.out.println(myArray[2]);
		System.out.println(myArray[4]);
	}

}
