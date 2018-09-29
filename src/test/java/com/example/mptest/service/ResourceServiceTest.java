package com.example.mptest.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.mptest.entity.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ResourceService.class})
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.mptest.")
public class ResourceServiceTest {

    @Autowired
    ResourceService service;

    @Test
    public void paging() throws Exception {
        Page<Resource> page = new Page<>();
        List<Long> ids = Stream.of(3L, 1L, 2L).collect(Collectors.toList());
        service.paging(page, ids);
        System.out.println("total>>>>"+page.getTotal());
        System.out.println("\nrecords");
        page.getRecords().forEach(System.out::println);
    }

}