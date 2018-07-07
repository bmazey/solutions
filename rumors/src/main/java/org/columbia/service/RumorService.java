package org.columbia.service;

import org.columbia.dto.Rumor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RumorService {

    @Autowired
    private RumorJpaRepository repository;

    public Rumor getRumorByID(UUID id) {
        return repository.findById(id).get();
    }
}
