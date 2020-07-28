package ca.monor.dao;

import ca.monor.BaseTest;
import ca.monor.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryAllUser() {
        List<User> users = userDao.queryAllUser();
    }
}
