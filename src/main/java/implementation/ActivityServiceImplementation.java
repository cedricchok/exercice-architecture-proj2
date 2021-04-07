package implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apitest.test.dao.ActivityRepository;
import com.apitest.test.models.Activity;
import com.apitest.test.services.ActivityService;

@Service
public class ActivityServiceImplementation implements ActivityService {
	
	@Autowired
	private ActivityRepository actiRepository;

	@Override
	public List<Activity> findAll() {
		List<Activity> liste = new ArrayList<Activity>();
		actiRepository.findAll().forEach(liste::add);
		return liste;
	}

}
