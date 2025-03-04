package com.myself03.reflectapply.apply1;

import com.myself03.reflectapply.data.Person;
import org.junit.Test;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/23 18:36
 */
public class NewInstanceTest {
      @Test
      public void test1() throws InstantiationException, IllegalAccessException {
          Class<Person> personClass = Person.class;
          Person person = personClass.newInstance();
          System.out.println(person);


      }
}
