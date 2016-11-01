package com.dao;

import com.model.User;

public interface Userdao {
    
     
    public void save(User user);
    public void update(User user);
     public void delete(User user);
  
}