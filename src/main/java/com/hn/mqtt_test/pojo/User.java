package com.hn.mqtt_test.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //对应数据库中的主键（uuid，自增id，雪花算法，redis，zookeeper）
    @TableId(type = IdType.ID_WORKER)
    private long id;
    private String name;
    private Integer age;
    private String email;

}
