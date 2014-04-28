import java.util.ArrayList;
import java.util.Random;

public class WarRules extends Card
{
   private final ArrayList<Card> p1 = new ArrayList<Card>();
   private final ArrayList<Card> p2 = new ArrayList<Card>();
   final int FULLDECK = 52;
   final int HALFDECK = 26;
   
   
   Deck deck = new Deck();
   Random rand = new Random();
   
   
   public WarRules()
   {  
      super();
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
   
   public Card getP1TopCard()
   {
      Card card = p1.get(0);
      return card;
   }
   
   public Card getP2TopCard()
   {
      Card card = p2.get(0);
      return card;
   }
   
   public boolean isGreater(Card card2)
   {  
      boolean greater;
       
      Card p1Card = getP1TopCard();
      Card p2Card = getP2TopCard();
       
      boolean status = p1Card.greaterThan(p2Card);
      
      if (status == true)
      {
         greater = true;
      }
      else
      {
         greater = false;
      }
      
      return greater;
   }
     
   public static void main(String [] args)
   {
      WarRules war = new WarRules();
      
      war.createDecks();
      
      Card a = war.getP1TopCard();
      Card b = war.getP2TopCard();
      
      boolean c = a.greaterThan(b);
      boolean d = a.equals(b);
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      
   }
}