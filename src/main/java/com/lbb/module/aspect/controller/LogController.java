package com.lbb.module.aspect.controller;

import com.lbb.module.aspect.annotation.AfterRead;
import com.lbb.module.aspect.annotation.BeforeRead;
import com.lbb.module.aspect.aop.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping(value="add/{a}/{b}", method = RequestMethod.GET)
    public int add(@PathVariable int a,@PathVariable int b){
        int result = logService.add(a, b);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value="sub/{a}/{b}", method = RequestMethod.GET)
    public int sub(@PathVariable int a,@PathVariable int b){
        int result = logService.sub(a, b);
        System.out.println(result);
        return result;
    }

    @BeforeRead
    @RequestMapping(value="mul/{a}/{b}", method = RequestMethod.GET)
    public int mul(@PathVariable int a,@PathVariable int b){
        int result = logService.mul(a, b);
        System.out.println(result);
        return result;
    }

    @AfterRead
    @RequestMapping(value="div/{a}/{b}", method = RequestMethod.GET)
    public int div(@PathVariable int a,@PathVariable int b){
        int result = logService.div(a, b);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value="remainder/{a}/{b}", method = RequestMethod.GET)
    public int remainder(@PathVariable int a,@PathVariable int b){
        int result = logService.remainder(a, b);
        System.out.println(result);
        return result;
    }
}
