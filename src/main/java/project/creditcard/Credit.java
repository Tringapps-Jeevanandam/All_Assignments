package project.creditcard;

public class Credit{
    String cardHolderName;
    long cardNumber;
    String expDate;

    Credit(String cardHolderName,long cardNumber,String expDate){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }
    Credit(Credit obj)
    {
        cardHolderName = obj.cardHolderName;
        cardNumber = obj.cardNumber;
        expDate = obj.expDate;

    }
    protected boolean equals(long newCardNumber){
        return cardNumber==newCardNumber;
    }   

}