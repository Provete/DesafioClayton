package org.example.exemples.login;

public class User
{
    private String name;
    private String password;
    private boolean isLogged;

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
        this.isLogged = false;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setLogged(boolean logged)
    {
        isLogged = logged;
    }

    public boolean isLogged()
    {
        return isLogged;
    }
}
