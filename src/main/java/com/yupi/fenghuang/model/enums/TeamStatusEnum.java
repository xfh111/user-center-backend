package com.yupi.fenghuang.model.domain.enums;

/**
 * 队伍状态枚举
 */
public enum TeamStatusEnum {

    PUBLIC(0,"公开"),
    PRIVATE(1,"私有"),
    ENCRYPT(2,"加密")
    ;

    public static TeamStatusEnum getTeamStatus(Integer status){
        TeamStatusEnum[] teamStatusEnums = TeamStatusEnum.values();
        for (TeamStatusEnum statusEnum : teamStatusEnums) {
            if(statusEnum.status == status){
                return statusEnum;
            }
        }
        return null;
    }

    private Integer status;

    private String description;

    TeamStatusEnum(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
