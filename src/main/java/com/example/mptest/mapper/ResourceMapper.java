package com.example.mptest.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.mptest.entity.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface ResourceMapper extends BaseMapper<Resource> {
    List<Resource> pagingByIds(RowBounds rowBounds, @Param("ids") List<Long> ids);
}
