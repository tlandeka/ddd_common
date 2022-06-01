package com.tomo.ddd.domain;

public interface BusinessRule {
    Boolean isRuleComplied();

    String message();
}
