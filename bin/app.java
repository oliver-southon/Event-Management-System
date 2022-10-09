package bin;

import java.util.*;

import bin.eventmanagement.*;


class app {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        // String overview = ManagePackage.GetOverview(); # doesnt work

        System.out.print("Select a package:" + Event.EventPackages());
        String choice = userInput.nextLine();
        System.out.print("Approximantly how many people will be attending?");
        String tempNum = userInput.nextLine();
            Event.SelectPackage(choice, tempNum);
            System.out.println("the package has been selected and put on the system with the approximate number of guests as: " + tempNum);
            
        System.out.print("Select a venue:" + Event.ViewVenue());
        choice = userInput.nextLine();
        if (Event.Availability() == true ){
            System.out.println("The venue is avalible and has been successfully booked");
        }else{

            System.out.println("Unforunatly the venue is not avalible that day please select another" + Event.ViewVenue());
        }
        

        System.out.print("Select food:" + Event.ViewFoodMenu());
        choice = userInput.nextLine();
        Event.SelectFood(choice);
        System.out.println("your food menu has been selected");

        System.out.print("Would you like any optional services? please type \"yes\" or \"no\""  + Event.ViewOptional());
        choice = userInput.nextLine();
        if (choice.compareToIgnoreCase("yes") == 0){
            System.out.print("What service would you like?");
            choice = userInput.nextLine();
            Event.SelectOptionalService(choice);
        }

        System.out.println("all your selections have been made the estimated cost of your event is $(placeholder)");

    }
}

