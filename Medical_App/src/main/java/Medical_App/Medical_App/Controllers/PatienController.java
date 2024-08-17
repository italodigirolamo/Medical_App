
package Medical_App.Medical_App.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Medical_App.Medical_App.entities.Patien;
import Medical_App.Medical_App.services.PatienServices;

@RestController
@RequestMapping("/Patien")
public class PatienController {
	
	@Autowired
	private PatienServices patienServices;
	
	@GetMapping
	public ResponseEntity<List<Patien>> PatienList(){
		
		List<Patien> patiens = patienServices.GetAll();
		if(patiens.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(patiens);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Patien> GetbyId(@PathVariable("id") int id){
		Patien patien = patienServices.getPatienById(id); 
		if (patien == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(patien);
		}
	
	
	
	
	
}
