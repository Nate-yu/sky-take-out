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

    /**
     * 启用或禁用员工账号
     * @author yubin
     * @date 2025/4/16 20:00
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据id查询员工信息
     * @author yubin
     * @date 2025/4/16 20:26
     * @param id
     * @return com.sky.entity.Employee
     */
    Employee getById(Integer id);

    /**
     * 修改员工信息
     * @author yubin
     * @date 2025/4/16 20:34
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
