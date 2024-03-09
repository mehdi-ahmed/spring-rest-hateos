package com.mytutorials.spring.springrestjpa;


import com.mytutorials.spring.springrestjpa.payroll.employee.Employee;
import com.mytutorials.spring.springrestjpa.payroll.employee.EmployeeRepository;
import com.mytutorials.spring.springrestjpa.payroll.order.Order;
import com.mytutorials.spring.springrestjpa.payroll.order.OrderRepository;
import com.mytutorials.spring.springrestjpa.payroll.order.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData {

    private static final Logger log = LoggerFactory.getLogger(LoadData.class);

    @Bean
    CommandLineRunner initEmployeeData(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
            employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar"));
            employeeRepository.save(new Employee("Frodo", "Baggins", "thief"));

            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));


            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));
        };
    }
}
