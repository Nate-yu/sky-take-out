package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @author yubin
     * @date 2025/4/15 19:57
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     * @author yubin
     * @date 2025/4/16 19:14
     * @param employeePageQueryDTO
     * @return com.sky.result.PageResult
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
