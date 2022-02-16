package com.example.programmingTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/state/")
public class MalaysiaStateController {

    private final MalaysiaStateService malaysiaStateService;

    @Autowired
    public MalaysiaStateController(MalaysiaStateService malaysiaStateService){
        this.malaysiaStateService = malaysiaStateService;
    }

    @GetMapping("/postcode")
    public String getState(@RequestParam String postcode){
        return malaysiaStateService.getState(postcode);
    }


}
