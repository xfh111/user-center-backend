package com.yupi.fenghuang.model.request;

import lombok.Data;

import java.util.Date;

/**
 * 加入队伍请求参数封装
 */
@Data
public class TeamJoinRequest {


    /**
     * 主键id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;

}
