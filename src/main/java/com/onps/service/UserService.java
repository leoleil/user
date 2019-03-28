package com.onps.service;

import com.onps.model.TMgtUser;

public interface UserService {
    public TMgtUser login(String userName, String pw) throws Exception;
}
