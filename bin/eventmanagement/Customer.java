package bin.eventmanagement;

import java.util.*;

//testing 

public class Customer {
    private String name;
    private String email;
    private String contactNo;
    private String address;
    private ArrayList complaint;
    private ArrayList feedback;
    String query;
    String request;

    private void BookEvent() {
        ;
    }

    private void CancelBooking(int eventID) {
        System.out.println("canceld event with event id: " +  eventID);
    }

    public String Track(int eventID) {
        String placeholder = "The food and seating arrangments are being made";
        return placeholder;
    }

    private void Complaint(String temp) {
        complaint.add(temp);
    }

    private void FeedBack(String temp) {
        feedback.add(temp);
    }

    private void Query(String temp) {
        this.query = temp;
        System.out.println("your query has been sent");
    }

    public float ViewBill() {
        float placeholder = 1.01f;
        return placeholder;
    }

    private void SendRequest(String temp) {
        this.request = temp;
        System.out.println("your query has been sent");
    }

    private void CancelOrder() {
        ;
    }
}