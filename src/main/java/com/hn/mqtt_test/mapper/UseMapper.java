package com.hn.mqtt_test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hn.mqtt_test.pojo.User;
import org.springframework.stereotype.Repository;

//在对应的mapper上实现基本的接口basemapper
@Repository
public interface UseMapper extends BaseMapper<User> {

}
