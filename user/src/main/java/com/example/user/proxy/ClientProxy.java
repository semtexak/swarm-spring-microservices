package com.example.user.proxy;

import com.example.user.proxy.model.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("client")
public interface ClientProxy {

    @GetMapping("/client")
    ClientDTO getClient();
}
