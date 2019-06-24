package com.example.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.InetAddress;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private InetAddress ip;
    private String hostname;
    private int port;

}
