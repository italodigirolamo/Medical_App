package Medical_App.Medical_App.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Medical_App.Medical_App.Repository.PatienRepository;
import Medical_App.Medical_App.entities.Patien;

@Service
public class PatienServices {
	
	@Autowired
	private PatienRepository patienRepository;
	
	public List<Patien> GetAll(){
		return patienRepository.findAll();
		
	} 
	
	public Patien getPatienById (int id) 
	{
		return patienRepository.findById(id).orElse(null);
	}
	
	public Patien Add(Patien patien)
	{
		Patien newPatien = patienRepository.save(patien);
		return newPatien;
	}
	
	
}
