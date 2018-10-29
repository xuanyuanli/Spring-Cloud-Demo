package com.dadazao.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author John Li
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "博客")
public class Blog {
    @ApiModelProperty("主键，唯一标识")
    private Long id;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("内容")
    private String content;
}
