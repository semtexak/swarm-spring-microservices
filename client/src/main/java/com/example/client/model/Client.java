package com.example.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.InetAddress;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    private int id;
    private String name;
    private InetAddress ip;
    private String hostname;
    private int port;

}
