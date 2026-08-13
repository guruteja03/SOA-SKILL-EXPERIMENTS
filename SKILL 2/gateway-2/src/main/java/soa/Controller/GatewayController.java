package soa.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import soa.Service.GatewayService;

@RestController

public class GatewayController {
	GatewayService GS;
	public GatewayController(GatewayService GS) {
		this.GS=GS;
		
	}
	public Object getService(@PathVariable String service,@PathVariable String endpoint) {
		return GS.invokeService(service, endpoint);
		
	}

}
