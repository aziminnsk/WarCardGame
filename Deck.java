import java.util.ArrayList;

public class Deck
{
   private ArrayList<Card> deck = new ArrayList<Card>();
   private final int SUITES = 5;
   private final int CARDS = 14;
   
   public Deck()
   {
      for (int i = 1; i < SUITES; i++)
      {
         for(int c = 1; c < CARDS; c++)
         {
            Card card = new Card(i,c);
            deck.add(card);
         }
      }
   }
   
   public static void main(String [] args)
   {
      Deck deck = new Deck();
   }
}