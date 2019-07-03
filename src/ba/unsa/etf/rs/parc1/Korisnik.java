package ba.unsa.etf.rs.parc1;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {

    private SimpleStringProperty ime, prezime, email, username, password, passwordrepeat;

    public Korisnik(String ime, String prezime, String email, String username, String password, String passwordrepeat) {
        this.ime = new SimpleStringProperty(ime);
        this.prezime = new SimpleStringProperty(prezime);
        this.email = new SimpleStringProperty(email);
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.passwordrepeat = new SimpleStringProperty(passwordrepeat);
    }

    @Override
    public String toString() {
        return prezime.get() + " " + ime.get();
    }

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getUsername() {
        return username.get();
    }

    public SimpleStringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }


    public String getPasswordrepeat() {
        return passwordrepeat.get();
    }

    public SimpleStringProperty passwordrepeatProperty() {
        return passwordrepeat;
    }

    public void setPasswordrepeat(String passwordrepeat) {
        this.passwordrepeat.set(passwordrepeat);
    }

    public String getPasswordRepeat() {
        return null;
    }
}
