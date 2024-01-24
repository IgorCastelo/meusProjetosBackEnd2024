package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitities.Circle;
import entitities.Rectangle;
import entitities.Shape;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Shape> list= new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i= 1; i<=n; i++) {
			System.out.println( "Shape #" + i +" data: ");
			System.out.println("Rectangle or Circle(r/c)?");
			char type = sc.next().charAt(0);
			System.out.println("Color (BLACK,BLUE,RED): ");
			
			if(type=='r') {
				System.out.println("Width: ");
				Double wigth = sc.nextDouble();
				System.out.println("Heigth: ");
				Double heigth = sc.nextDouble();
				
				list.add(new Rectangle(null, wigth, heigth));
			}else {
					System.out.println("Radius: ");
					Double radius = sc.nextDouble();
									
					list.add(new Circle(null, radius));
				}
			}
			}
			
		
	}

}
