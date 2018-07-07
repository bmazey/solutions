package org.columbia.controller;

import org.columbia.service.RumorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class RumorController {

    @Autowired
    RumorService rumorService;

    @RequestMapping(value = "/api/rumor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getRumor() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/rumor/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getRumorById() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/rumor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postRumor() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/rumor/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<?> deleteRumor() {
        return ResponseEntity.ok("success!");
    }
}
