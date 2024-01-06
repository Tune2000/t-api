package com.tune.tapiclientsdk;

import com.tune.tapiclientsdk.client.TApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 能够读取application.yml的配置,读取到配置之后,把这个读到的配置设置到我们这里的属性中,
// 这里给所有的配置加上前缀为"tapi.client"
@ConfigurationProperties("tapi.client")
@Data
@ComponentScan
public class TApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public TApiClient tApiClient() {
        return new TApiClient(accessKey, secretKey);
    }

}
