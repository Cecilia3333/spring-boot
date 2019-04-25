package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
 
 
@RestController
public class employeedao {
 
    @Autowired
    private employeeRepo employeeRepo;
 
    /**
     * 查询
     * @return
     */
    @RequestMapping(value ="/employee" )
    public @ResponseBody List<employee> list() {
        return employeeRepo.findAll();
    }
 
    /**
     * 添加、更新
     * @return
     */
    @RequestMapping(value = "/save")
    public @ResponseBody employee save(employee employee){
        return employeeRepo.save(employee);
    }
 
    /**
     * 删除
     * @param id 用户编号
     * @return
     */
    @RequestMapping(value = "/delete")
    public @ResponseBody List<employee> deleteeEmployees(Integer id){
        employeeRepo.deleteById(id);
        return employeeRepo.findAll();
    }
 
}