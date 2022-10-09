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

    public String GetVenue() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetEventID() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetCustomFood() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public ArrayList<String> ViewFoodMenu() {
        ArrayList placeholder = new ArrayList<String>();
        // stuff here
        return placeholder;
    }

    public ArrayList<String> ViewOptional() {
        ArrayList placeholder = new ArrayList<String>();
        // stuff here
        return placeholder;
    }

    private void SelectOptionalService(String musicBand, String soundSystem, String flowers) {
        ;
    }
}
