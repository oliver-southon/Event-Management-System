package bin.eventmanagement;

import java.util.*;

abstract class OrganiseEvent extends Employee {
    private boolean bookedVenue;
    private boolean MadeSeatingArrangements;

    public ArrayList<String> ViewComplaints() {
        ArrayList placeholder = new ArrayList<String>();
        // stuff here
        return placeholder;
    }

    public void TextCustomer(String message) {
        ;
    }

    public ArrayList<String> ViewCustomerQueries() {
        ArrayList placeholder = new ArrayList<String>();
        // stuff here
        return placeholder;
    }

    public String GetEmail() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetAddress() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetName() {
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetCustomerContactNum() {
        String placeholder = "placeholder";
        return placeholder;
    }

    private void SendCustomerChanges(String changeInfo) {
        ;
    }
}
