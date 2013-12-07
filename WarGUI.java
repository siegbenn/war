import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class WarGUI extends JFrame
{
   private JTextField item1;
   private JTextField item2;
   private JTextField item3;
   
   public WarGUI(){
      super("War");
      setLayout(new FlowLayout());
      
      item1 = new JTextField(10);
      add(item1);
      item2 = new JTextField("enter text");
      add(item2);
      item3 = new JTextField("unedit", 20);
      item3.setEditable(false);
      add(item3);
      
      thehandler handler = new thehandler();
      item1.addActionListener(handler);
      item2.addActionListener(handler);
      item3.addActionListener(handler);
      }
   
   private class thehandler implements ActionListener{
      public void actionPerformed(ActionEvent event){
      
      String string = "";
 
      }
   }
}