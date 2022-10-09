package bin.eventmanagement;

import java.util.*;

abstract class Employee extends OrganiseServices{
    private String name;//this stores the name of the employee
    private String Position;// this is to make sure only authorised users gain access to the system
    private String contactNo;// this is used to store an employees contact number

    public String ViewEventInfo() { // this is a function to view authorised information for the system
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetEventID() {// this gets the event ID for a specific user
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetCustomFood() {// this funciton is used in order to store custom food items in the menu
        String placeholder = "placeholder";
        return placeholder;
    }

    public static ArrayList<String> ViewSelectedOptionalService() {// this is used by the system to display options avalible to the user
        ArrayList placeholder = new ArrayList<String>();
        placeholder.add("flowers");
        placeholder.add("Sound system");
        placeholder.add("Music Band");
        return placeholder;
    }
}
