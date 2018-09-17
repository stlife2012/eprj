package com.stlife.data.db.mybatis.mapper;

import com.stlife.data.db.mybatis.pojo.TaskInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Classname TaskMapper
 * @Description TODO
 * @Author Stlife
 * @Date 2018/9/17 16:12
 * @Version 1.0
 **/
@Mapper
public interface TaskMapper {
    public List<TaskInfo> queryByPage(Map params);
}
