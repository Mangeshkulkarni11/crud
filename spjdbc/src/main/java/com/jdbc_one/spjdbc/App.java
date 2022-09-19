package com.jdbc_one.spjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**  
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project is Started..." );
        ApplicationContext con=new ClassPathXmlApplicationContext("com/jdbc_one/spjdbc/new.xml");
        JdbcTemplate temp=(JdbcTemplate)con.getBean("jdbctemp");
        String query="insert into student(id,name,city) values(?,?,?)";
        int result=temp.update(query,2,"Rohan","satara");
        System.out.println("values is inserted="+result);
        
    }
}
