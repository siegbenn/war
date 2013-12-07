import javax.swing.JFrame;

class Driver
{
   public static void main(String[] args)
   {
   
      WarGUI gui = new WarGUI();
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.setSize(500,500);
      gui.setVisible(true);
   }
}