package com.david.imdbbsssm.web.controller;

/**
 * @Author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 关于主页的controller
 */
@Controller
public class MainController {

    /**
     * 显示主页
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
