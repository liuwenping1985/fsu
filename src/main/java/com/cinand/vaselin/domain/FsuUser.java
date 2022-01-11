package com.cinand.vaselin.domain;

import com.cinand.fsu.base.BaseTenantDomain;
import com.cinand.vaselin.constant.UserType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by liuwenping on 2022/1/8.
 */
@Data
@Entity(name="fsu_user")
public class FsuUser extends BaseTenantDomain<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "department_id")
    private Long departmentId;

    @Column(name = "unit_id")
    private Long unitId;

    @Column(name = "user_type")
    private UserType userType;



}
