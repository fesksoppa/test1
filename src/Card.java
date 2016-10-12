
/**
 *
 * @author Krist
 */
public class Card implements Comparable<Card>
{
    
    private final Rank rank; 
    private final Suit suit;
    
    
   public Card(int rank, int suit){
       
       this.rank= Rank.values()[(rank-1)] ; 
       this.suit=Suit.values()[suit];
   } 
   
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
     
   public Rank getRank(){
       return rank; 
   }
   
   public Suit getSuit(){
       return suit;
   }
   
   public boolean equals(Card other) {
       
     
       return this.rank == other.rank && this.suit == other.suit;
    }

    public Card() {
        this.rank = null;
        this.suit = null;
        
    }
   
    @Override
    public String toString(){
        String info= rank +" of "+ suit;
        return info;
    }
   
    public int getRankValue(){
        return rank.getValue();
    }
    public int getSuitValue(){
        return suit.ordinal();
        
    }  

    @Override
    public int compareTo(Card t) {
        int res=0;
        if(this.suit.ordinal()> t.suit.ordinal())
        {
            res=1;
        }
        else if(this.suit.ordinal()==t.suit.ordinal())
        {
            if(this.rank.getValue()> t.rank.getValue())
            {
                res=-1;
            }
            res = 1;
        }
        
        else if(this.suit.ordinal() < t.suit.ordinal())
        {
            res= -1;
        }
        
        return res;
    }
}
