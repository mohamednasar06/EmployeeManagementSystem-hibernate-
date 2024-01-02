package com.tyss.employeeManagementSystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration c=new Configuration().configure().addAnnotatedClass(Emp.class);
        SessionFactory sessionFactory=c.buildSessionFactory();
        Session session=sessionFactory.openSession();
        EmpManagement em=new EmpManagement(session);
          for(;;) {
        	  System.out.println("1.addEmp 2.RemoveEmp 3.searchEmp 4.updateEmp 5.displayEmp 6.exit");
        	  switch(em.sc.nextInt()) {
        	  case 1:
        		  em.addEmp();
        		  break;
        	  case 2:
        		  em.removeEmp();
        		  break;
        	  case 3:
        		  em.searchEmp();
        		  break;
        	  case 4:
        		  em.displayEmp();
        		  break;
        	  case 5:
        		  em.displayEmp();
        		  break;
        	  case 6:
        		  System.exit(1);
        	  
        	  }
          }
          
          
    }
}
