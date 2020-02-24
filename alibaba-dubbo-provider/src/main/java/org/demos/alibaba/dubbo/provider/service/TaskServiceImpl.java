package org.demos.alibaba.dubbo.provider.service;

import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.Service;
import org.demos.alibaba.dubbo.api.TaskService;
import org.demos.alibaba.dubbo.api.model.Task;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.Arrays;
import java.util.List;

/**
 * @Version:
 * @Date: 2020/2/21
 * @Company: ruixiaoyun.ltd
 */
@Log4j2
@Service
@RefreshScope
public class TaskServiceImpl implements TaskService {

    @Value("${task.id}")
    private String taskId;

    @Override
    public List<Task> list() {
        Task task = new Task();
        task.setTaskId(taskId);
        task.setTaskName("task-" + taskId);
        return Arrays.asList(task);
    }
}
