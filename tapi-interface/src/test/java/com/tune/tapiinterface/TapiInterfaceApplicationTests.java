package com.tune.tapiinterface;

import com.tune.tapiclientsdk.client.TApiClient;
import com.tune.tapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TapiInterfaceApplicationTests {

    @Resource
    private TApiClient tApiClient;

    @Test
    void contextLoads() {
        String result = tApiClient.getNameByGet("tune");
        User user = new User();
        user.setUsername("tune123");
        String usernameByPost = tApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
