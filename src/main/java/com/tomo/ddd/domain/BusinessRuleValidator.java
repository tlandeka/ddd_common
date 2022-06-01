package com.tomo.ddd.domain;

import com.tomo.ddd.AssertionConcern;

public abstract class BusinessRuleValidator extends AssertionConcern {
    protected void checkRule(BusinessRule rule) throws BusinessRuleValidationException {
        if (!rule.isRuleComplied()) {
            throw new BusinessRuleValidationException(rule);
        }
    }
}
