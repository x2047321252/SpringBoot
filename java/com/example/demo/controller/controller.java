package com.example.demo.controller;
import com.example.demo.bean.Count;
import com.example.demo.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    ResourceService resourceService;
    @RequestMapping(value = "/me/count",method = RequestMethod.PUT)
    @ResponseBody
    public void initCount(@RequestBody Count count) {
        resourceService.initCount(count);
    }
    @RequestMapping(value = "/me/count", method = RequestMethod.POST)
    @ResponseBody
     public void modifyCount(@RequestBody Count count){
                resourceService.addCount(count);
    }

    @RequestMapping(value = "/me/count", method = RequestMethod.GET)
    @ResponseBody
    public  Count getCount() {
                return resourceService.getCount();
    }

}
