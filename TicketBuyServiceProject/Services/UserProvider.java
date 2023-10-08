package TicketBuyServiceProject.Services;

import java.util.ArrayList;
import java.util.List;

import TicketBuyServiceProject.Models.User;

public class UserProvider {
    private List<User> clients;

    public UserProvider() {

    }

    public List<User> getClientList() {
        if (clients == null) {
            clients = new ArrayList<>();

            clients.add(new User(0, "Sasha", "Timofeev", "89130020012", "dsf@mail.ru", "1232123"));
            clients.add(new User(0, "Misha", "Goshev", "89130034325", "rtu@mail.ru", "45686548"));
            clients.add(new User(0, "Vera", "Nurov", "89130046543", "sfh@mail.ru", "123245546123"));
            clients.add(new User(0, "Lena", "Valov", "89130065432", "dhfgj@mail.ru", "12344562123"));
            clients.add(new User(0, "Zoya", "Somov", "89130094356", "dsjhgfkf@mail.ru", "2354325"));
            clients.add(new User(0, "Mila", "Nosov", "89130074543", "bcjm@mail.ru", "568657"));

        }
        return clients;

    }


    private User findUserByTelephone(List<User> users, String telNumber) {
        User userToFind = null;
        if (users.size() != 0) {
            for (User user : users) {
                if (user.getTelNumber().equals(telNumber))
                    userToFind = user;
            }
        }
        return userToFind;
    }

    public User searchUserFromList(String telNumber) {
        UserProvider userProvider = new UserProvider();
        return findUserByTelephone(userProvider.getClientList(), telNumber);

    }

    public User authoriseUserByTelephone(String telNumber) {
        return searchUserFromList(telNumber);

    }

}
