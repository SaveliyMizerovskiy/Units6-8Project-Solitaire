public class Card {
    //card class
    String cardID = "";
    String suit = "";
    public Card(int cardNum, String suit){
        this.suit = suit;
        assignID(cardNum);
    }

    private void assignID(int cardNum){
        if (cardNum == 13){
            cardID = suit + "-" + "King";
        } else if (cardNum == 12){
            cardID = suit + "-" + "Queen";
        } else if (cardNum == 11){
            cardID = suit + "-" + "Jack";
        } else if (cardNum == 10){
            cardID = suit + "-" + "10";
        } else if (cardNum == 9){
            cardID = suit + "-" + "9";
        } else if (cardNum == 8){
            cardID = suit + "-" + "8";
        } else if (cardNum == 7){
            cardID = suit + "-" + "7";
        } else if (cardNum == 6){
            cardID = suit + "-" + "6";
        } else if (cardNum == 5){
            cardID = suit + "-" + "5";
        } else if (cardNum == 4){
            cardID = suit + "-" + "4";
        } else if (cardNum == 3){
            cardID = suit + "-" + "3";
        } else if (cardNum == 2){
            cardID = suit + "-" + "2";
        } else if (cardNum == 1){
            cardID = suit + "-" + "Ace";
        } else {
            cardID = "Invalid Card";
        }
    }
}
