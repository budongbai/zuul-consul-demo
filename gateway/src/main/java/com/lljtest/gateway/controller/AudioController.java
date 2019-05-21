package com.lljtest.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody
    public Boolean test() {
        return true;
    }

}
