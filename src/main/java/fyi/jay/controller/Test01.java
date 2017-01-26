package fyi.jay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jyu on 1/25/17.
 */
@RestController
public class Test01 {

    @Value("${something}")
    String something;

    @RequestMapping("/")
    public @ResponseBody
    String getSomething() {
        return something;
    }

}
