package com.test.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LectureDto {

    private String lecCategory;
    private int lecNo;
    private String lecName;
    private int lecPrice;
    private Date lecRegDate;
    private String lecImg;

    public String getLecImg() {
        return lecImg;
    }
}
