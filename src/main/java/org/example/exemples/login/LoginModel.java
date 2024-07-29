package org.example.exemples.login;

import org.example.observable.Observer;

import java.util.ArrayList;

public class LoginModel implements Observer
{
    private final ArrayList<User> users;

    public LoginModel()
    {
        users = new ArrayList<User>();
    }

    @Override
    public void update(String event)
    {
        for(User u : users)
        {
            if(u.getName().equals(event))
                u.setLogged(true);
            else if (u.isLogged())
            {
                u.setLogged(false);
            }
        }


    }

    public ArrayList<User> getUsers()
    {
        return users;
    }

    public String getLoggedUser()
    {
        String loggedUser = "";

        for (User u : users)
        {
            if (u.isLogged())
            {
                loggedUser = u.getName();
                return loggedUser;
            }
        }

        return loggedUser;
    }

    public void add(String nome, String senha)
    {
        users.add(new User(nome, senha));
    }
}
