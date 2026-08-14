package soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import soa.service.GatewayService;


@RestController
public class GatewayController {
	@Autowired
	GatewayService GS;
	  public GatewayController(GatewayService GS) {
	    this.GS = GS;
	  }
	  
	  @GetMapping("{serviceName}/{operation}")
	  public Object getService(@PathVariable
	      String serviceName, @PathVariable String operation)
	  {
	    return GS.invokeService(HttpMethod.GET, serviceName, operation, null);
	  }
	  
	  @PostMapping("{serviceName}/{operation}")
	  public Object getService(@PathVariable String serviceName, 
	               @PathVariable String operation,
	               @RequestBody java.util.Map<String, Object> data)
	  {
	    return GS.invokeService(HttpMethod.POST, serviceName, operation, data);
	  }
}
