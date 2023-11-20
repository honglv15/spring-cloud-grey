package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    ServerProperties serverProperties;


    @GetMapping("{orderId}")
    public String queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        return serverProperties.getPort().toString();
    }


}
