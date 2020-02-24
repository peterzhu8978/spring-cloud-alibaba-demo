package org.demos.alibaba.dubbo.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Version:
 * @Date: 2020/2/21
 * @Company: ruixiaoyun.ltd
 */
@Data
public class Task implements Serializable {
    private static final long serialVersionUID = 5506487301696501162L;

    private String taskId;

    private String taskName;
}
