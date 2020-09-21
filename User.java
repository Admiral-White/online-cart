package smallStore;

public abstract class User {
private String name;
private String phone;
private String homeAddress;
private String email;

    public String getPhone() {
        return phone;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String userName) {
        name = userName;

    }

    public void setAddress(String address) {
        this.homeAddress = address;

    }

    public void setEmailAddress(String email) {
        this.email = email;

    }

    public String getHomeAddress() {
        return homeAddress;
    }


    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;

    }

    abstract void jump();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
