package com.example.restwebservicesself;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")

public class ControllerMethod {
	
	@RequestMapping("/Chitti")
	@ResponseBody
	

	public String getbean() {
		
		VariableBean M = new VariableBean();
		M.setID(123456);
		M.setName("Chitz");
		M.setRole("Moo");
		M.setSal(11111111111.1111);
		
		return "hai"; //
	}
/*
 * public VariableBean getbean() {
		
		VariableBean M = new VariableBean();
		M.setID(123456);
		M.setName("Chitz");
		M.setRole("Moo");
		M.setSal(11111111111.1111);
		
		return M; //
	}
	@Controller
	@RequestMapping("/")

	public class ControllerMethod3 {
		
		@RequestMapping("/Chitti1")
		

		public VariableBean getbean3() {
			
			VariableBean K = new VariableBean();
			K.setID(126);
			K.setName("Chi");
			K.setRole("Mo");
			K.setSal(111111112222111.1111);
			
			return K; //returns error as it is expecting a page or obj or..
		}
	

@Controller
@RequestMapping("/")

public class ControlMethod1 {
	@RequestMapping("/ChinChitti")
	@ResponseBody
	
	public String getbean1() {
		
		VariableBean N = new VariableBean();
		N.setID(654321);
		N.setName("Chinni");
		
		return "ChinChitti";
	}

	
	@RestController
	@RequestMapping("/")

	public class ControllerMethod4 {
		
		@RequestMapping("/Chiiii")
		

		public VariableBean getbean4() {
			
			VariableBean I = new VariableBean();
			I.setID(123456);
			I.setName("Chitz");
			I.setRole("Moo");
			I.setSal(2222.1111);
			
			return I;
		}*/
	}
