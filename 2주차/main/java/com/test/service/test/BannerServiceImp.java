package com.test.service.test;

import com.test.dao.BannerDao;
import com.test.dto.BannerDto;
import com.test.dto.LectureDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Service
public class BannerServiceImp implements BannerService {
    @Autowired
    BannerDao bannerDao;//bannerDao 객체 주입 등록

    @Override
    public ArrayList<BannerDto> getBannerList() {//강의리스트 가져오기
        System.out.println("banner.do Service do");
        ArrayList<BannerDto> bannerInfoList = bannerDao.getBannerList();//리스트받아서 lectureInfoList에 넣기
        System.out.println("banner.do Service end");
        return bannerInfoList;//값반환
    }

    @Override
    public void deleteBanner(int banNo) {

        bannerDao.deleteBanner(banNo);//강의리스트삭제
    }

    @Override
    public BannerDto selectBanner(int banNo) {
        BannerDto banner = bannerDao.selectBanner(banNo);
        return banner;
    }



    @Override
    public void editBanner(int banNo, String banTitle, String banContent, String banImg) {
        //강의 업데이트(강의 카테고리, 강의이름, 강의 가격, 강의 이미지 매개변수 받아오기)
        System.out.println("banNo = " + banNo + ", banTitle = " + banTitle + ", banContent = " + banContent + ", banImg = " + banImg);
        bannerDao.editBanner(banNo,  banTitle, banContent,  banImg);
    }

    @Override
    public void addBanner( String banTitle, String banContent, String banImg) {
        System.out.println("Service : banTitle = " + banTitle + ", banContent = " + banContent + ", banImg = " + banImg);
        bannerDao.addBanner(banTitle, banContent, banImg);
    }


/*

    @Override
    public void editItemWithoutImage(int lecNo, String lecCategory, String lecName, int lecPrice) {
        System.out.println("service: " + lecCategory + " " + lecName + " " + lecPrice);
        lectureDao.editItemWithoutImage(lecNo, lecCategory, lecName, lecPrice);
    }*/
}
