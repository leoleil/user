package com.onps.dao;

import com.onps.model.TMgtUser;

import java.util.Map;

public interface TMgtUserDAO {
    TMgtUser login(Map<String, Object> map);
}
