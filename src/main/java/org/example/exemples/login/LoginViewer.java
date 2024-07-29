package org.example.exemples.login;

import org.example.observable.Observer;

import java.util.Scanner;

public class LoginViewer implements Observer
{


    public LoginViewer()
    {
        System.out.println("Bem vindo");
    }

    public String[] displayRealizarLogin()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para fazer login, digite seu nome e senha\nNome: ");
        String nome = scanner.nextLine();
        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        return new String[]{nome, senha};
    }



    @Override
    public void update(String event)
    {
        System.out.println("User currently Logged: " + event);
    }
}
