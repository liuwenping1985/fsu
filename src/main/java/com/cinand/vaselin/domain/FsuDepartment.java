package com.cinand.vaselin.domain;

import com.cinand.fsu.base.BaseTenantDomain;
import com.cinand.vaselin.constant.IDGenStrategy;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by liuwenping on 2022/1/8.
 */
@Data
@Entity(name="fsu_department")
@GenericGenerator(name = "id", strategy = IDGenStrategy.DISTRIBUTED_IDENTITY)
public class FsuDepartment extends BaseTenantDomain<Long> {

    @Column(name = "unit_id")
    private Long unitId;

    @Column(name = "path")
    private String path;

    @Column(name = "parent_dept_id")
    private Long parentDeptId;


}
