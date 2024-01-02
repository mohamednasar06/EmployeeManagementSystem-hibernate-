package com.tyss.employeeManagementSystem;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmpManagement {
	
	Session s;
	Scanner sc=new Scanner(System.in);
	
	public EmpManagement() {
		super();
	}
	public EmpManagement(Session s) {
		super();
		this.s = s;
	}
	public void addEmp() {
		Transaction t=s.beginTransaction();
		System.out.println("enter id of emp");
		int eId=sc.nextInt();
		System.out.println("enter name of Emp");
		String name=sc.next();
		System.out.println("enter sal of emp");
		double sal=sc.nextDouble();
		s.save(new Emp(eId,name,sal));
		t.commit();
		
		
	}
	public void removeEmp() {
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("delete from Emp where id=1");
		if(q.executeUpdate()==1)
			System.out.println("removed");
		else
			System.out.println("not removed");
		t.commit();
		
	}
	public void updateEmp() {
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("update Emp set name=:name where id=:id");
		System.out.println("enter name");
		q.setParameter("name",sc.next());
		q.setParameter("id",sc.next() );
		if(q.executeUpdate()==1)
			System.out.println("updated");
		else
			System.out.println("not updated");
		t.commit();
		
		
	}
	public void searchEmp() {
		Query hql=s.createQuery("from Emp E where E.id=:id");
		hql.setParameter("id",sc.nextInt());
		List l=hql.list();
		System.out.println(l);
		
	}
	public void displayEmp() {
		Query hql=s.createQuery("from Emp ");
		
		List l=hql.list();
		System.out.println(l);
		
	}

}
