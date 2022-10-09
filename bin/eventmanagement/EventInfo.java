package bin.eventmanagement;

import java.util.*;

abstract class EventInfo {
    private String packageType;
    private String venues;
    private int bill;
    private String foodOptions;
    private int eventID;
    private String customerName;
    private String customerEmail;
    private String customerContactNum;
    private String address;
    private String customFoodMenu;
    private String requests;
    private String canceledOrder;
    private static String serviceString;
    static ArrayList FoodAvalible = new ArrayList<String>();
    static ArrayList placeholder = new ArrayList<String>();

    public String GetVenue() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetEventID() {
        String placeholder = "15367658";
        return placeholder;
    }

    public String GetCustomFood() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public static ArrayList<String> ViewFoodMenu() {
        FoodAvalible.add("Food Option 1");
        FoodAvalible.add("Food Option 2");
        FoodAvalible.add("Food Option 3");
        return FoodAvalible;
    }

    public static ArrayList<String> ViewOptional() {
        placeholder.add("Music Band");
        placeholder.add("Flowers");
        placeholder.add("Sound System");
        return placeholder;
    }

    public static void SelectOptionalService(String service) {
        serviceString = service;
        System.out.println("the optional service of " + service + " has been selected and put on the sytem");
    }
}
