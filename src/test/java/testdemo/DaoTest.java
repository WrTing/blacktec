package testdemo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

public class DaoTest {
    @Test
    public void testjdbc() throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DataSource ds = ctx.getBean(ComboPooledDataSource.class);
        System.out.println(ds.hashCode());
        SqlSessionFactory sf = (SqlSessionFactory)ctx.getBean("sqlSessionFactory");
        System.out.println(sf.hashCode());
        Connection connection = ds.getConnection();
        System.out.println(connection);

System.out.println(connection);
    }
}