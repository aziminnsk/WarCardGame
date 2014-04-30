import java.util.ArrayList; //import arraylist
import java.util.Random; //import random

/**
   This class extends the Card class
   The purpose is to create a set of rules that
   will be used in the game of War
   @param p1 ArrayList holding the cards of player 1
   @param p2 ArrayList holding the cards of player 2
   @param FULLDECk the highest amount of cards in a deck
   @param HALFDECk half the size of full deck
   @param deck Deck class initaiated
   @param rand Random number generator
*/

public class WarRules extends Card
{
   private final ArrayList<Card> p1 = new ArrayList<Card>();
   private final ArrayList<Card> p2 = new ArrayList<Card>();
   private final ArrayList<Card> p1Turn = new ArrayList<Card>();
   private final ArrayList<Card> p2Turn = new ArrayList<Card>();
   final int FULLDECK = 52;
   final int HALFDECK = 26;
   int theWinner = 0;
   
   
   Deck deck = new Deck();
   Random rand = new Random();
   
   /**
      Default Constructor. Initializes 
      the card class, and prints introduction 
      of the game.
   */
   
   public WarRules()
   {  
      super();
      System.out.println("This is a game of War");
      System.out.println("This game requires 2 players");
   }
   
   /**
      This method splits the main deck
      into 2 smaller decks which are given
      to each player.
      @param length int giving length of main deck
      @param aCard gives a random int
      @param foundCard Card object used with a random int and added to a deck
   */
   
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
   
   /**
      This method gets the top card from
      the player 1 deck
      @return card the first Card object in player 1's deck
   */
   
   public Card getP1TopCard()
   {
      Card card;
      
      if(p1Turn.size() == 0)
      {
         card = null;
      }
      else
      {
         card = p1Turn.get(0);
      }

      return card;
   }
   
   /**
      This method gets the top card from
      the player 2 deck
      @return card the first Card object in player 2's deck
   */
   
   public Card getP2TopCard()
   {
      Card card;
      
      if (p2Turn.size() == 0)
      {
         card = null;
      }
      else
         card = p2Turn.get(0);
      return card;
   }
   
   /**
      This method is used when a War occurs
      gets 3 cards and plays a 4th, with the winner
      taking all the cards
      @param winner the int determining who won the war
      @param war1 ArrayList holding player 1's cards for the war
      @param war2 ArrayList holding player 2's cards for the war
      @param scard1 holds the card while it is removed from the player's deck
      @param scard2 holds the card while it ir removed from the second player's deck
      @param gun1 holds the last card taken from the player's deck
      @param gun2 holds the last card taken from the second player's deck
      @param combat boolean determing who won the war
      @param prize holds the card from the war deck to be used
      @return winner returns the result of the war 
   */
   
   public int weGotAWar()
   {  
      int winner = 0;
      
      ArrayList<Card> war1 = new ArrayList<Card>();
      ArrayList<Card> war2 = new ArrayList<Card>();
      
      if (p1.size() > 3)
      {
         for (int i = 0; i < 4; i++)
         {
            Card scard1 = p1.get(i);
            p1.remove(i);
            
            war1.add(scard1);
         }
      }
      else
      {
         for (int i = 0; i < p1.size(); i++)
         {
            Card scard1 = p1.get(i);
            p1.remove(i);
            
            war1.add(scard1);
         }
      }
      
      if (p2.size() > 3)
      {
         for (int i = 0; i < 4; i++)
         {
            Card scard2 = p2.get(i);
            p2.remove(i);
            
            war2.add(scard2);
         }
      }
      else
      {
         for (int i = 0; i < p2.size(); i++)
         {
            Card scard2 = p2.get(i);
            p2.remove(i);
            
            war2.add(scard2);
         }
      }
      
      Card gun1 = war1.get(0);
      Card gun2 = war2.get(0);
      
      boolean combat = gun1.greaterThan(gun2);
      
      if (combat == true)
      {
         winner = 1;
         for (int i = 0; i < war1.size();)
         {
            Card prize = war1.get(i);
            p1.add(prize);
            war1.remove(i);
         }
         
         for (int i = 0; i < war2.size();)
         {
            Card prize = war2.get(i);
            p1.add(prize);
            war2.remove(i);
         }
      }
      else
      {
         winner = 2;
         for (int i = 0; i < war1.size();)
         {
            Card prize = war1.get(i);
            p2.add(prize);
            war1.remove(i);
         }
         
         for (int i = 0; i < war2.size();)
         {
            Card prize = war2.get(i);
            p2.add(prize);
            war2.remove(i);
         }
      }
      
      return winner;
   }
   
   /**
      Checks to see if either of the decks are empty
      and sets the winner.
      @param gameOver boolean determining if the game is over
      @return gameOver returns the result of the game
   */
   
   public boolean isEmpty()
   {
      boolean gameOver;
      
      if (p1.size() == 0 || p2.size() == 0)
      {
         gameOver = true;
         
         if (p1.size() == 0)
         {
            theWinner = 1;
         }
         else
         {
            theWinner = 2;
         }
      }
      else
      {
         gameOver = false;
      }
      
      return gameOver;
   }
   
   /**
      This method returns the winner of the
      game if there is one
      @return theWinner int representing winner of the game.
   */
   
   public int findWinner()
   {
      return theWinner;
   }
   
   /**
      This method takes two cards
      @param turnCard the card being used in the turn
   */
   
   public void p1Turn()
   {
      if (p1.size() > 2)
      {
         for(int i = 0; i < 2; i++)
         {
            Card turnCard = p1.get(i);
            p1Turn.add(turnCard);
            p1.remove(i);
         }
      }
      else
      {
         Card turnCard = p1.get(0);
         p1Turn.add(turnCard);
         p1.remove(0);
      }
      
   }
   
   /**
      This method takes two cards
      @param turnCard is the card that are being used in the turn
   */
   
   public void p2Turn()
   {
      if (p2.size() > 2)
      {
         for(int i = 0; i < 2; i++)
         {
            Card turnCard = p2.get(i);
            p2Turn.add(turnCard);
            p2.remove(i);
         }
      }
      else
      {
         Card turnCard = p2.get(0);
         p1Turn.add(turnCard);
         p2.remove(0);
      }
   }
   
   /**
      This method takes the cards from the turn
      arrays and adds them to the first
      player's deck
   */
   
   public void p1Win()
   {
      for(int i = 0; i < p1Turn.size();)
      {
         Card turnCard = p1Turn.get(i);
         p1.add(turnCard);
         p1Turn.remove(i);
      }
      
      for(int i = 0; i < p2Turn.size();)
      {
         Card turnCard = p2Turn.get(i);
         p1.add(turnCard);
         p2Turn.remove(i);
      }
   }
   
   /**
      This method takes the cards from the turn
      arrays and adds them to the second
      player's deck
   */
   
   public void p2Win()
   {
      for(int i = 0; i < p1Turn.size();)
      {
         Card turnCard = p1Turn.get(i);
         p2.add(turnCard);
         p1Turn.remove(i);
      }
      
      for(int i = 0; i < p2Turn.size();)
      {
         Card turnCard = p2Turn.get(i);
         p2.add(turnCard);
         p2Turn.remove(i);
      }
   }
   
   /**
      This method finds the size of the
      deck and returns it
      @param size the int value for the size of the deck
      @return size the int
   */
   
   public int p1DeckSize()
   {
      int size = p1.size();
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
      int size = p2.size();
      return size;
   }
   
   /**
      This method returns the cards that was taken
      and returns them to their decks
      @param badCard the cards from being played
   */
   
   public void returnCards()
   {
      for (int i = 0; i < p1Turn.size();)
      {
         Card badCard = p1Turn.get(i);
         p1.add(badCard);
         p1Turn.remove(i);
      }
      
      for (int i = 0; i < p2Turn.size();)
      {
         Card badCard = p2Turn.get(i);
         p2.add(badCard);
         p2Turn.remove(i);
      }
   }
      
   public static void main(String [] args)
   {
      WarRules war = new WarRules();
      
      war.createDecks();
      
      Card a = war.getP1TopCard();
      Card b = war.getP2TopCard();
      
      boolean c = a.greaterThan(b);
      boolean d = a.equals(b);
      
      int e = war.weGotAWar();
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      
   }
}