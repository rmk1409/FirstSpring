package model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Roma on 16.09.2016.
 */
public class FirstBeanTest {

    @Test
    public void testBean() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        FirstBean bean = context.getBean(FirstBean.class);

        assertEquals(bean.getNumber(), 777);
        assertEquals(bean.getName(), "Alsi");
    }

}