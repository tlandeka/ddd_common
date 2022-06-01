package com.tomo.ddd.infrastructure.persistence.springdata.jpa;

import com.tomo.ddd.event.StoredEvent;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StoredEventJpaRepository extends McCrudRepository<StoredEvent, Long> {

    List<StoredEvent> findAllByEventIdLessThanEqualAndEventIdGreaterThanEqual(Long aLowStoredEventId, Long aHighStoredEventId);

    List<StoredEvent> findAllByOccurredOnGreaterThanEqual(LocalDateTime aLowOccurredOn);

    List<StoredEvent> findAllByEventIdGreaterThanEqual(Long aLowStoredEventId);

}
