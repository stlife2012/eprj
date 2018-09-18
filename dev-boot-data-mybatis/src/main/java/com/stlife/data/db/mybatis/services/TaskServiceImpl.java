package com.stlife.data.db.mybatis.services;

import com.stlife.data.db.mybatis.mapper.TaskInfoMapper;
import com.stlife.data.db.mybatis.mapper.TaskMapper;
import com.stlife.data.db.mybatis.pojo.TaskInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Classname TaskServiceImpl
 * @Description TODO
 * @Author Stlife
 * @Date 2018/9/17 16:18
 * @Version 1.0
 **/
@Service
public class TaskServiceImpl implements TaskService{
    @Resource
    private TaskMapper taskDao;

    @Resource
    private TaskInfoMapper taskInfoDao;

    @Override
    public List<TaskInfo> searchByPage(Map params) {
        return taskDao.queryByPage(params);
    }
}
