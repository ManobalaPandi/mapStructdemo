package com.trustrace.mapstructdemo.exampleThree;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getStatusStringValue (Boolean status){
        String statusValue = status ? "Active" :  "InActive";
        return statusValue;
    }

    public boolean getStatusbooleanValue (String status){
        return status.equals("Active");
    }
}
