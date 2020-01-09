package com.ssm.serviceimpl;

import com.ssm.bean.Users;
import com.ssm.mapper.UsersMapper;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public String userQuery() {
        List<Users> count = usersMapper.selectAll();
        if(count != null){
            return "Get it";
        }else {
            return "Game Over";
        }
    }
}
