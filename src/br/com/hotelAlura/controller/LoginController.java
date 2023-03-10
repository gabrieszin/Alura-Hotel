package br.com.hotelAlura.controller;

import br.com.hotelAlura.dao.LoginDao;
import br.com.hotelAlura.factory.ConnectionFactory;
import br.com.hotelAlura.model.Login;

import java.sql.SQLException;

public class LoginController {

    private LoginDao loginDao;

    public LoginController() {
        try {
            this.loginDao = new LoginDao(new ConnectionFactory().conexao());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean acessar(Login login) {
        return this.loginDao.acessar(login);
    }

}
