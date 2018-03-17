package com.repository;

import com.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void name() {
        assertEquals("hello", "hello1");
    }

    @Test
    public void save() {
        User user = new User("dhshin", "1234", "daehoan");
        userRepository.delete(user);
        assertEquals(0, userRepository.count());
        userRepository.save(user);
        assertEquals(1, userRepository.count());
        //변경
    }
}