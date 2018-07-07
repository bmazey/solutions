package org.columbia.controller;

import org.columbia.dto.Rumor;
import org.columbia.service.RumorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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
    public ResponseEntity<?> getRumorById(@PathVariable UUID id) {
        Rumor rumor = rumorService.getRumorByID(id);
        return ResponseEntity.ok(rumor);
    }

    @RequestMapping(value = "/api/rumor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postRumor(@RequestBody Rumor rumor) {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/rumor/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<?> deleteRumor(@PathVariable UUID id) {
        return ResponseEntity.ok("success!");
    }
}
