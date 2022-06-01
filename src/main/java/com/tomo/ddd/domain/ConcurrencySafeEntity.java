package com.tomo.ddd.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@Getter
@Setter
public class ConcurrencySafeEntity extends RootEntity {

    private static final long serialVersionUID = 1L;

    @Version
    private int concurrencyVersion;

    protected ConcurrencySafeEntity() {
        super();
    }

}
