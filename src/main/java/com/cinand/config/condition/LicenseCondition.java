package com.cinand.config.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 定义bean是否初始化
 * Created by liuwenping on 2022/1/9.
 */
public class LicenseCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //conditionContext.getBeanFactory().getBean("")

        return true;
    }
}
