package com.example.client.proxy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.net.InetAddress;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

    private int id;
    private String name;
    private InetAddress ip;
    private String hostname;
    private int port;

}
