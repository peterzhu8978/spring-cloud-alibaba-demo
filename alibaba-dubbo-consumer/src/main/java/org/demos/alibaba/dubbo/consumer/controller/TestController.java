package org.demos.alibaba.dubbo.consumer.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.Reference;
import org.demos.alibaba.dubbo.api.TaskService;
import org.demos.alibaba.dubbo.api.model.Task;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Version:
 * @Date: 2020/2/22
 * @Company: ruixiaoyun.ltd
 */
@Log4j2
@RestController
@RequestMapping
public class TestController {

    @Reference
    private TaskService taskService;

    @ResponseBody
    @GetMapping(value = "/task_list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Task> taskList() {
        log.info("consumer invoked!");
        return taskService.list();
    }

}
