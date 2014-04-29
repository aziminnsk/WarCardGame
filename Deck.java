import java.util.ArrayList;

/**
   This class is used to create
   a deck from the Card class
   @param deck ArrayList holding the Card objects
   @param SUITES the number of suites in the a deck
   @param CARDS the number of cards per suite
*/

public class Deck extends Card
{
   private ArrayList<Card> deck = new ArrayList<Card>();
   private final int SUITES = 5;
   private final int CARDS = 14;
   
   /**
      Default Constructor. Creates a 52 card deck
      @param card Card object adding cards to array.
   */
   
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
   
   /**
      This method gets a card from
      the deck.
   */
   
   public Card getCard(int index)
   {
      return deck.get(index);
   }
   
   /**
      This method returns the size of the deck
      arraylist
      @return deck.size() returns the size of the array list
   */
   
   public int getSize()
   {
      return deck.size();
   }
   
   /**
      This method returns a card from the array
      while also removing it from an array
   */
   
   public Card popItem(int index)
   {
      Card card = deck.get(index);
      deck.remove(index);
      return card;
   }
   
   
   
   public static void main(String [] args)
   {
      Deck deck = new Deck();
      
      System.out.println("done");
   }
}