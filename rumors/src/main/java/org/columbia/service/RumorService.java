package org.columbia.service;

import org.columbia.dto.RumorDto;
import org.columbia.entity.RumorEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RumorService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RumorJpaRepository repository;

    public RumorEntity getRumorByID(UUID id) {
        return repository.findById(id).get();
    }

    public void createRumor(RumorEntity rumor) {
        repository.save(rumor);
    }

    /**
     * Here we use the model mapper to convert to and from dtos and entities ...
     * @param entity
     * @return
     */

    public RumorDto convertToDto(RumorEntity entity) {
        RumorDto rumor = modelMapper.map(entity, RumorDto.class);
        return rumor;
    }

    public RumorEntity convertToEntity(RumorDto rumor) {
        RumorEntity entity = modelMapper.map(rumor, RumorEntity.class);
        return entity;
    }
}
