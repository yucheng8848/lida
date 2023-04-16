package com.lida;

import com.lida.controller.LikesController;
import com.lida.entity.Businesses;
import com.lida.entity.Customers;
import com.lida.entity.Likes;
import com.lida.mapper.BusinessesMapper;
import com.lida.mapper.LikesMapper;
import com.lida.mapper.ValuationMapper;
import com.lida.vo.BusinessesVo;
import com.lida.vo.OrdersVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MybaitsPlusTest {

    @Resource
    private ValuationMapper valuationMapper;

    @Resource
    private BusinessesMapper businessesMapper;

    @Resource
    private LikesController likesController;

    @Resource
    private LikesMapper likesMapper;

    @Test
    public void testSelectList(){
//        Likes likes = new Likes();
//        likes.setCustomerId(1);
//        likes.setBusinessesId(1);
//
//        likesController.update(likes);
        //通过条件构造器查询list
//        BusinessesVo businessesVo = businessesMapper.selectAllById(3);
//        list.forEach(System.out::println);
//        System.out.println(businessesVo);
    }
}
