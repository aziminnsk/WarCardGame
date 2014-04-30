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
   
   public String getSuiteString(int theSuite)
   {
      String suited = ("empty");
      
      if (theSuite == SPADES)
      {
         suited = ("Spades");
      }
      else if (theSuite == CLUBS)
      {
         suited = ("Clubs");
      }
      else if (theSuite == HEARTS)
      {
         suited = ("Hearts");
      }
      else if (theSuite == DIAMONDS)
      {
         suited = ("Diamonds");
      }
      
      return suited;
   }
   
   /**
      This method returns a string telling teh rank and suit of the card
      @param none
   */
   
   public String toString()
   {
  
      String toString = ("This card is the " + rank + " of " + getSuiteString(suit));
      
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
   
   /**
      This method compares two card objects and 
      checks to see which is greater. 
      @param status boolean value telling if it is greater or lesser than
   */
   
   public boolean greaterThan(Card object2)
   {
      boolean status;
      
      if (this.rank > object2.rank)
         status = true;
      else
         status = false;
         
      return status;
   }
   
   public String getPic()
   {
      String fileName = null;
      
      if (suit == SPADES)
      {
         switch (rank)
         {
            case 1:
               fileName = "aces.jpg";
               break;
            case 2:
               fileName = "2s.jpg";
               break;
            case 3:
               fileName = "3s.jpg";
               break;
            case 4:
               fileName = "4s.jpg";
               break;
            case 5:
               fileName = "5s.jpg";
               break;
            case 6:
               fileName = "6s.jpg";
               break;
            case 7:
               fileName = "7s.jpg";
               break;
            case 8:
               fileName = "8s.jpg";
               break;
            case 9:
               fileName = "9s.jpg";
               break;
            case 10:
               fileName = "10s.jpg";
               break;
            case 11:
               fileName = "jacks.jpg";
               break;
            case 12:
               fileName = "queens.jpg";
               break;
            case 13:
               fileName = "kings.jpg";
               break;
         }
      }
      else if (suit == CLUBS)
      {
         switch (rank)
         {
            case 1:
               fileName = "acec.jpg";
               break;
            case 2:
               fileName = "2c.jpg";
               break;
            case 3:
               fileName = "3c.jpg";
               break;
            case 4:
               fileName = "4c.jpg";
               break;
            case 5:
               fileName = "5c.jpg";
               break;
            case 6:
               fileName = "6c.jpg";
               break;
            case 7:
               fileName = "7c.jpg";
               break;
            case 8:
               fileName = "8c.jpg";
               break;
            case 9:
               fileName = "9c.jpg";
               break;
            case 10:
               fileName = "10c.jpg";
               break;
            case 11:
               fileName = "jackc.jpg";
               break;
            case 12:
               fileName = "queenc.jpg";
               break;
            case 13:
               fileName = "kingc.jpg";
               break;
         }
      }
      else if (suit == HEARTS)
      {
         switch (rank)
         {
            case 1:
               fileName = "aceh.jpg";
               break;
            case 2:
               fileName = "2h.jpg";
               break;
            case 3:
               fileName = "3h.jpg";
               break;
            case 4:
               fileName = "4h.jpg";
               break;
            case 5:
               fileName = "5h.jpg";
               break;
            case 6:
               fileName = "6h.jpg";
               break;
            case 7:
               fileName = "7h.jpg";
               break;
            case 8:
               fileName = "8h.jpg";
               break;
            case 9:
               fileName = "9h.jpg";
               break;
            case 10:
               fileName = "10h.jpg";
               break;
            case 11:
               fileName = "jackh.jpg";
               break;
            case 12:
               fileName = "queenh.jpg";
               break;
            case 13:
               fileName = "kingh.jpg";
               break;
         }
      }
      else if (suit == DIAMONDS)
      {
         switch (rank)
         {
            case 1:
               fileName = "aced.jpg";
               break;
            case 2:
               fileName = "2d.jpg";
               break;
            case 3:
               fileName = "3d.jpg";
               break;
            case 4:
               fileName = "4d.jpg";
               break;
            case 5:
               fileName = "5d.jpg";
               break;
            case 6:
               fileName = "6d.jpg";
               break;
            case 7:
               fileName = "7d.jpg";
               break;
            case 8:
               fileName = "8d.jpg";
               break;
            case 9:
               fileName = "9d.jpg";
               break;
            case 10:
               fileName = "10d.jpg";
               break;
            case 11:
               fileName = "jackd.jpg";
               break;
            case 12:
               fileName = "queend.jpg";
               break;
            case 13:
               fileName = "kingd.jpg";
               break;
         }
      }
      
      return fileName;
   }
   
   public static void main(String [] args)
   {
      Card card = new Card(1,12);
      Card card2 = new Card(2,10);
      
      boolean a = card.greaterThan(card2);
      
      System.out.println(a);
      
   }
}