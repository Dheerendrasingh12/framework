package com.arzds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.config.MaxSizeConfig.MaxSizePolicy;
@Configuration
public class CacheConfig {
	@Bean
	public Config CacheConfig() {
		// TODO Auto-generated constructor stub
		return new Config().setInstanceName("hazel-cast")
				.addMapConfig(new MapConfig().setName("coupon-cache").setTimeToLiveSeconds(2000)
						.setMaxSizeConfig(new MaxSizeConfig(200, MaxSizePolicy.FREE_HEAP_SIZE))
						.setEvictionPolicy(EvictionPolicy.LRU));
	}

}
