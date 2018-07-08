package org.columbia.service;

import org.columbia.dto.RumorDto;
import org.columbia.dto.RumorIdDto;
import org.columbia.entity.RumorEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RumorService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RumorJpaRepository repository;

    /**
     * Here we'll use our JPA repository methods ...
     * @param id
     * @return
     */

    public RumorEntity getRumorByID(UUID id) {
        return repository.findById(id).get();
    }

    public List<RumorIdDto> getAllRumors() {
        List<RumorEntity> rumors = new ArrayList<>();
        repository.findAll().forEach(rumors :: add);

        // Now we have an ArrayList of <RumorEntity> ... but we want to convert it to <RumorIdDto> !
        return rumors.stream()
                .map(rumor -> convertToRumorIdDto(rumor))
                .collect(Collectors.toList());
    }

    public void createRumor(RumorEntity rumor) {
        repository.save(rumor);
    }

    /**
     * Here we use the model mapper to convert to and from dtos and entities ...
     * @param entity
     * @return
     */

    public RumorDto convertToRumorDto(RumorEntity entity) {
        RumorDto rumor = modelMapper.map(entity, RumorDto.class);
        return rumor;
    }

    public RumorIdDto convertToRumorIdDto(RumorEntity entity) {
        RumorIdDto rumor = modelMapper.map(entity, RumorIdDto.class);
        return rumor;
    }

    public RumorEntity convertToRumorEntity(RumorDto rumor) {
        RumorEntity entity = modelMapper.map(rumor, RumorEntity.class);
        return entity;
    }

}
