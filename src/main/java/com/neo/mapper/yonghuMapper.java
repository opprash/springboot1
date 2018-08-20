package com.neo.mapper;

import com.neo.entity.yonghuEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @Auther opprash
 * @Date 2018\8\16 0016 10:37
 */
@Component
public interface yonghuMapper {
    @Select("SELECT * FROM yonghu WHERE uuid = #{uuid}")
    @Results({
            @Result(property = "uuId",  column = "uuid"),
            @Result(property = "PhoneNum", column = "phoneNum"),
            @Result(property = "yangZheng",column = "yangzhng")
    })
    yonghuEntity getOne(Long id);
    @Insert("INSERT INTO yonghu(uuid,phoneNum,yangzheng) VALUES(#{uuId}, #{PhoneNum}, #{yangZheng})")
    void insert(String uuid,String phoneNum,int num);
    yonghuEntity getOne(String uuid);
    @Delete("DELETE FROM yonghu WHERE id =#{uuid}")
    void delete(String uuid);
}
