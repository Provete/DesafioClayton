package org.example.exemples.login;

import org.example.DataBinding.Presenter.Configuration;

public class Main
{
    public static void main(String[] args)
    {
        LoginModel loginModel = new LoginModel();
        LoginViewer loginViewer = new LoginViewer();

        LoginPresenter mtvLoginPresenter = new LoginPresenter(loginViewer, loginModel, Configuration.MODEL_TO_VIEW);
        LoginPresenter vmtLoginPresenter = new LoginPresenter(loginViewer, loginModel, Configuration.VIEW_TO_MODEL);
        LoginPresenter twLoginPresenter = new LoginPresenter(loginViewer, loginModel, Configuration.TWO_WAY);

        loginModel.add("Carlos", "123");
        loginModel.add("Pedro", "1234");
        loginModel.add("Gustavo", "321");
        loginModel.add("Tiago", "abc");
        loginModel.add("ruan", "aaaa");
        loginModel.add("Caio", "abc123");
        loginModel.add("Kaio", "abcd1234");


        //Autenticando utilizando o model to view
        System.out.println("Model to View");
        mtvLoginPresenter.entrar();
        System.out.println("\n\n\n");

        //Autenticando utilizando o view to model
        System.out.println("View to Model");
        vmtLoginPresenter.entrar();
        System.out.println("usuario logado: " + loginModel.getLoggedUser());
        System.out.println("\n\n\n");

        //Autenticando utilizando o two-way
        System.out.println("Two-Way");
        twLoginPresenter.entrar();
        System.out.println("usuario logado: " + loginModel.getLoggedUser());
    }
}
