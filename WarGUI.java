import javax.swing.*; //initiate GUI modules
import java.awt.*;
import java.awt.event.*;

/**
   This class is used to create a GUI
   that can be used with teh WarGame class to 
   play.
   @param player1 first player card
   @param player2 second player card
   @param center holds the button and who won
   @param top holds title
   @param bottom holds decks
   @param game WarGame class
   @param go button to take turn
   @param card1 first card
   @param card2 second card
   @param image1 holds card 1 picture
   @param image2 holds the second card picuture
   @param winnerz holds the winner
   @param pic1 holds the string of the file
   @param pic2 holds the string of teh second file
   @param gameWinner holds the gameWinning string
*/

public class WarGUI extends JFrame
{
   private JPanel player1;
   private JPanel player2;
   private JPanel center;
   private JPanel top;
   private JPanel bottom;
   private WarGame game;
   private JButton go;
   private JLabel decks;
   private JLabel title;
   private JLabel card1, card2;
   private JLabel winnerz;
   private ImageIcon image1, image2;
   String pic1, pic2, gameWinner;
   
   /**
      This class is used to run the GUI
   */
   
   public WarGUI()
   {
      game = new WarGame();
      
      setLayout(new BorderLayout());
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      pic1 = "back.jpg";
      pic2 = "back.jpg";
      
      image1 = new ImageIcon(pic1);
      image2 = new ImageIcon(pic2);
      
      player1 = new JPanel();
      player2 = new JPanel();
      center = new JPanel();
      top = new JPanel();
      bottom = new JPanel();
      
      card1 = new JLabel(image1);
      card2 = new JLabel(image2);
      
      player1.add(card1);
      
      player2.add(card2);
      
      decks = new JLabel("Decks");
      
      title = new JLabel("WAR!");
      
      go = new JButton("Deal");
      
      go.addActionListener(new Turn());
      
      center.add(go);
      
      gameWinner = game.getWinnerString();
      
      winnerz = new JLabel(gameWinner);
      
      center.add(winnerz);
      
      top.add(title);
      
      bottom.add(decks);
      
      add(center, BorderLayout.CENTER);
      add(player1, BorderLayout.WEST);
      add(player2, BorderLayout.EAST);
      add(top, BorderLayout.NORTH);
      add(bottom, BorderLayout.SOUTH);
      
      pack();
      setVisible(true);
   }
   
   /**
      This class is used to control the action
      of the button.
   */
   
   private class Turn implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {  
         game.turn();
         
         pic1 = game.getPicFile1();
         
         pic2 = game.getPicFile2();
         
         image1 = new ImageIcon(pic1);
         
         image2 = new ImageIcon(pic2);
         
         card1.setIcon(image1);
         
         card2.setIcon(image2);
         
         gameWinner = game.getWinnerString();
         
         winnerz.setText(gameWinner);
      }
   }
   
   public static void main(String [] args)
   {
      new WarGUI();
   }
}