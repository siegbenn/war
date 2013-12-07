import java.util.*;

class War extends Deck
{
   // Variables
   private int position1 = 0;
   private int position2 = 0;
   private char rank1;
   private char rank2;
   private String card1;
   private String card2;
   private int num1;
   private int num2;
   
   public void setup()
   {
      super.order();
      super.shuffle();
      super.deal();
   }
     
   
   public void play()
   {
      draw();
      System.out.println(num1);
      System.out.println(num2);
      Vector<String> playPile = new Vector<String>();    
      while(num1 == num2)
      {
         playPile.addElement(pile1.elementAt(0));
			playPile.addElement(pile2.elementAt(0));
			pile1.removeElementAt(0);
			pile2.removeElementAt(0);
         draw();

      } 
      if(num1 > num2)
      {
         playPile.addElement(pile1.elementAt(0));
			playPile.addElement(pile2.elementAt(0));
			pile1.removeElementAt(0);
			pile2.removeElementAt(0);
         
         for (int i = 0; i < playPile.size(); i++) {
			   pile1.addElement(playPile.elementAt(i));
			}
         
      }
      else
      {
         playPile.addElement(pile1.elementAt(0));
			playPile.addElement(pile2.elementAt(0));
			pile1.removeElementAt(0);
			pile2.removeElementAt(0);
         
         for (int i = 0; i < playPile.size(); i++) {
			   pile2.addElement(playPile.elementAt(i));
			}
         
         
      }
      System.out.println(pile1.size());
      System.out.println(pile2.size());

   }
      
   
   
   public void draw()
   {
     card1 = pile1.elementAt(position1);
	  card2 = pile2.elementAt(position2); 
     
     rank1 = card1.charAt(0);
     rank2 = card2.charAt(0);
     
     switch (rank1) {
				case '1':
					num1 = 10;
					break;
				case 'j':
					num1 = 11;
					break;
				case 'q':
					num1 = 12;
					break;
				case 'k':
					num1 = 13;
					break;
				case 'a':
					num1 = 14;
					break;
				default:
               String num1String = Character.toString(rank1);
               num1 = Integer.parseInt(num1String);
					
				}
     
     switch (rank2) {
				case '1':
					num2 = 10;
					break;
				case 'j':
					num2 = 11;
					break;
				case 'q':
					num2 = 12;
					break;
				case 'k':
					num2 = 13;
					break;
				case 'a':
					num2 = 14;
					break;
				default:
               String num2String = Character.toString(rank2);
               num2 = Integer.parseInt(num2String);
					
				}
     
     
   }
}