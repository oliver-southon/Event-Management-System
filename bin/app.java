package bin;

import java.util.*;

import bin.eventmanagement.*;


class app {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        // String overview = ManagePackage.GetOverview(); # doesnt work

        System.out.print("Select a package:" + Event.EventPackages());//this is used to display the inofrmation we are asking form the user
        String choice = userInput.nextLine();//this is used in order to store the users input
        System.out.print("Approximantly how many people will be attending?");//this is to ask how many people they are expecting at this event
        String tempNum = userInput.nextLine();//this is to store that number and choice
            Event.SelectPackage(choice, tempNum);//save the information entered by the user
            System.out.println("the package has been selected and put on the system with the approximate number of guests as: " + tempNum);//tell the user the state of the sytem
            
        System.out.print("Select a venue:" + Event.ViewVenue());//this shows the venues
        choice = userInput.nextLine();

        boolean chosen = true;

        while (!chosen){
            if (Event.Availability() == true ){// this is to check weather that event is avalible or not
                System.out.println("The venue is avalible and has been successfully booked");
                chosen = true;
            }else{//if not then the user keeps on trying

            System.out.println("Unforunatly the venue is not avalible that day please select another" + Event.ViewVenue());
            }
        }
        

        System.out.print("Select food:" + Event.ViewFoodMenu());//this prints out the food menu
        choice = userInput.nextLine();
        Event.SelectFood(choice);//the system stores the food option chosen
        System.out.println("your food menu has been selected");

        System.out.print("Would you like any optional services? please type \"yes\" or \"no\""  + Event.ViewOptional());//this is to make sure the user can pick optional services
        choice = userInput.nextLine();
        if (choice.compareToIgnoreCase("yes") == 0){//this does a check to see if the user is interseted 
            System.out.print("What service would you like?");
            choice = userInput.nextLine();
            Event.SelectOptionalService(choice);//this is used to store services onto the system
        }

        System.out.println("all your selections have been made the estimated cost of your event is $(placeholder)");//this prints out the initial cost from the user

    }
}

