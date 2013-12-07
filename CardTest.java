public class CardTest
{
   public static void main(String[] args)
   {
   
   // Create an array of Ship references
   War testWar = new War();
   testWar.setup();
   testWar.showPiles();
   System.out.println("----------");
   testWar.play();
   System.out.println("----------");
   testWar.showPiles();
   System.out.println("----------");
   testWar.play();
   System.out.println("----------");
   testWar.showPiles();

   
   
   
   

   
   }
}