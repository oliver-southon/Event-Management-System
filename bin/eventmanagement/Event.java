package bin.eventmanagement;

import java.util.*;

public class Event extends EventInfo{
    private String virtualTour;
    static String venueSelected;
    static String packageSelected;
    static String numOfPeople;
    static String foodPackageSelected;

    public static ArrayList<String> ViewVenue() {
        ArrayList venue = new ArrayList<String>();
        venue.add("Marvel Stadium");
        venue.add("ACMI");
        venue.add("RMIT");
        venue.add("Melbourne museum");
        return venue;
    }

    public static void SelectVenue(String p) {
        venueSelected = p;
    }

    public String VirtualTour() {
        String virtTour = "placeholder";
        return virtTour;
    }

    public boolean Inspection() {
        Boolean placeholder = true;
        return placeholder;
    }

    public static boolean Availability() {
        Boolean placeholder = true;
        return placeholder;
    }

    public static ArrayList<String> EventPackages() {
        ArrayList placeholder = new ArrayList<String>();
        placeholder.add("1. Family events (up to 15 people). $300 - $600");
        placeholder.add("2. Party events (up to 50 people). $800 - $1400");
        placeholder.add("3. Grand events (up to 150 people). $2000 - $3000");
        return placeholder;
    }

     public static void SelectPackage(String packageName, String temp) {
        packageSelected = packageName;
        numOfPeople = temp;
    }


    public static void SelectFood(String foodMenuName) {
        foodPackageSelected = foodMenuName;
    }
}


