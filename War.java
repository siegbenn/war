class War extends Deck
{
   // Variables
   private int position1 = 0;
   private int position2 = 0;
   private char rank1;
   private char rank2;
   private String card1;
   private String card2;
   
   public void play()
   {
     card1 = pile1.elementAt(position1);
	  card2 = pile2.elementAt(position2); 
     System.out.println(card1);
     System.out.println(card2);
   }
}