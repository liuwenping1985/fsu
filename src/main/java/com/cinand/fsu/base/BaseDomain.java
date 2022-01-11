package com.cinand.fsu.base;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * 基础po类
 * 至少要继承这个类
 * Created by liuwenping on 2021/6/23.
 * @author liuwenping
 */
@MappedSuperclass
@Data
public abstract class BaseDomain<I extends Serializable> {

    @Id
    @Column(length = 36)
    @JSONField(name="id",serializeUsing = ToStringSerializer.class)
    private I id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "memo")
    private String memo;

}