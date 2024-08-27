package model.Application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in: date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-in: date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());


            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.print("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.println();
            System.out.print("Check-in: date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Check-in: date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());


            reservation.updateDates(checkin, checkout);
            System.out.print("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage()); // esse get messagem é a mensagem passada para
            // " throw new IllegalArgument" passada na classe reservation )
        }


        sc.close();

    }
}
