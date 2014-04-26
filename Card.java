/**
   Alex Ziminski
   23/2/14
   This class stores card values and can compare them   
*/

public class Card
{
   //fields
   static final int SPADES = 1, CLUBS = 2, HEARTS = 3, DIAMONDS = 4;
   static final int ACE = 1, KING = 13, QUEEN = 12, JACK = 11;
   int rank;
   int suit;
   
   /**
      Default Constructor. Takes no arguments
   */
   
   public Card()
   {
      rank = 0;
      suit = 0;
   }
   
   /**
      Default Constructor. Accepts 2 arguments
      @param type is the suit of the card
      @param number is the rank of the card
   */
   
   public Card(int type, int number)
   {
      suit = type;
      rank = number;
   }
   
   /**
      this method returns the value stored in suit as an int
      @param none
   */
   
   public int getSuit()
   {  
      return suit;
   }
   
   /**
      This method returns the value stored in rank as an int
      @param none
   */
   
   public int getRank()
   {
      return rank;
   }
   
   /**
      This method returns a string telling teh rank and suit of the card
      @param none
   */
   
   public String toString()
   {
  
      String toString = ("This card is the " + rank + " of " + suit);
      
      return toString;
   }
   
   /**
      This method compares the two oobjects to see if they are equal
      @param Card object to be compared
   */
   
   public boolean equals(Card object2)
   {
      boolean status;
      
      if (this.rank == object2.rank)
         status = true;
      else
         status = false;
         
      return status;
   }
}