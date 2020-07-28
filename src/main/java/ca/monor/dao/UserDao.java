package ca.monor.dao;

import ca.monor.entity.User;

import java.util.List;

public interface UserDao {
    List<User> queryAllUser();
}
