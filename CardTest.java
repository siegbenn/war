public class CardTest
{
   public static void main(String[] args)
   {
   
   // Create an array of Ship references
   Deck testDeck = new Deck();
   testDeck.order();
   
   testDeck.showDeck();
   
   testDeck.shuffle();
   testDeck.showDeck();
   testDeck.deal();
   testDeck.showPiles();
   
   
   War testWar = new War();
   testWar.order();
   testWar.showDeck();
   testWar.deal();
   testWar.play();

   
   
   
   

   
   }
}