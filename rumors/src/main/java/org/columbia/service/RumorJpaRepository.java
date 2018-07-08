package org.columbia.service;

import org.columbia.entity.RumorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RumorJpaRepository extends CrudRepository<RumorEntity, UUID> { }
