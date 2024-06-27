package com.product.api.config;

import org.springframework.context.annotation.Bean;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

public class ProductCacheConfig {

	@Bean
	public Config cacheConfig() {
		return new Config().setInstanceName("hazel-instance")
				.addMapConfig(new MapConfig()
						.setName("product-cache")
						.setTimeToLiveSeconds(3000));
	}
}
