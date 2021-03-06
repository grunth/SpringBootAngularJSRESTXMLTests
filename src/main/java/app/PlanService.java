package app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {

	private PlanRepository planRepository;
	
	@Autowired
	public PlanService(PlanRepository planRepository) {
		this.planRepository = planRepository;
	}
	
	public List<Plan> findAll() {
		return planRepository.findAll();
		
	}
}
