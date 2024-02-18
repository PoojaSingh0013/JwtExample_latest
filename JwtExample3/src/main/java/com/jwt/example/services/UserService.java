package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Pooja Singh","poojasingh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rani Singh","Rani@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ashok Singh","Rani@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Babs Singh","Rani@gmail.com"));
    }
    public List<User> getUsers(){
        return this.store;
    }
}
