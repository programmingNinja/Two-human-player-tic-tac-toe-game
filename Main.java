
import java.util.Scanner;

/**
 * Description:
 * This is a tic-tac-toe game. The main method initializes the game world in which the entire game is played.
 * The main method creates the instance of the game world, and the constructor of the game world runs the entire game.
 */

/**
 *
 * @author Rohan
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    
    static void about()
    {
        System.out.println("About entered");
    }
    
    static void instructions()
    {
        System.out.println("Instructions entered");
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        GameState cont = null ;
        int choice; 
        do{

            System.out.println("MENU:");
            System.out.println("--------------------");
            System.out.println("1) About");
            System.out.println("2) Intructions");
            System.out.println("3) Play Game");
            System.out.println("4) Exit");
            System.out.println("--------------------");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    about();
                    break;

                case 2:
                    instructions();
                    break;

                case 3:
                    GameWorld newGame = new GameWorld();
                    cont = newGame.getState();
                    break;

                case 4:
                    break;
                    
                default: 
                    System.out.println("Please enter a valid input");
                    choice = 0;
            }
        }
        while(choice >= 0 && choice<4 || cont != null);
        
    }
    
}
