package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> hashMap=new HashMap<>();
        for(Map.Entry<Integer,String> entry:sourceMap.entrySet()){
            if(hashMap.containsKey(entry.getValue())){
                if(hashMap.get(entry.getValue())>entry.getKey()){
                    hashMap.put(entry.getValue(),entry.getKey());
                }
            }else{
                hashMap.put(entry.getValue(),entry.getKey());
            }
        }
        return hashMap;
    }
}
