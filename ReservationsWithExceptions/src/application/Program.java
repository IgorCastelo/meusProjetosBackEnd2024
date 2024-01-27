package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
		System.out.println("Rom number:");
		int number = sc.nextInt();
		System.out.println("Check-in date:");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-out date:");
		Date  checkOut = sdf.parse(sc.next());
		
		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		
		System.out.println();
		System.out.println("Enter the date to update the reservaion: ");
		System.out.println("Check-in date (dd/MM/yyyy)");
		checkOut = sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy)");
		
		reservation.updateDates(checkIn, checkOut);
		System.out.println("Reservation: " + reservation);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation"+ e.getMessage());
		}
		catch(RuntimeException e ) {
			System.out.println("Unexpected error");
		}
		
		
		}	
}
