package com.cinand.vaselin.domain;

import com.cinand.fsu.base.BaseTypedDomain;

import javax.persistence.Column;

/**
 * Created by liuwenping on 2022/1/8.
 */
public class FsuTenant extends BaseTypedDomain<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "memo")
    private String memo;
}
