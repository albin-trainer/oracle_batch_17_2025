package com.oracle.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.oracle.entity.Order;
import com.oracle.proxy.ProductsProxy;

@RestController
@RequestMapping("/orders")
public class OrderApi {
	@GetMapping("/{pid}/{q}")
 public Order order(@PathVariable("pid")  int pid, @PathVariable("q") int q) {
	 RestTemplate template=new RestTemplate(); //is Rest Client
	 //here i m hard coded the URL .....
	  Order order= template.getForObject("http://localhost:8000/products/"+pid, Order.class);
	  order.setQuantity(q);
	  order.setPrice(order.getPrice()*q);
	  return order;
 }
	@Autowired
	private RestTemplate template;
	@GetMapping("/loadBalance/{pid}/{q}")
	 public Order orderLoadBalance(@PathVariable("pid")  int pid, @PathVariable("q") int q) {
		  Order order= template.getForObject("http://product-service/products/"+pid, Order.class);
		//  template.postForEntity(null, order, null	
		  order.setQuantity(q);
		  order.setPrice(order.getPrice()*q);
		  return order;
	 }
	@Autowired
	private ProductsProxy proxy;
	@GetMapping("/feign/{pid}/{q}")
	 public Order feignClient(@PathVariable("pid")  int pid, @PathVariable("q") int q) {
		Order order=proxy.findProduct(pid);
		  order.setQuantity(q);
		  order.setPrice(order.getPrice()*q);
		  return order;
	 }
}
