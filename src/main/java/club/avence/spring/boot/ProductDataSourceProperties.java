package club.avence.spring.boot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("spring.datasource.product")
public class ProductDataSourceProperties {

    private String url;

    private String username;

    private String password;

}
