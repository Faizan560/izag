package first;
//import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;

public class Rectangle {

	public Rectangle() {
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Area A = new Area();
		Rectangle c = new Rectangle();
		int length,breath;
//		Scanner sc = new Scanner (System.in);
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name = br.readLine();
		
		int no = Integer.parseInt( br.readLine());
		}
		catch (Exception e) {
			
		}
		
//		System.out.println("enter lentgh");
//		length= sc.nextInt();
//		System.out.println("enter breaath");
//		breath=sc.nextInt();
//		A.setDim(length,breath);
//		int area = A.getArea();
//		a.setArea(dim);
		//System.out.println("area of rectangle is "+area);
	}
}