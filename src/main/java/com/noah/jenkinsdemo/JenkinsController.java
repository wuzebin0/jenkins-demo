package com.noah.jenkinsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wuzeb
 * @Date: 2019/5/31 16:29
 * @Description:
 */
@Controller
public class JenkinsController {


    @RequestMapping("jenkins")
    public String testDemo(){
        return "Jenkins测试!";
    }
}
