package bin.eventmanagement;

import java.util.*;

//testing 

public class Customer {
    private String name;//stores the name of the customer in this system
    private String email;//stores the email of customer
    private String contactNo;//stores the contact number of the customer
    private String address;//stores the address of the customer
    private ArrayList complaint;//is used to send a complaints to the system
    private ArrayList feedback;// is used to send feedback to the system
    String query;//is used to send queries to the manager
    String request;// this is used to send requests to the evenet manager

    private void BookEvent() { //this is used for the system to handling booking using all the varibales
        ;
    }

    private void CancelBooking(int eventID) { // this is used to cancle the event booking form the system
        System.out.println("canceld event with event id: " +  eventID);
    }

    public String Track(int eventID) {//this is used by the customer to track how much progress has been made in the sytem
        String placeholder = "The food and seating arrangments are being made";
        return placeholder;
    }

    private void Complaint(String temp) {//this function is used to send in complaints
        complaint.add(temp);
    }

    private void FeedBack(String temp) {// this function is used to send in feedback through the system
        feedback.add(temp);
    }

    private void Query(String temp) {// this is used to send a query into the system
        this.query = temp;
        System.out.println("your query has been sent");
    }

    public float ViewBill() {// this is used so that the customer can view the bill that is stored on the system
        float placeholder = 1.01f;
        return placeholder;
    }

    private void SendRequest(String temp) {//this is used by the customer in order to send a request through to the manager
        this.request = temp;
        System.out.println("your query has been sent");
    }

    private void CancelOrder() { // this function is used to cancel an order in the system
        ;
    }
}