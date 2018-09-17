package com.stlife.data.db.mybatis.pojo;

import java.util.Date;

public class TaskInfo {
    private String uid;

    private String remark;

    private Date createTime;

    private String createAc;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateAc() {
        return createAc;
    }

    public void setCreateAc(String createAc) {
        this.createAc = createAc;
    }
}