package com.example.client.proxy;

import com.example.client.proxy.model.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user", fallbackFactory = UserProxy.UserProxyFallback.class)
public interface UserProxy {

    @GetMapping("/user")
    UserDTO getUser();

    static class UserProxyFallback implements UserProxy {

        @Override
        public UserDTO getUser() {
            return new UserDTO(-1, "NULL", null, null, -1);
        }
    }
}
