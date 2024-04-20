package com.SBS.springbookseller.Service;

import com.SBS.springbookseller.DAO.entities.Role;
import com.SBS.springbookseller.DAO.entities.User;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
    User findByUsername(String Username);
    Optional<User> MakeAdmin(User user);
    User deleteUser(User user);
    User deleteUser(Long userId);

}
