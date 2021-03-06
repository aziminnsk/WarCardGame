import java.util.Scanner;

public class WarGame
{
   int weiner;
   WarRules rules = new WarRules();
   String pic1, pic2;
   String gameWinner = "Still no Winner";
   
   /**
      Default constructor. Initiates the creatDecks method and
      prepares them for the game
   */
   
   public WarGame()
   {
      rules.createDecks();
   }
   
   /**
      This method is used to process a turn and determine who
      won and add cards to the correct deck.
      @param gameOverMan checks whether or not the game is over
      @param equaled checks the cards are equal
      @param greater checks to see if the player 1 card is higher than player 2's card
      @param turnWinner int used to tell who won
   */
   
   public int turn()
   {  
      boolean gameOverMan = rules.isEmpty();
      boolean equaled;
      boolean greater;
      int turnWinner = 0;
      String p1IconCard, p2IconCard;
         
      if (gameOverMan == true)
      {
         weiner = rules.findWinner();
         if (weiner == 1)
         {
            gameWinner = "Player 1 wins!";
            System.out.println("Player 1 wins!");
         }
         else if (weiner == 2)
         {
            gameWinner = "Player 2 wins!";
            System.out.println("Player 2 wins!");
         }
         else
         {
            System.out.println("Error.");
         }
      }
      else
      {
         rules.p1Turn();
         rules.p2Turn();
         
         Card rightCard = new Card();
         Card leftCard = new Card();
         
         if(rules.p1DeckSize() == 0)
         {
            System.out.println("Player 2 wins");
         }
         else
         {
            leftCard = rules.getP1TopCard();
            p1IconCard = leftCard.getPic();
            pic1 = leftCard.getPic();
            System.out.println(p1IconCard);
            System.out.println(leftCard);
         }
         
         if(rules.p2DeckSize() == 0)
         {
            System.out.println("Player 1 wins");
         }
         else
         {         
            rightCard = rules.getP2TopCard();
            p2IconCard = rightCard.getPic();
            pic2 = rightCard.getPic();
            System.out.println(p2IconCard);
            System.out.println(rightCard);
         }
         
         equaled = leftCard.equals(rightCard);
         greater = leftCard.greaterThan(rightCard);
         
         if (equaled == true)
         {
            rules.returnCards();
            int champion = rules.weGotAWar();
            
            if(champion == 1)
            {
               turnWinner = 1;
               System.out.println("Player 1 won the war.");
            }
            else if (champion == 2)
            {
               turnWinner = 2;
               System.out.println("Player 2 won the war.");
            }
         }
         else
         {
            if(greater == true)
            {
               turnWinner = 1;
               rules.p1Win();
               System.out.println("player 1 won that round.");
            }
            else
            {
               turnWinner = 2;
               rules.p2Win();
               System.out.println("player 2 won that round.");
            }
         }
         
      }
      
      return turnWinner;  
      
   }
   
   /**
      This method finds the size of the
      deck and returns it
      @param size the int value for the size of the deck
      @return size the int
   */
   
   public int p1DeckSize()
   {
      int size = rules.p1DeckSize();
      return size;
   }
   
   /**
      This method finds the size of the
      deck and returns it
      @param size the int value for the size of the deck
      @return size the int
   */
   
   public int p2DeckSize()
   {
      int size = rules.p2DeckSize();
      return size;
   }
   
   /**
      This method finds the top card and prints it
      @param combatant the top card being played
   */
   
   public void p1Played()
   {
      Card combatant = rules.getP1TopCard();
      System.out.println(combatant);
   }
   
   /**
      This method finds the top card and prints it
      @param combatant the top card being played
   */
   
   public void p2Played()
   {
      Card combatant = rules.getP2TopCard();
      System.out.println(combatant);
   }
   
   /**
      This method retrieves teh file name
      for the image file
      @return pic1 String for the file name
   */
   
   public String getPicFile1()
   {  
      return pic1;
   }
   
   /**
      This method retrieves the filename
      for the image file of the second card
      @return pic2 String for the file name
   */
   
   public String getPicFile2()
   {  
      return pic2;
   }
   
   /**
      This method gets the string for 
      the winner
      @return gameWinner the string telling the winner
   */
   
   public String getWinnerString()
   {
      return gameWinner;
   }
   
   public static void main(String [] args)
   {
      WarGame game = new WarGame();
      Scanner keyboard = new Scanner(System.in);
      String blank = "y";
      while (blank != "n")
      {
         game.turn();
         System.out.println(game.p1DeckSize());
         System.out.println(game.p2DeckSize());
         System.out.println("press enter for next turn or type 'n'");
         blank = keyboard.nextLine();
      }
   }
}