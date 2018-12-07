package cn.bigdog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author shksart
 * @date 2018/12/07 -  17:14
 */

@Controller
public class TestController {

    @RequestMapping("show")
    @ResponseBody
    public String showtime(Map<Object,String> map){
        map.put("hello","你好！");
        //return  "index";
        return "买了付冷";
    }




}
