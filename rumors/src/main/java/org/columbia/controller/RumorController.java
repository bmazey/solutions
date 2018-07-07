package org.columbia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class RumorController {


    @RequestMapping(value = "/api/rumor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getText() {
        return ResponseEntity.ok("success!");
    }


}
