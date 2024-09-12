package com.hxh.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxh.springbootinit.model.entity.Chart;
import com.hxh.springbootinit.service.ChartService;
import com.hxh.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-08-23 15:54:13
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




