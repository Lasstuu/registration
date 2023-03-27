package main.registration;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage userStorage = null;

    private UserStorage(){

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public static UserStorage getInstance(){
        if(userStorage == null) {
            userStorage = new UserStorage();
        }
        return(userStorage);
    }
}