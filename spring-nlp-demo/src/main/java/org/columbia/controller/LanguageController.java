package org.columbia.controller;

import org.columbia.dto.GreetingDTO;
import org.columbia.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "/api/language", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getGreeting() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/language", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postGreeting(@Valid @RequestBody GreetingDTO greeting) {
        languageService.parseEnglishSentence(greeting.getContent());
        return ResponseEntity.ok(greeting.getContent());
    }

}