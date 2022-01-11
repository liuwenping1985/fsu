package com.cinand.vaselin.domain;

import com.cinand.fsu.base.BaseTenantDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by liuwenping on 2022/1/8.
 */
@Data
@Entity(name="fsu_user_authentication")
public class FsuUserAuthentication extends BaseTenantDomain<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "departmentId")
    private Long departmentId;
    
    @Column(name = "unitId")
    private Long unitId;


}
