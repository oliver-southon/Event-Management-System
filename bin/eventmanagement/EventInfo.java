package bin.eventmanagement;

import java.util.*;

abstract class EventInfo {//this class stores all the event info for one event in order for the system to work properly
    private String packageType;// this varible stores the package tyep
    private String venues;// this varible stores the venues
    private int bill;// this varible stores the final amount
    private String foodOptions;// this holds the food opotions
    private int eventID; // this hold the event ID
    private String customerName;// this holds the customers names
    private String customerEmail;// this hold the customers email
    private String customerContactNum;// this holds the customers number
    private String address;// this hold the customers address for billing
    private String customFoodMenu;// this hold the food menu if the customer has one
    private String requests;// this hold all the requests of the customer
    private String canceledOrder;// this functino is used to delete the event
    private static String serviceString;//this is used in order to store what services they need
    static ArrayList FoodAvalible = new ArrayList<String>();// this is used to display the food avalible
    static ArrayList placeholder = new ArrayList<String>();//this is used to store the option deals

    public String GetVenue() {// this returns the menu of the event
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetEventID() {// this gets the event ID of the event
        String placeholder = "15367658";
        return placeholder;
    }

    public String GetCustomFood() {// this shows any custom food if there is any
        String placeholder = "placeholder";
        return placeholder;
    }

    public static ArrayList<String> ViewFoodMenu() {// this shows the food menu
        FoodAvalible.add("Food Option 1");
        FoodAvalible.add("Food Option 2");
        FoodAvalible.add("Food Option 3");
        return FoodAvalible;
    }

    public static ArrayList<String> ViewOptional() {//this shows the optional services avalible
        placeholder.add("Music Band");
        placeholder.add("Flowers");
        placeholder.add("Sound System");
        return placeholder;
    }

    public static void SelectOptionalService(String service) {//this is used by the system in order to store the optional service if any selected by the user
        serviceString = service;
        System.out.println("the optional service of " + service + " has been selected and put on the sytem");
    }
}
