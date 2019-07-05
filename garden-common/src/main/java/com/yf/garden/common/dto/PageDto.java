package com.yf.garden.common.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 张继生
 * @date 2019/5/11 15:57
 */
@Getter@Setter
public class PageDto {
    private boolean needPage = true;
    private int pageNum = 1;
    private int pageSize = 10;
}
