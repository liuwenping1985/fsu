package com.cinand.fsu.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by liuwenping on 2022/1/8.
 *
 * @author liuwenping
 */
@MappedSuperclass
@Data
public abstract class BaseTypedDomain<I extends Serializable> extends BaseDomain<I> {

    @Column(name = "status")
    private Integer status;

    @Column(name = "type")
    private Integer type;

    @Column(name = "is_deleted")
    private Boolean deleted;

    @Column(name = "is_enabled")
    private Boolean enabled;

    @Column(name = "version")
    private String version;


}
