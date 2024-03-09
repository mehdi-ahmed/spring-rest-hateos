package com.mytutorials.spring.springrestjpa;


import com.mytutorials.spring.springrestjpa.payroll.employee.Employee;
import com.mytutorials.spring.springrestjpa.payroll.employee.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData {

    private static final Logger log = LoggerFactory.getLogger(LoadData.class);

    @Bean
    CommandLineRunner initEmployeeData(EmployeeRepository employeeRepository) {

        return args -> {
            log.info(("Preloading " + employeeRepository.save(new Employee("Bilbo Baggins", "burglar"))));
            log.info(("Preloading " + employeeRepository.save(new Employee("Frodo Baggins", "thief"))));
        };
    }
}
