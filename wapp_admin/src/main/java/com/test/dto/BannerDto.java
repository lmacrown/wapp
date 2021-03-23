package com.test.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
    @Setter
    public class BannerDto {
        private String banTitle;
        private int banCount;
        private String banImg;
        private String banContent;
        private int banRegDate;
        //private int lecPrice;
        // private Date lecRegDate;

        public String getLecImg() {
            return banImg;
        }

}
