import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WarGame
{
   public static void main(String [] args)
   {
      final int DECKSIZE = 52;
      final int HALFDECK = 26;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("This is a game of War");
      System.out.println("This game requires 2 players");
      
      ArrayList<Card> p1 = new ArrayList<Card>();
      ArrayList<Card> p2 = new ArrayList<Card>();
      
      Deck deck = new Deck();
      
      Random rand = new Random();
      
      for(int i = 0; i < HALFDECK; i++)
      {
         int length = deck.getSize();
         int aCard = rand.nextInt(length);
         Card foundCard = deck.popItem(aCard);
         p1.add(foundCard);
      }
      
      for(int i = 0; i < HALFDECK; i++)
      {
         int length = deck.getSize();
         int aCard = rand.nextInt(length);
         Card foundCard = deck.popItem(aCard);
         p2.add(foundCard);
      }
      
      System.out.println(p1.size());
      System.out.println(p2.size());
      
      
      
   }
}