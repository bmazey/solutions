package org.columbia.controller;


import org.columbia.dto.GreetingDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class GreetingController {

    @RequestMapping(value = "/api/language", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> get() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/language", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> add(@Valid @RequestBody GreetingDTO greeting) {
        return ResponseEntity.ok(greeting.getContent());
    }

}