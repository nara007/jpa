package com.sy.test;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import com.sy.one2many.Student;
import com.sy.one2many.Teacher;
import com.sy.one2one.Address;
import com.sy.one2one.Person;

/**
 * Session Bean implementation class MyTest
 */
@Stateless
@Remote(IMyTest.class)
public class MyTest implements IMyTest{

    @Override
	public void addStudents() {
		// TODO Auto-generated method stub
		
    		EntityManager em = factory.createEntityManager();
		 
			Teacher teacher=new Teacher();
			teacher.setName("dajiang");
			Student student=new Student();
			student.setName("xiaoming");
			Student student2=new Student();
			student2.setName("xiaohong");
			Set<Student> set=new HashSet<Student>();
			set.add(student);
			set.add(student2);
			teacher.setStudents(set);
			
		    em.persist(teacher);
		    em.close();
	}

	@Override
	public void getStudents() {
		// TODO Auto-generated method stub
		
    		EntityManager em = factory.createEntityManager();
    		Teacher teacher=em.find(Teacher.class, 3);
    		System.out.println("hello dajiang");
    		Set<Student> myset=teacher.getStudents();
    		System.out.println("hello dajiang2");
    		for(Student stu:myset)
    		{
    			System.out.println(stu.getId()+" "+stu.getName()+"\n");
    		}
    		em.close();
	}

	/**
     * Default constructor. 
     */
    public MyTest() {
        // TODO Auto-generated constructor stub
    	
    }

	@Override
	public String getString(String name) {
		// TODO Auto-generated method stub
		return "hello "+name;
	}

    @PersistenceUnit(unitName="JPADB")
    private EntityManagerFactory factory;
    
	@Override
	public void addOneItem() {
		// TODO Auto-generated method stub
		System.out.println("123\n");
		 EntityManager em = factory.createEntityManager();
//		 em.getTransaction().begin();
		 
		 Person p=new Person();
//		 p.setId(1L);
		 p.setAge(29);
		 p.setName("xiaoming");
		 Address address=new Address();
//		 address.setId(1L);
		 address.setStreet("zhonghua");
		 address.setCity("saimata");
		 address.setCountry("Japan");
		 p.setAddress(address);
		 em.persist(p);
//		 em.getTransaction().commit();
		 em.close();
//		 factory.close();
		 
		System.out.println("456\n");
	}

}
