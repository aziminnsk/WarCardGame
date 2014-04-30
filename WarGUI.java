import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
   private ImageIcon image;
   
   public WarGUI()
   {
      setLayout(new BorderLayout());
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      image = new ImageIcon("back.jpg");
      
      player1 = new JPanel();
      player2 = new JPanel();
      center = new JPanel();
      top = new JPanel();
      bottom = new JPanel();
      
      card1 = new JLabel(image);
      card2 = new JLabel(image);
      
      player1.add(card1);
      
      player2.add(card2);
      
      decks = new JLabel("Decks");
      
      title = new JLabel("WAR!");
      
      go = new JButton("Deal");
      
      center.add(go);
      
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
   
   private class Turn extends WarGUI implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         ImageIcon image2 = new ImageIcon("aces.jpg");
         
         JLabel card3 = new JLabel(image2);
         
         player1.setIcon(image2);
      }
   }
   
   public static void main(String [] args)
   {
      new WarGUI();
   }
}