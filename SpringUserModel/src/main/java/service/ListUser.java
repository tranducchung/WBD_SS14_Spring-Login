package service;

import model.Login;
import model.User;


import java.util.ArrayList;
import java.util.List;

public class ListUser {
    private static List<User> users;

    static {
        users = new ArrayList<>();

        users.add(new User("Chung","chung@gamil.com",23,"nghichvuathoi","chung23"));
        users.add(new User("Nam","nam@gamil.com",25,"namsonphong","nam25"));
        users.add(new User("Manh","manh@gamil.com",24,"manhhaiphong","manh24"));
    }

    public static User checkLogin(Login login){
        for (User u: users)
        {
            if(u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
