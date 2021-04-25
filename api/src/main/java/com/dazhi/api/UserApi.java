package com.dazhi.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface UserApi {
    @GetMapping
    String getUser();
}
