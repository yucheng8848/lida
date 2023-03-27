package com.lida;

import com.lida.entity.Businesses;
import com.lida.entity.Customers;
import com.lida.mapper.BusinessesMapper;
import com.lida.mapper.ValuationMapper;
import com.lida.vo.BusinessesVo;
import com.lida.vo.OrdersVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MybaitsPlusTest {

    @Autowired
    private ValuationMapper valuationMapper;

    @Autowired
    private BusinessesMapper businessesMapper;

    @Test
    public void testSelectList(){

        //通过条件构造器查询list
        BusinessesVo businessesVo = businessesMapper.selectAllById(3);
//        list.forEach(System.out::println);
        System.out.println(businessesVo);
    }
}
