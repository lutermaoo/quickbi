package com.hxh.springbootinit.model.vo;

import lombok.Data;

/**BI返回结果
 * @author: huxinhao
 * @create: 2024-9-05 16:44
 **/
@Data
public class BiResponse {

    private String genChart;

    private String genResult;

    private Long chartId;
}
