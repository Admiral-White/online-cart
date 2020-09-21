package smallStore;

import java.time.YearMonth;


public class CreditInformation {
    private String creditCardNumber;
    private String nameOnCard;
    private String cardCvv;
    private byte cvv;
    //  I changed the return type from YearMonth to String because the system said the integer was too long
    private String expirationYearMonth;
    private CardType cardType;


    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public byte getCvv() {
        return cvv;
    }

    public void setCvv(byte cvv) {
        this.cvv = cvv;
    }

    public String getExpirationYearMonth() {
        return expirationYearMonth;
    }

    public void setExpirationYearMonth(String expirationYearMonth) {
        this.expirationYearMonth = expirationYearMonth;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditInformation{" +
                "creditCardNumber='" + creditCardNumber + '\'' +
                ", nameOnCard='" + nameOnCard + '\'' +
                ", cardCvv='" + cardCvv + '\'' +
                ", cvv=" + cvv +
                ", expirationYearMonth=" + expirationYearMonth +
                ", cardType=" + cardType +
                '}';
    }
}
