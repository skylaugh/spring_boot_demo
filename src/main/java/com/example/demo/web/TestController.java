package com.example.demo.web;

import com.example.demo.service.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leojia on 2018-03-01
 */
@Controller
public class TestController {

    @Autowired
    private TestProperties testProperties;
    @RequestMapping("/hello")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://demo.example.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "test";
    }
}
