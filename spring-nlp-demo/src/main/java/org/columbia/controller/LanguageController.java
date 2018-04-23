package org.columbia.controller;

import org.columbia.dto.PartOfSpeechDto;
import org.columbia.dto.TextDto;
import org.columbia.entity.PartOfSpeechEntity;
import org.columbia.service.LanguageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LanguageController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "/api/language", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getText() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/language", method = RequestMethod.POST)
    @ResponseBody
    public List<PartOfSpeechDto> postText(@RequestBody TextDto textDto) {
        PartOfSpeechEntity posEntity = convertToEntity(textDto);

        //call service here ...
        List<PartOfSpeechEntity> posEntities = languageService.parseEnglishSentence(posEntity);
        return posEntities.stream()
                .map(parsedPosEntity -> convertToDto(parsedPosEntity))
                .collect(Collectors.toList());
    }

    private PartOfSpeechDto convertToDto(PartOfSpeechEntity posEntity) {
        PartOfSpeechDto posDto = modelMapper.map(posEntity, PartOfSpeechDto.class);
        posDto.setText(posEntity.getText());

        //call services here ...

        return posDto;
    }

    private PartOfSpeechEntity convertToEntity(PartOfSpeechDto posDto) {
        PartOfSpeechEntity  posEntity = modelMapper.map(posDto, PartOfSpeechEntity.class);

        //call services here ...

        return posEntity;
    }

    private PartOfSpeechEntity convertToEntity(TextDto text) {
        PartOfSpeechEntity  posEntity = modelMapper.map(text, PartOfSpeechEntity.class);
        posEntity.setText(text.getText());

        //call services here ...

        return posEntity;
    }

}