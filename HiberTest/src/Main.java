import java.util.Scanner;

import org.hibernate.Session;


public class Main {

	
	public static void main(String[] args) {
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Usuario user2 = new Usuario();
		
		user2.setNombre("Jorge");
		user2.setObjetivo(50);
		user2.setTotal(20);
		
		session.save(user2);
		
		session.getTransaction().commit();
		
		session.close();
		
		System.out.print("SESSION CERRADA." + "\n" + "Se ha creado : " + user2.getNombre() );
		
	}
	
}
