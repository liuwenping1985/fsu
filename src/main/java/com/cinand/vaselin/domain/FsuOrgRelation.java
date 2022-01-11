package com.cinand.vaselin.domain;

import com.cinand.fsu.base.BaseDomain;
import com.cinand.vaselin.constant.RelationType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by liuwenping on 2022/1/8.
 */
@Data
@Entity(name="fsu_org_relation")
public class FsuOrgRelation extends BaseDomain<Long> {

    @Column(name = "relation_type")
    private RelationType relationType;

    @Column(name = "from_object_id")
    private Long fromObjectId;

    @Column(name = "to_object_id")
    private Long toObjectId;

}
