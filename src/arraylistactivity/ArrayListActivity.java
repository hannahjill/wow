package arraylistactivity;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListActivity {

    public static void main(String[] args) {
        ArrayList <activity> players = new ArrayList <>();
        Scanner scn = new Scanner (System.in); 
        String continueAdding;
        
        do {
            System.out.println("Enter Player Number: ");
            int playerNumber = scn.nextInt();
            scn.nextLine();
            
            System.out.println("Enter Player Name: ");
            String Name = scn.nextLine();
            
            System.out.println("Enter Player Score: ");
            int score = scn.nextInt();
            scn.nextLine();
            
            players.add(new activity(playerNumber, Name, score));
            
            System.out.println("Do You Want To Add Another Player? (yes/no): ");
            continueAdding = scn.nextLine();
        }while (continueAdding.equalsIgnoreCase("yes"));
        
        System.out.println("\nPlayers Added: ");
        for (activity Player : players) {
            System.out.println(Player);
        }
    }
}
