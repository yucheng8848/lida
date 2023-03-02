package com.lida.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lida.entity.Customers;
import com.lida.service.CustomersService;
import com.lida.mapper.CustomersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author yucheng
* @description 针对表【customers】的数据库操作Service实现
* @createDate 2023-02-27 20:22:29
*/
@Service
public class CustomersServiceImpl extends ServiceImpl<CustomersMapper, Customers>
    implements CustomersService{

}




