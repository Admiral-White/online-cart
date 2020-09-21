package smallStore;

public class BillingInformation {
    private Address deliveryAddress;
    private CreditInformation creditInformation;
    private String receiversName;
    private String receiversPhoneNumber;

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditInformation getCreditInformation() {
        return creditInformation;
    }

    public void setCreditInformation(CreditInformation creditInformation) {
        this.creditInformation = creditInformation;
    }

    public String getReceiversName() {
        return receiversName;
    }

    public void setReceiversName(String receiversName) {
        this.receiversName = receiversName;
    }

    public String getReceiversPhoneNumber() {
        return receiversPhoneNumber;
    }

    public void setReceiversPhoneNumber(String receiversPhoneNumber) {
        this.receiversPhoneNumber = receiversPhoneNumber;
    }

    @Override
    public String toString() {
        return "BillingInformation{" +
                "deliveryAddress=" + deliveryAddress +
                ", creditInformation=" + creditInformation +
                ", receiversName='" + receiversName + '\'' +
                ", receiversPhoneNumber='" + receiversPhoneNumber + '\'' +
                '}';
    }


    // this two method were created to call the return type associated with the variable name
    public void setDeliveryAddress(String united_state, String new_york, String s, String new_city_town) {

    }

    public void setCreditInformation(String s, String s1, String s2, String s3, String s4, CardType verve) {

    }
}
