package tn.esprit.spring.service;

import java.text.ParseException;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IMissionService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionServiceImplTest {

	@Autowired
	IMissionService ms; 
	private static final Logger l = LogManager.getLogger(MissionServiceImplTest.class);

	/*@Test
	public void testRetrieveAllMissions() {
		List<Mission> listMissions = ms.retrieveAllMissions(); 
		// if there are 7 users in DB : 
		Assert.assertEquals(5, listMissions.size());
	}
	*/
	
	/*@Test
	public void testAddMission() throws ParseException {

	Mission m = new Mission("Aycha", "etudiante a esprit"); 
		Mission missionAdded = ms.addMission(m); 
		Assert.assertEquals(m.getName(), missionAdded.getName());
	}*/
 
	@Test
	public void testModifyMission() throws ParseException   {

		Mission m = new Mission("Eya04", "esprit"); 
		Mission missionUpdated  = ms.updateMission(m); 
		Assert.assertEquals(m.getName(), missionUpdated.getName());
	}

	
	/*@Test
	public void testRetrieveMission() {
		Mission missionRetrieved = ms.retrieveMission("1"); 
		Assert.assertEquals(1L, missionRetrieved.getId());
	}*/
	
	/*@Test
	public void testDeleteMission(){
		ms.deleteMission(4);
		Assert.assertNull(ms.retrieveMission(4));
	}*/
	
}
