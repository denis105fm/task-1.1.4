package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();
        System.out.println("Таблица создана");

        userService.saveUser("Пользователь 1", "П1", (byte) 22);
        userService.saveUser("Пользователь 2", "П2", (byte) 35);
        userService.saveUser("Пользователь 3", "П3", (byte) 85);
        userService.saveUser("Пользователь 4", "П4", (byte) 54);
        //userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
