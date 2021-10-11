package com.example.demo.service;

import com.example.demo.bean.Count;
import com.example.demo.manager.ResourceManager;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class ResourceService {
    public void addCount(Count count) {
        if (count!=null){
            ResourceManager.getInstance().addCount(count.getCount());
        }
    }
    public void minusCount(Count count){
        if(count!=null){
            ResourceManager.getInstance().minusCount(count.getCount());
        }
    }
    public Count getCount() {
        Count count = new Count();
        count.setCount(ResourceManager.getInstance().getCount());
        return count;
    }
    public void initCount(Count count) {
        if (count != null){
            ResourceManager.getInstance().initCount(count.getCount());
        }
    }

}
