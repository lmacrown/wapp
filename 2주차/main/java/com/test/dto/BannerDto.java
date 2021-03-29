package com.test.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Getter
@Setter
public class BannerDto {
    private String banTitle;
    private int banCount;//클릭수
    private String banImg;
    private String banContent;
    private Date banRegDate;
    private int banNo;
        //private int lecPrice;
        // private Date lecRegDate;

    public String getBanImg() {
            return banImg;
        }

}
