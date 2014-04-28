import java.util.ArrayList;
import java.util.Random;

public class WarRules
{
   private final ArrayList<Card> p1 = new ArrayList<Card>();
   private final ArrayList<Card> p2 = new ArrayList<Card>();
   final int FULLDECK = 52;
   final int HALFDECK = 26;
   
   Deck deck = new Deck();
   Random rand = new Random();
   
   
   public WarRules()
   {
      System.out.println("This is a game of War");
      System.out.println("This game requires 2 players");
   }
   
   public void createDecks()
   {
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
   }
   
   public Object getP1TopCard()
   {
      Object card = p1.get(0);
      return card;
   }
   
   public Object getP2TopCard()
   {
      Object card = p2.get(0);
      return card;
   }
   
   //public boolean isGreater(Object card1, Object card2)
   // {
//       Object p1Card = getP1TopCard();
//       Object p2Card = getP2TopCard();
//       
//       int p1CardCount = p1Card.getRank();
//       int p2CardCount = p2Card.getRank();
//       
//       
//       if (p1Card > p2Card)
//       {
//          return true;
//       }
//       else
//       {
//          return false;
//       }
//    }
     
   public static void main(String [] args)
   {
      WarRules war = new WarRules();
      
      war.createDecks();
      
      Object a = war.getP1TopCard();
      Object b = war.getP2TopCard();
      
      System.out.println(a);
      System.out.println(b);
      
   }
}