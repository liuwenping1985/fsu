package com.cinand.vaselin.domain;

import com.cinand.fsu.base.BaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by liuwenping on 2022/1/8.
 */
@Data
@Entity(name="fsu_user_extended_info")
public class FsuUserExtendedInfo extends BaseDomain<Long> {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "id_no")
    private String idNO;

    @Column(name = "age")
    private Integer age;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;



}
