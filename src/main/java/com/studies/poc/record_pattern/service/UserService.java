package com.studies.poc.record_pattern.service;

import com.studies.poc.record_pattern.data.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private final List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        userList.add(createUser("foo_u1", "John Doe 1", new Portuguese()));
        userList.add(createUser("foo_u2", "John Doe 2", new English()));
        userList.add(createUser("foo_u3", "John Doe 3", new German()));
        userList.add(createUser("foo_u4", "John Doe 4", new French()));
        userList.add(createUser("foo_u5", "John Doe 5", new Chinese()));
    }

    private User createUser(String id, String name, Language language) {
        return new User(id, name, language);
    }

    public User findById(String userId){
        Optional<User> u = userList.stream().filter(user -> user.id().equals(userId)).findFirst();

        return u.orElse(userList.getFirst());
    }
}
