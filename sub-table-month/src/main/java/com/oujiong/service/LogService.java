package com.oujiong.service;

import com.oujiong.entity.Log;
import com.oujiong.entity.User;

import java.util.List;

/**
 * @author xub
 * @Description: 用户相关接口
 * @date 2019/10/10 下午8:53
 */
public interface LogService {

    /**
     * 获取所有用户信息
     */
    List<Log> list();

    /**
     * 批量 保存用户信息
     *
     * @param userVOList
     */
    String insertForeach(List<User> userVOList);

    void insertSelective(Log log);

    void insertBatch(List<Log> lists);

    Object deleteByPrimaryKey(Long id);

    Object selectByPrimaryKey(Long id);

    Object query(Log log);
}