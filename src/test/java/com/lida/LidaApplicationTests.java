package com.lida;

import com.lida.mapper.CustomersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes= LidaApplication.class)
class LidaApplicationTests {

    @Autowired
    private CustomersMapper customersMapper;
    @Test
    void contextLoads() {
    }

}
