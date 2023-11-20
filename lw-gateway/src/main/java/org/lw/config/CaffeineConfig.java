package org.lw.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CaffeineConfig {
    @Bean
    public Caffeine buildCaffeine() {
        return Caffeine.newBuilder().maximumSize(1000);
    }
}
