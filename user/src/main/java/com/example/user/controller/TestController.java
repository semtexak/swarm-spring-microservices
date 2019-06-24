package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.proxy.ClientProxy;
import com.example.user.proxy.model.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @Autowired
    Environment environment;

    private final ClientProxy clientProxy;

    @Autowired
    public TestController(ClientProxy clientProxy) {
        this.clientProxy = clientProxy;
    }

    @GetMapping("/user")
    public User getUser() throws UnknownHostException {
        User user = new User();
        user.setId(1);
        user.setName("User 1");
        InetAddress inet = InetAddress.getLocalHost();
        user.setIp(inet);
        user.setHostname(inet.getHostName());
        user.setPort(Integer.parseInt(this.environment.getProperty("local.server.port")));
        System.out.println("THIS IS IT");
        return user;
    }

    @GetMapping("/user/client")
    public ClientDTO getClient() {
        return this.clientProxy.getClient();
    }

}
