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
    ArrayList FoodAvalible = new ArrayList<String>();
    ArrayList placeholder = new ArrayList<String>();

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

    public ArrayList<String> ViewFoodMenu() {
        FoodAvalible.add("Food Option 1");
        FoodAvalible.add("Food Option 1");
        FoodAvalible.add("Food Option 1");
        return FoodAvalible;
    }

    public ArrayList<String> ViewOptional() {
        placeholder.add("Music Band");
        placeholder.add("Flowers");
        placeholder.add("Sound System");
        return placeholder;
    }

    private void SelectOptionalService(String service) {
        System.out.println("the optional service of " + service + " has been selected and put on the sytem");
    }
}
