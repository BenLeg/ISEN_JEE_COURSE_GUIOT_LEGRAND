package yncrea.lab01.model;

import java.util.Objects;

public class Pharmacist {

    private String login;

    private String password;


    public Pharmacist(final String login, final String password) {
        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return login;
    }


    public void setLogin(final String loginValue) {
        login = loginValue;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(final String passwordValue) {
        password = passwordValue;
    }


    @Override public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pharmacist))
            return false;
        final Pharmacist that = (Pharmacist) o;
        return getLogin().equals(that.getLogin()) &&
                getPassword().equals(that.getPassword());
    }


    @Override public int hashCode() {
        return Objects.hash(getLogin(), getPassword());
    }
}
