import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WarGame
{
   public static void main(String [] args)
   {
      final int DECKSIZE = 53;
      final int HALFDECK = 27;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("This is a game of War");
      System.out.println("This game requires 2 players");
      
      ArrayList<Card> p1 = new ArrayList<Card>();
      ArrayList<Card> p2 = new ArrayList<Card>();
      
      Deck deck = new Deck();
      
      Random rand = new Random();
      
      for(int i = 0; i < HALFDECK; i++)
      {
         int aCard = rand.nextInt(DECKSIZE);
         
         p1.add(aCard);
      }
      
      
      
   }
}