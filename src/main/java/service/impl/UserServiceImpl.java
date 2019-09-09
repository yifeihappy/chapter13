package service.impl;

import domain.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User login(String loginname, String password) {
        return userMapper.findWithLoginnameAndPassword(loginname, password);
    }
}
