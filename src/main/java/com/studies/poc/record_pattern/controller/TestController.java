package com.studies.poc.record_pattern.controller;

import com.google.gson.Gson;
import com.studies.poc.record_pattern.data.User;
import com.studies.poc.record_pattern.service.LanguageService;
import com.studies.poc.record_pattern.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private LanguageService languageService;
    private static final Gson gson = new Gson();

    @RequestMapping(method=GET, value="/foo")
    public ResponseEntity foo(@RequestParam(name = "userId", required = false) String userId) {
        User user = userService.findById(userId);
        String text = languageService.getTranslatedText(user);
        return ResponseEntity.ok(gson.toJson(text));
    }
}
