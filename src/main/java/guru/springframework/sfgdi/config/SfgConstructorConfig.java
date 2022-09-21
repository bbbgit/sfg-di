package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConstructorConfig {

    private final String username;

    public SfgConstructorConfig(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
