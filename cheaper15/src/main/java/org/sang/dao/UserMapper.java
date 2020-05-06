package org.sang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.bean.Role;
import org.sang.bean.User;

import java.util.List;

@Mapper
public interface UserMapper {
    User loaderUserByName(@Param(value = "username") String username);
    List<Role> getUserRolesByUid(Integer id);
}
