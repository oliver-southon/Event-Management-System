package bin.eventmanagement;

import java.util.*;

abstract class OrganiseEvent extends Employee {
    private boolean bookedVenue;//this is check if the venue is booked
    private boolean MadeSeatingArrangements;// this is to check if seating arrangments have been made

    public ArrayList<String> ViewComplaints() {// this is to view the complaints by the customer
        ArrayList placeholder = new ArrayList<String>();
        // stuff here
        return placeholder;
    }

    public void TextCustomer(String message) {// this is used in order to contact the customer
        ;
    }

    public ArrayList<String> ViewCustomerQueries() {// this is to view the custoemer's queries
        ArrayList placeholder = new ArrayList<String>();
        // stuff here
        return placeholder;
    }

    public String GetEmail() {// this is used to get the email o fhte custoemr
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetAddress() {// this is used in order to get the address of the customer
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetName() {// this is used in order to get the customers name
        String placeholder = "placeholder";
        return placeholder;
    }

    public String GetCustomerContactNum() {// this function is used in order to get the customers contact number
        String placeholder = "placeholder";
        return placeholder;
    }

    private void SendCustomerChanges(String changeInfo) {// this function is used in order to send the customer any changes
        ;
    }
}
