package com.dazhi.consumer.client;

import com.dazhi.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "provider/user")
public interface ProviderClient extends UserApi {
}
