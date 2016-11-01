package com.lamborghivni.controller.lambobackend;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dao.Productdao;
import com.dao.Userdao;
import com.model.Product;
import com.model.User;

public class App 
{
   
	
	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		appobj.scan("com.niit.application");
		System.out.println("welcome");
		appobj.refresh();

		Userdao ud=(Userdao)appobj.getBean("udao");
		
		
		 
        User add = new User();
        add.setUsername("aa");
        add.setPassword("r4");
         add.setEmail("audi");
         add.setAddress("eee");
         add.setState("tn");
         add.setCity("chennai");
         add.setMobile("97911");
         
         Productdao pd=(Productdao)appobj.getBean("pdao");
		 Product add1=new Product();
		 add1.setProductid(1);
		 add1.setProductname("galado");
     	add1.setProductdetails("avaliale");
     	add1.setProductprice("1230000");
     	 
       
        
        	//pd.insert(add1);
        	
      // pd.update(add1);
       
      //pd.delete(add1);
       
       ud.save(add);
        // ud.update(add);
        
       // ud.delete(obj);
	
    }
}

