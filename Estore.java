package smallStore;

import java.util.ArrayList;
import java.util.List;

public class Estore {

    private String storeName;
    private List<User> registeredUser = new ArrayList<>();

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<User> getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(List<User> registeredUser) {
        this.registeredUser = registeredUser;
    }

    public void registeredUser(User newUserForRegistration) {
        registeredUser.add(newUserForRegistration);
    }
}
