/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.*;
/**
 *
 * @author Krist
 */
public class ComparableÖvning6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ArrayList<Card> deck = new ArrayList<Card>();
        Card[] deck = new Card[6];
        
        
        Card c1=(new Card(Rank.ACE,Suit.HEARTS));
        Card c2=(new Card(Rank.ACE,Suit.CLUBS));
        Card c3=(new Card(Rank.FIVE,Suit.CLUBS));
        Card c4=(new Card(Rank.THREE,Suit.SPADES));
        Card c5=(new Card(Rank.THREE,Suit.DIAMONDS));
        Card c6=(new Card(Rank.TEN,Suit.CLUBS));
        
        deck[0]=c1;
        deck[1]=c2;
        deck[2]=c3;
        deck[3]=c4;
        deck[4]=c5;
        deck[5]=c6;
        
       
       
        for(Card n:deck){
        System.out.println(n.toString());
        
        }
        
        Arrays.sort(deck);
      
        System.out.println("---------------------------");
        for(Card n:deck){
        System.out.println(n.toString());
        
        }
        
    }
    
}
