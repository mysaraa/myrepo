import java.util.Scanner;

public class InputOutput {
	Scanner scanner=new Scanner(System.in);
	static int size;
	public InputOutput() {
		// TODO Auto-generated constructor stub
	}
	
	int[] getinput(){
		System.out.println("insert size");
		int size=scanner.nextInt();
		int []array=new int[size];
		System.out.println("insert numbers");
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
			
		}
	return	array;
	}

}
