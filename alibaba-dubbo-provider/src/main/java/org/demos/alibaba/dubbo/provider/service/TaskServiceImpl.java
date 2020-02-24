package org.demos.alibaba.dubbo.provider.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.demos.alibaba.dubbo.api.TaskService;
import org.demos.alibaba.dubbo.api.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version:
 * @Date: 2020/2/21
 * @Company: ruixiaoyun.ltd
 */
@Slf4j
@Service
@RefreshScope
public class TaskServiceImpl implements TaskService {

    @Value("${useLocalCache}")
    private Boolean useLocalCache;

    private static List<Task> localTaskList = new ArrayList<>();

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public List<Task> list() {
        log.info("provider invoked!");
        if(useLocalCache) {
            return localTaskList;
        }

        String taskListJson = redisTemplate.opsForValue().get("tasklist");
        if(StringUtils.isNotBlank(taskListJson)) {
            return JSON.parseArray(taskListJson, Task.class);
        }
        return new ArrayList<>();
    }
}
