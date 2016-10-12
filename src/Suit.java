/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krist
 */
public enum Suit{
     DIAMONDS (1), CLUBS (2), HEARTS (3), SPADES (4);
     
     
     public int getValue(){
        return value;
    }
     
    private final int value;
     
    private Suit(int value){
        this.value = value;
    }
}

