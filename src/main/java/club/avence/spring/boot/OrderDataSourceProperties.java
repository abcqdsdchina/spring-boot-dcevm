package club.avence.spring.boot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("spring.datasource.order")
public class OrderDataSourceProperties {

    private String url;

    private String username;

    private String password;

}
