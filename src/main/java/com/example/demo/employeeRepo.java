
package com.example.demo;

import com.example.demo.employeeRepo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface employeeRepo extends JpaRepository<employee, Integer>{

	

 
   // public List<employee> findStudentsById(int id);
}

