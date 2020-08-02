package com.arzds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.config.MaxSizeConfig.MaxSizePolicy;
import com.hazelcast.config.MaxSizeConfigReadOnly;

@Configuration
public class CacheConfiguration {
	@Bean
	public Config cacheConfiguration() {
		return new Config().setInstanceName("Hazel-Cache-instance")
				.addMapConfig(new MapConfig().setName("emp-cache").setTimeToLiveSeconds(2100)
						.setMaxSizeConfig(new MaxSizeConfig(200, MaxSizePolicy.FREE_HEAP_SIZE))
						.setEvictionPolicy(EvictionPolicy.LRU));
	}
}
