package com.myself06.project.myself_project.juit;

import com.myself06.project.myself_project.domain.Employee;
import com.myself06.project.myself_project.service.NameListService;
import org.junit.Test;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/27 18:39
 */
public class NameLIstServiceTest {
    @Test
    public void test(){
        NameListService nameListService = new NameListService();
        Employee[] employees =nameListService.getALLEmployee();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }

    }

    @Test
    public void test2(){
        NameListService nameListService = new NameListService();
        System.out.println(nameListService.getEmployee(13));

    }
}
