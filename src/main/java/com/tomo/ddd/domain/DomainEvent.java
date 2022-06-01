package com.tomo.ddd.domain;

import java.time.LocalDateTime;

public interface DomainEvent {
    int eventVersion();

    LocalDateTime occurredOn();
}
