package service;

import domain.User;

public interface UserService {
    User login(String loginname, String password);
}
