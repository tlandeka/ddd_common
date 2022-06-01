package com.tomo.ddd.event;

import com.tomo.ddd.domain.DomainEvent;

import java.util.List;

public interface EventStore {

    List<StoredEvent> allStoredEventsBetween(Long aLowStoredEventId, Long aHighStoredEventId);

    List<StoredEvent> allStoredEventsSince(Long aStoredEventId);

    StoredEvent append(DomainEvent aDomainEvent);

    void close();

    long countStoredEvents();
}
