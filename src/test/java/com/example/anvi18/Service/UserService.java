package com.example.anvi18.Service;
import com.example.anvi18.Entity.User;
public interface UserService {
public User Create(User u);
public User [] retrieveName();
public User update(User u);
public void deleteByName(User u);
}


