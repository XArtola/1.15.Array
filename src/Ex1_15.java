/**
 * 
 */

/**
 * @author ik013043z1
 *
 */import java.util.Scanner;
public class Ex1_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		 String array1[];
		 String sentence;
		 
		 
		 System.out.print("Enter a sentence to separete its words:\n");
		
		 sentence = scan.nextLine();
		 
		 /*split
		  * The split command takes a string and separates its tokens every ("val") we choose
		  * in this case it separates tokens every hello
		  */
		 
		 array1 = sentence.split("hello");
		 
		 System.out.print(array1[2]+"\n");
		 
		 /*toCharArray
		  * This command takes a string an converts it into a array
		  * In this case the user enters a sentence an each character on it is stored in the array separated
		  * The first print will be the character in the second space of the array [1] and the second print is whole array
		  * WARNING!!!!! The array index starts from 0
		  */
		 System.out.println("Enter a sentence\n");
		 
		 String sentence2;
		 
		 sentence2 = scan.nextLine();
		 
		 
		 char array2[];
		 
		 array2 = sentence2.toCharArray();
		 
		 System.out.println(array2[1]+"\n");
		 System.out.println(array2);
		 
	}

}
