package com.test.service.test;

import com.test.dto.LectureDto;
import com.test.dto.BannerDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface BannerService  {
    ArrayList<BannerDto> getBannerList();
    void addBanner(String banTitle, String banContent, String banImg);
    void deleteBanner(int banNo);
    BannerDto selectBanner(int banNo);
    void editBanner(int banNo,  String banTitle,String banContent, String banImg);

    //void editItemWithoutImage(int lecNo, String lecCategory, String lecName, int lecPrice);
}
