package com.SBS.springbookseller.Service;

import com.SBS.springbookseller.DAO.Repositories.UserRepository;
import com.SBS.springbookseller.DAO.entities.Role;
import com.SBS.springbookseller.DAO.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public User saveUser(User user){
        user.setPassword(user.getPassword());
        user.setRole(Role.USER);
        user.setCreatedAt(new Date());
        User SavedUser = userRepository.save(user);
        return SavedUser;
    }
    @Override
    public User findByUsername(String Username){
        return userRepository.findByUsername(Username).orElse(null);
    }
    @Override
    public Optional<User> MakeAdmin(User user){
        return userRepository.updateUser(user.getUsername(),Role.ADMIN);
    }

    @Override
    public User deleteUser(User user) {
        User user1 = user;
        userRepository.delete(user);
        return user1;
    }

    @Override
    public User deleteUser(Long userId) {
        User user1 = userRepository.findById(userId).orElse(null);
        userRepository.deleteById(userId);
        return user1;
    }

}
