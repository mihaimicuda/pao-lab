package ro.unibuc.lab6.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashExample {

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();

        users.add(new User("A", 1));
        users.add(new User("B", 2));
        users.add(new User("C", 3));
        users.add(new User("D", 4));

        System.out.println(users);

        Set<AllEqualsUser> equalsUsers = new HashSet<>();

        equalsUsers.add(new AllEqualsUser("A", 1));
        equalsUsers.add(new AllEqualsUser("B", 2));
        equalsUsers.add(new AllEqualsUser("C", 3));
        equalsUsers.add(new AllEqualsUser("D", 4));

        System.out.println(equalsUsers);
    }

}
