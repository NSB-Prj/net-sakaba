package com.nsb.web;

import com.nsb.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TopController {
    @Autowired
    RoomRepository roomRepository;

    @RequestMapping(method=RequestMethod.GET)
    public String top() {
        roomRepository.findAll().forEach(System.out::println);
        return "index";
    }
}
