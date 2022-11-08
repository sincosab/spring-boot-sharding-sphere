package com.oujiong.service.impl;

import com.oujiong.entity.Log;
import com.oujiong.entity.User;
import com.oujiong.mapper.LogMapper;
import com.oujiong.mapper.UserMapper;
import com.oujiong.service.LogService;
import com.oujiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @Description: 用户实现类
 *
 * @author xub
 * @date 2019/10/10 下午8:53
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public  List<Log> list() {
        List<Log> users = logMapper.selectAll();
        return users;
    }

    @Override
    public String insertForeach(List<User> userVOList) {
        return null;
    }


    @Override
    public void insertSelective(Log log) {
        logMapper.insertSelective(log);
    }

    @Override
    public void insertBatch(List<Log> lists) {

        for ( Log log :lists){
            logMapper.insertSelective(log);
        }

    //  logMapper.insertBatch(lists);
    }

    @Override
    public Object deleteByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public Object selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public Object query(Log log) {
        return   logMapper.query(log);
    }

}
