package com.hn.mqtt_test;

import com.hn.mqtt_test.mapper.UseMapper;
import com.hn.mqtt_test.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MqttTestApplicationTests {

    @Autowired
    private UseMapper useMapper;
    @Test
    void contextLoads() {
        //wapper条件构造器，sql语句的条件查询
        List<User> users = useMapper.selectList(null);
        users.forEach(System.out::println);
    }
    //测试插入
    @Test
    public void  testInsert(){
        User user = new User();
        user.setName("test");
        user.setAge(2);
        user.setEmail("1289174323@qq.com");
        int res = useMapper.insert(user);//id会自动回填？
        System.out.println(res);
        System.out.println(user);
    }
}
