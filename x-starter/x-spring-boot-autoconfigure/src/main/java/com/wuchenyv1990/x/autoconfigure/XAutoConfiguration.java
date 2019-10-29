package com.wuchenyv1990.x.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(XProperties.class)
public class XAutoConfiguration {
}
