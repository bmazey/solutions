package org.columbia.controller;

import org.columbia.dto.RumorDto;
import org.columbia.entity.RumorEntity;
import org.columbia.service.RumorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("api")
public class RumorController {

    @Autowired
    RumorService rumorService;

    @RequestMapping(value = "/rumor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getRumor() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/rumor/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getRumorById(@PathVariable UUID id) {
        RumorEntity rumor = rumorService.getRumorByID(id);
        return ResponseEntity.ok(rumorService.convertToDto(rumor));
    }

    @RequestMapping(value = "/rumor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postRumor(@RequestBody RumorDto rumor) {
        RumorEntity entity = rumorService.convertToEntity(rumor);
        rumorService.createRumor(entity);
        return ResponseEntity.ok(entity);
    }

    @RequestMapping(value = "/rumor/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<?> deleteRumor(@PathVariable UUID id) {
        return ResponseEntity.ok("success!");
    }
}
