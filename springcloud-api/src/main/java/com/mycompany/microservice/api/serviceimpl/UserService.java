package com.mycompany.microservice.api.serviceimpl;

import com.mycompany.microservice.api.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * Created by tao on 17/1/19.
 */
@Service
public class UserService implements IUserService{




    public void sayHello2(){
        System.out.println("hello 2");
    }


    @HystrixCommand(fallbackMethod = "sayHello2")
    public void hello() {
        //try {
        int i = 1 / 0;
        //}catch(Exception ex) {
        //    ex.printStackTrace();
        //}
        System.out.println("hello");
    }
}
