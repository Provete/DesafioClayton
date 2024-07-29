package org.example.exemples.login;

import org.example.observable.*;
import org.example.DataBinding.Presenter;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPresenter extends Presenter
{
    private final LoginViewer loginViewer;
    private final LoginModel loginModel;

    public LoginPresenter(LoginViewer viewer, LoginModel model, Configuration configuration)
    {
        super(viewer, model, configuration);

        loginViewer = viewer;
        loginModel = model;
    }

    public void entrar()
    {
        String[] login = loginViewer.displayRealizarLogin();
        String nome = login[0];
        String senha = login[1];

        for(User u : loginModel.getUsers())
        {
            if(u.getName().equals(nome) && u.getPassword().equals(senha))
            {
                this.update(nome);
                System.out.println("Autenticação Sucedida\n");
                return;
            }
        }

        System.out.println("Autenticação Não Sucedida");

    }
}
