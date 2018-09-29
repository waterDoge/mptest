package com.example.mptest.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.mptest.entity.Resource;
import com.example.mptest.mapper.ResourceMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    private ResourceMapper mapper;

    public ResourceService(ResourceMapper mapper) {
        this.mapper = mapper;
    }

    public void paging(Page<Resource> page, List<Long> ids) {
        final List<Resource> resources = mapper.pagingByIds(page, ids);
        page.setRecords(resources);
    }

}
