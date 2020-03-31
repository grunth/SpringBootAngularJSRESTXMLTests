package app;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlanResource {

	private PlanService planService;
	
	public PlanResource(PlanService planService) {
		this.planService = planService;
	}
	
	@RequestMapping(value="plans", method = RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Plan> getAllPlans() {
		return planService.findAll();
	}
}
