package bin.eventmanagement;

import java.util.*;

public class Event extends EventInfo{
    private String virtualTour;//this will store the link of virtual tours for venues
    static String venueSelected;// this hold the information that the user has entered
    static String packageSelected;// this is so that the package the user has chosen remains on the system
    static String numOfPeople;// this holds the amount of people coming to the event
    static String foodPackageSelected;// this showcases the food options selected by the customers

    public static ArrayList<String> ViewVenue() {// this is so that the customer can view the venue
        ArrayList venue = new ArrayList<String>();
        venue.add("Marvel Stadium");
        venue.add("ACMI");
        venue.add("RMIT");
        venue.add("Melbourne museum");
        return venue;
    }

    public static void SelectVenue(String p) {// this function stores the customers venue location
        venueSelected = p;
    }

    public String VirtualTour() {// this gives the customer the link for the virtual tour of the chosen venue
        String virtTour = "placeholder";
        return virtTour;
    }

    public boolean Inspection() {// this functions makes it clear if a physical inspection is avalible 
        Boolean placeholder = true;
        return placeholder;
    }

    public static boolean Availability() {// this function is used within the system to check if the venue is avalible during the day selected
        Boolean placeholder = true;
        return placeholder;
    }

    public static ArrayList<String> EventPackages() {// this function is designed to display the packages
        ArrayList placeholder = new ArrayList<String>();
        placeholder.add("1. Family events (up to 15 people). $300 - $600");
        placeholder.add("2. Party events (up to 50 people). $800 - $1400");
        placeholder.add("3. Grand events (up to 150 people). $2000 - $3000");
        return placeholder;
    }

     public static void SelectPackage(String packageName, String temp) {// this function stores the selected user data in the system
        packageSelected = packageName;
        numOfPeople = temp;
    }


    public static void SelectFood(String foodMenuName) {// this function selects the users food choice
        foodPackageSelected = foodMenuName;
    }
}


