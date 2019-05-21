package com.lljtest.serviceb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liulijuan
 * @date 2019/5/16 9:45
 */
@Controller
@RequestMapping("/v1")
public class AudioController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    @ResponseBody
    public Boolean pageRecentTopAudio() {
        return true;
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Boolean test() {
        System.out.println("---test  B");
        return true;
    }

}
