package com.stlife.data.db.mybatis.services;

import com.stlife.data.db.mybatis.pojo.TaskInfo;

import java.util.List;
import java.util.Map;

/**
 * @Classname TaskService
 * @Description TODO
 * @Author Stlife
 * @Date 2018/9/17 16:11
 * @Version 1.0
 **/
public interface TaskService {
    public List<TaskInfo> searchByPage(Map params);
}
