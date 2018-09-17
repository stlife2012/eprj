package com.stlife.data.db.mybatis.web;

import com.stlife.data.db.mybatis.pojo.TaskInfo;
import com.stlife.data.db.mybatis.services.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname TaskController
 * @Description TODO
 * @Author Stlife
 * @Date 2018/9/17 16:09
 * @Version 1.0
 **/
@RequestMapping("/task")
@RestController
public class TaskController {
    @Resource
    private TaskService taskService;

    @RequestMapping("/")
    @ResponseBody
    public List<TaskInfo> views(HttpServletRequest request) {
        Map params = request.getParameterMap();
        return  taskService.searchByPage(new HashMap());
    }
}
