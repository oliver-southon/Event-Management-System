package bin;

import java.util.*;

import bin.eventmanagement.ManagePackage;

class app {
    public static void app(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // String overview = ManagePackage.GetOverview(); # doesnt work

        System.out.print("Select a package:\n >1. Family (up to 15 people)\n>2. Party (up to 50 people)\n >3. Grand (up to 150 people)")
        String choice = userInput.nextLine();
        if (choice == "1") {
            ;
        }

        else if (choice == "2") {
            ;
        }

        else if (choice == "3") {
            ;
        }

    }
}
