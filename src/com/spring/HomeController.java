package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pkgdbconnection.DBinsert;

import com.bean.LoginBean;
import com.bean.Registerbean;

@Controller
public class HomeController {
	
	@RequestMapping(value="/login",method=RequestMethod.POST)

	public String submit(Model model,@ModelAttribute("loginbean") LoginBean loginbean) throws SQLException

	{
	String uname =loginbean.getUsername();
	System.out.println("uname"+uname);

	DBinsert obj =new DBinsert();


	ResultSet y=obj.select(loginbean.getUsername(),loginbean.getPassword());
    ResultSet y1=obj.emailerror(loginbean.getUsername());
System.out.println(y1);
	System.out.println("register="+y);
	if(y.next())
	{
		if((loginbean.getUsername().equals(y.getString("Email")))&&(loginbean.getPassword().equals(y.getString("Password"))))
			
		{
			 model.addAttribute("firstname",y.getString("Firstname"));
			    model.addAttribute("lastname",y.getString("Lastname"));
		return "home";
	}
	
	
	}
	
	
		 if(y1.next())
			{
				if((loginbean.getUsername().equals(y1.getString("Email"))))
						{
					System.out.println("username");
					model.addAttribute("firstname",y1.getString("Firstname"));
					model.addAttribute("lastname",y1.getString("Lastname"));
					model.addAttribute("username",loginbean.getUsername());
					return "pswdincrct";
						}
	}
	
		 else
		 {
	
	
	return "emailincrct";
	}
	return "";
	}
	
}
	
/*	else if(y1.next())
	{
		if((loginbean.getUsername().equals(y1.getString("Email"))))
				{
			System.out.println("username");
			model.addAttribute("firstname",y1.getString("Firstname"));
			model.addAttribute("lastname",y1.getString("Lastname"));
			model.addAttribute("username",loginbean.getUsername());
			return "pswdincrct";
				}
	}
	else
	{
		model.addAttribute("error", "Login Failed");
		return "emailincrct";
	}
	return uname;
*/


	
	
		

/*	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String submit(Model model,@ModelAttribute("loginBean") LoginBean loginBean)
	{
		if (loginBean.getUsername().equals("admin") && loginBean.getPassword().equals("admin123")){
			model.addAttribute("msg",loginBean.getUsername());
			return "Sucess";
		}else{
			model.addAttribute("error", " Sorry,Invalid Details!!");
			return "home";
		}
	}*/
	
