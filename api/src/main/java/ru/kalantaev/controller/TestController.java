package ru.kalantaev.controller;


import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class TestController {
    private static final Logger LOGGER = Logger.getLogger(TestController.class);
    @RequestMapping(value = "/test/controller/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> testController(@PathVariable Long id) {
        List<Long> data = Arrays.asList(1L, 2L, 3L, 5L);
        LOGGER.info("Получен запрос testController, параметр id: "+id);
        if (data.contains(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
