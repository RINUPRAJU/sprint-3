package com.spring;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import pkgdbconnection.DBinsert;

import com.bean.Registerbean;


@Controller
public class hellocontroller {
@RequestMapping(value="/")
public String init(Model model)
{
	model.addAttribute("msg", "Welcome to spring frame work");
	return "index";
}
public String saveDirectory= "C:/Users/user/Desktop/jinu";
@RequestMapping(value="/reg",method=RequestMethod.POST)
public String submit(Model model,@ModelAttribute("registerbean") Registerbean registerbean,BindingResult Result,@RequestParam CommonsMultipartFile file) throws SQLException

{
String fname =registerbean.getFirstname();
System.out.println(fname);
return fname;

/*DBinsert obj =new DBinsert();
String dob=registerbean.getYear()+"/"+registerbean.getMonth()+"/"+registerbean.getDay();
String filename=file.getOriginalFilename();
System.out.println("image="+registerbean.getFile());
//String filename=registerbean.getFile();
String y=obj.insert(registerbean.getFirstname(),registerbean.getLastname(),registerbean.getEmail(), registerbean.getReemail(), registerbean.getPassword(),filename,dob,registerbean.getGender());


System.out.println("register="+y);

if(y.equals("success"))
{
	try{
		byte barr[]=file.getBytes();
		BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(saveDirectory+"/"+filename));
		bout.write(barr);
		bout.flush();
		bout.close();
		} catch(Exception e ){System.out.println(e);}
		model.addAttribute("img",saveDirectory+"/"+filename);
		//return new ModelAndView("upload-success","filename",saveDirectory+"/"+filename);
		//model.addAttribute("fname", y.getString("vchr_first_name"));
		
	

    model.addAttribute("firstname", registerbean.getFirstname());
    model.addAttribute("lastname", registerbean.getLastname());
    model.addAttribute("email", registerbean.getEmail());
    model.addAttribute("reemail", registerbean.getReemail());
	model.addAttribute("pswd", registerbean.getPassword());
	model.addAttribute("file",filename);
	model.addAttribute("dob",dob);
	model.addAttribute("gender", registerbean.getGender());

	return "home";
}
else
{
	model.addAttribute("error", "Registration Failed");
	return "index";
}
*/
}
@RequestMapping(value="/create",method=RequestMethod.POST)
public String create(Model model,@ModelAttribute("registerbean") Registerbean registerbean,BindingResult Result,@RequestParam CommonsMultipartFile file) throws SQLException
{
	DBinsert obj =new DBinsert();
	String dob=registerbean.getYear()+"/"+registerbean.getMonth()+"/"+registerbean.getDay();
	String filename=file.getOriginalFilename();
	try{
		byte barr[]=file.getBytes();
		BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(saveDirectory+"/"+filename));
		bout.write(barr);
		bout.flush();
		bout.close();
		} catch(Exception e ){System.out.println(e);}
	String result =obj.insert(registerbean.getFirstname(),registerbean.getLastname(),registerbean.getEmail(), registerbean.getReemail(), registerbean.getPassword(),filename,dob,registerbean.getGender());
 
	if(result.equals("success"))
	{
		model.addAttribute("firstname", registerbean.getFirstname());
		model.addAttribute("lastname", registerbean.getLastname());
		model.addAttribute("file",filename);
		return "home";
	}
	else
	{
		return "index";
	}
	
}



}
