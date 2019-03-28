package com.onps.dao;

import com.onps.model.TMgtUser;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface TMgtUserDAO {
    TMgtUser login(Map<String, Object> map);
}
