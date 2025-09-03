package com.oracle.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.oracle.entity.Order;
@FeignClient(name = "product-service")
public interface ProductsProxy {
   @GetMapping("/products/{pid}")
	Order findProduct(@PathVariable("pid") int pid);
}
