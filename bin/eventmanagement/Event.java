package bin.eventmanagement;

import java.util.*;

public class Event extends EventInfo{
    private String virtualTour;
    String venueSelected;
    String packageSelected;
    int numOfPeople;
    String foodPackageSelected;

    public ArrayList<String> ViewVenue() {
        ArrayList venue = new ArrayList<String>();
        venue.add("Marvel Stadium");
        venue.add("ACMI");
        venue.add("RMIT");
        venue.add("Melbourne museum");
        return venue;
    }

    private void SelectVenue(String p) {
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

    public boolean Availability() {
        Boolean placeholder = true;
        return placeholder;
    }

    public ArrayList<String> EventPackages() {
        ArrayList placeholder = new ArrayList<String>();
        placeholder.add("Family events (up to 15 people). $300 - $600");
        placeholder.add("Party events (up to 50 people). $800 - $1400");
        placeholder.add("Grand events (up to 150 people). $2000 - $3000");
        return placeholder;
    }

    private void SelectPackage(String packageName, int numOfPeople) {
        packageSelected = packageName;
        this.numOfPeople = numOfPeople;
    }


    private void SelectFood(String foodMenuName) {
        foodPackageSelected = foodMenuName;
    }
}


