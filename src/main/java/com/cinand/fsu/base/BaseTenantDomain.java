package com.cinand.fsu.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 多租户的基础类
 * 至少要继承这个类
 * Created by liuwenping on 2021/6/21.
 * @author liuwenping
 */
@MappedSuperclass
@Data
public abstract class BaseTenantDomain<I extends Serializable> extends BaseTypedDomain<I> {

    @Column(updatable = false,name = "tenant")
    private String tenant;

    @Column(name = "tenant_group_name")
    private String tenantGroupName;

    @Column(name = "tenant_node_name")
    private String tenantNodeName;

}
