package de.requalize.config;

import org.springframework.context.annotation.Profile;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession 
@Profile({"prod", "integration"})
public class HttpSessionConfig {
}