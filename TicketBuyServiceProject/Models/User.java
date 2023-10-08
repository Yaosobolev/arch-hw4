package TicketBuyServiceProject.Models;

public class User {
    private int idUser;
    private String firstName;
    private String lastName;
    private String telNumber;
    private String email;
    private String password;

    public User(int idUser, String firstName, String lastName, String telNumber, String email, String password) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
        this.email = email;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

 
}
