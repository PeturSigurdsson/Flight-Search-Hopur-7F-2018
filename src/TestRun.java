
import containers.Flights;
import database.DatabaseQueries;
import datastructures.Flight;
import datastructures.Seat;
import datastructures.User;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import utils.Utilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author greta
 */
public class TestRun {
    public static void main(String[] args) throws ParseException {
            Flights flights = Flights.getAllFlightsToFrom("Reykjavík", "Akureyri");
            
            for(Flight f : flights.getFlights()) {
                for(Seat s : f.getSeats()) {
                    System.out.printf("Seat %s on flight %s is %s\n", s.getSeatId(),
                            f.getFlno(), s.isBooked() ? "booked" : "empty");
                }
            }
            
            

            System.out.println(DatabaseQueries.newUser("1234567890", "testUser"));
            User user = DatabaseQueries.getUser("1234567890");
            System.out.println(user.getName());
        
    }
}
