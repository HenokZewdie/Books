import java.util.ArrayList;
import java.util.Scanner;

public class booksArrayLilst {

	public static void main(String [] args){
		ArrayList <String> books = new ArrayList<String>();
		String userBook, toStop = "stop";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the List of Movies  ");
		do{
		userBook = input.nextLine();
		books.add(userBook);
		}while(!(toStop.equalsIgnoreCase(userBook)));
		System.out.println();
		System.out.println("Your Favorite movies are : ");
		System.out.println(); 
		for(int i=0; i<books.size()-1;i++){
			System.out.println(books.get(i));
		}
		input.close();
	}
}
