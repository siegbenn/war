// Bennett Siegel
// CS110
// Deck class.

import java.util.*;

/**
   The Deck class holds a 52 card deck, shuffles and deals into two piles.
*/
public class Deck 
{
   
   // Variables
   
   private String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "a" };
	private String[] suit = { "c", "d", "h", "s" };
	private String[] deck = new String[52];
   public Vector<String> pile1 = new Vector<String>();
	public Vector<String> pile2 = new Vector<String>();
   
   /**
      order method
      Orders the cards by suit and rank.
   */
   public void order() 
   {
      // Initalize index value at start of deck array
		int index = 0;
      // Loop through each suit then loop through all ranks on each suit
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
            // Set rank+suit for current deck index value
				deck[index] = rank[j] + suit[i];
				index++;
			}
		}
	}
   
   /**
      shuffle method
      Randomly shuffles the 52 cards.
   */
   public void shuffle() {
      // Initalize inital card number and card string
		int cardNum = 0;
		String cardString = "";
         // Loop through randomization for length of deck
			for (int i = 0; i < 52; i++) {
            // Set the card to a random number between 0-51
				cardNum =(int) Math.floor(Math.random() * 52);
            // Get the string at the random spot in card array
				cardString = deck[cardNum];
            // Set the loop spot to the random card string
				deck[cardNum] = deck[i];
				deck[i] = cardString;
			}
		
	}
   
   /**
      deal method
      Deals the 52 cards into two piles.
   */
   public void deal() 
   {
   // Initialize loop through deck
   int i = 0;
		while (i < deck.length)
      {
         // Alternate adding cards to pile1 and pile 2
		   pile1.addElement(deck[i]);
			pile2.addElement(deck[i + 1]);
	      i = i + 2;
      }
   }


	/**
      showDeck method
      Prints out the cards in the deck.
   */	   
   public void showDeck()
   {
      // Loop through deck and print cards
      for(int i = 0; i < deck.length; i++)
         System.out.println(deck[i]);
   }
   
   /**
      showPiles method
      Prints out the cards in each pile.
   */	
   public void showPiles()
   {
      // Loop through deck and print cards
      System.out.println("Pile1 -----------");
      for(int i = 0; i < pile1.size(); i++)
        {
            System.out.println(pile1.get(i));
        }
      System.out.println("Pile2 -----------");
      for(int i = 0; i < pile2.size(); i++)
        {
            System.out.println(pile2.get(i));
        }
   }
   
}

