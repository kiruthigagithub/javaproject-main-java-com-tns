package com.tns.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}