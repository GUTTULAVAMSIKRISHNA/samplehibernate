package sample;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class controller {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int ch;
		do {
			displaymenu();
			System.out.println("enter your choice");
			ch=Integer.parseInt(src.nextLine());
			switch (ch) {
			case 1:
				insertion();
				break;
			case 2:
				delete();
				break;
			case 3:
				update();
				break;
			case 4:
				getall();
				break;
			case 5:
				getbyid();
				break;
			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("invalid operation");
				break;
			}
		} while (ch >0);
	}

	private static void getbyid() {
		// TODO Auto-generated method stub
		
	}

	private static void getall() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("deprecation")
	private static void insertion() {
//		Scanner scr= new Scanner(System.in);
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = md.getSessionFactoryBuilder().build();
		Session s= sf.openSession();
		Transaction t = s.beginTransaction();
		student stu = new student();
		stu.setName("robin");
		stu.setEmail("robin@gmail.com");
		stu.setPassword("1234");
		stu.setNumber(23456789);
		s.save(stu);
		t.commit();
		System.out.println("inserted successfully");
		s.close();
		sf.close();
		
		
	}

	private static void displaymenu() {
		System.out.println("______________________");
		System.out.println("\t1.insertion");
		System.out.println("\t2.delete");
		System.out.println("\t3.update");
		System.out.println("\t4.getall");
		System.out.println("\t5.getbyid");
		System.out.println("______________________");
		
	}

}

