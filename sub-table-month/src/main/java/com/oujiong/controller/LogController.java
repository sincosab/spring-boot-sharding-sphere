package com.oujiong.controller;


import com.google.common.collect.Lists;
import com.oujiong.entity.Log;
import com.oujiong.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class LogController {

    @Autowired
    private LogService logService;

    /**
     * 测试新增
     * @return
     */
    @PostMapping("log-insert")
    public void logInsert() {
        Log log = new Log();
        log.setTime(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        log.setLog("zzz");
        log.setCreatedTime(new Date());
        logService.insertSelective(log);
    }

    /**
     * 测试批量新增
     * @return
     */
    @PostMapping("log-inserts")
    public Object logInserts() {
        Log log = new Log();
//        log.setTime(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        log.setTime("202203");
        log.setLog("inserts 1");
        log.setCreatedTime(new Date());
        Log log1 = new Log();
//        log1.setTime(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        log1.setTime("202202");
        log1.setLog("inserts 2");
        log1.setCreatedTime(new Date());
        Log log2 = new Log();
        log2.setTime("202202");
        log2.setLog("inserts 3");
        log2.setCreatedTime(new Date());
        List<Log> lists = Lists.newArrayList(log, log1, log2);
        logService.insertBatch(lists);
        return lists;
    }

    /**
     * 测试删除
     * @param id
     * @return
     */

    public Object delete(Long id) {
        return logService.deleteByPrimaryKey(id);
    }

    /**
     * 测试查询
     * @param id
     * @return
     */

    public Object select(Long id) {
        return logService.selectByPrimaryKey(id);
    }


    /**
     */
    @PostMapping("listall")
    public Object listall() {
        return logService.list();
    }


    /**
     */
    @PostMapping("query")
    public Object query(@RequestBody @Nullable Log log) {
        return logService.query(log);
    }


}