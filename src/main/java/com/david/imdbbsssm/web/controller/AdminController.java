package com.david.imdbbsssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ：程序员小冰
 * @新浪微博 ：https://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @GitEE: https://gitee.com/mcxiaobing
 */
@Controller
public class AdminController {

    @RequestMapping("/login")
    public String login(){
        System.out.print("hello login");
        return  null;
    }

}
