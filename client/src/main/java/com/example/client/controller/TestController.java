package com.example.client.controller;

import com.example.client.model.Client;
import com.example.client.proxy.UserProxy;
import com.example.client.proxy.model.UserDTO;
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

    private final UserProxy userProxy;

    @Autowired
    public TestController(UserProxy userProxy) {
        this.userProxy = userProxy;
    }

    @GetMapping("/client")
    public Client getClient() throws UnknownHostException {
        Client client = new Client();
        client.setId(1);
        client.setName("Client 1");
        InetAddress inet = InetAddress.getLocalHost();
        client.setIp(inet);
        client.setHostname(inet.getHostName());
        client.setPort(Integer.parseInt(this.environment.getProperty("local.server.port")));
        System.out.println("THIS IS IT");
        return client;
    }

    @GetMapping("/client/user")
    public UserDTO getUser() {
        return this.userProxy.getUser();
    }

}
