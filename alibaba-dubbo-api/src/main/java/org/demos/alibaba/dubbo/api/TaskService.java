package org.demos.alibaba.dubbo.api;

import org.demos.alibaba.dubbo.api.model.Task;

import java.util.List;

/**
 * @InterfaceName: TaskService
 * @Description:
 * @Version:
 * @Date: 2020/2/21
 * @Author: rong.zhu
 * @Email: zhurong@ruixiaoyun.com
 */
public interface TaskService {

    List<Task> list();
}
