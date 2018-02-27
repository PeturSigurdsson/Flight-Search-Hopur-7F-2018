/*
    Klasi heldur utan um lista af flugum.
    Er með static aðferðir sem skila nýjum Flights hlut en
    er með falinn Constructor.
    
    Hefur samband við DatabaseController.

    Klasi inniheldur röðunaraðferðir fyrir lista af flugum.
    
 */
package containers;

import database.DatabaseQueries;
import datastructures.Flight;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author greta
 */
public class Flights {
    private final ArrayList<Flight> flights;
    
    private Flights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
    
    /**
     * Nær í öll flug frá milli tveggja flugvalla.
     * @param origin Fararstaður
     * @param destination Komustaður
     * @return 
     */
    public static Flights getAllFlightsToFrom(String origin, String destination) 
    {
        ArrayList<Flight> flights = DatabaseQueries.getFlightsToFrom(
                origin, destination
        );
        return new Flights(flights);
    }
    
    /**
     * Nær í öll flug frá origin, til destination á dagsetningu date
     * @param origin Fararstaður
     * @param destination Komustaður
     * @param date Dagsetning
     * @return 
     */
    public static Flights getFlightsToFromOnDate(
            String origin, String destination, Date date) 
    {
        ArrayList<Flight> flights = DatabaseQueries.getFlightsToFromOnDate(
            origin, destination, date
        );
        return new Flights(flights);
    }
    
    /**
     * Nær í öll flug á tímabili milli date1 og date2 (inclusive) frá
     * origin til destination
     * @param origin Fararstaður
     * @param destination komustaður
     * @param date1 dagsetning 1
     * @param date2 dagsetning 2
     * @return 
     */
    public static Flights getFlightsToFromBetweenDates(
            String origin, String destination, Date date1, Date date2) 
    {
        ArrayList<Flight> flights = DatabaseQueries.getFlightsToFromBetweenDates(
            origin, destination, date1, date2
        );
        return new Flights(flights);
    }
    
    /**
     * Skilar listanum yfir flugin sem Flights hlutur inniheldur.
     * @return 
     */
    public ArrayList<Flight> getFlights() {
        return flights;
    }
    
    /**
     * Raðar flugum eftir dagsetningu.
     * @param asc 
     */
    public void sortFlightsByDate(boolean asc) {
        if(asc)
            flights.sort(Comparator.comparing(Flight::getDateof));
        else
            flights.sort(Comparator.comparing(Flight::getDateof).reversed());
    }
    
    /**
     * Raðar flugum eftir verði
     */
    public void sortByPrice() {
        flights.sort(Comparator.comparing(Flight::getPrice));
    }
    
    /**
     * Raðar flugum eftir lengd.
     * @param asc 
     */
    public void sortByLength(boolean asc) {
        if(asc)
            flights.sort(Comparator.comparing(Flight::getTraveltime));
        else
            flights.sort(Comparator.comparing(Flight::getTraveltime).reversed());
    } 
    
    /**
     * Raðar flugum eftir tíma.
     * @param asc 
     */
    public void sortByTime(boolean asc) {
        if(asc)
            flights.sort(Comparator.comparing(Flight::getTimeof));
        else
            flights.sort(Comparator.comparing(Flight::getTimeof).reversed());
    }  
}
