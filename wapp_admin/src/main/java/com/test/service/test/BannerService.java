package com.test.service.test;

import com.test.dto.LectureDto;
import com.test.dto.BannerDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface BannerService {
    ArrayList<BannerDto> getBannerList();
    void deleteBanner(int banCount);
    BannerDto selectBanner(int banCount);
    void editBanner(int banCount, String banContent, String banTitle, String banImg);
    void addBanner(int banCount, String banTitle, String banContent, MultipartFile banImg);
    //void editItemWithoutImage(int lecNo, String lecCategory, String lecName, int lecPrice);
}
