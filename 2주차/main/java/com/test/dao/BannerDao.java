package com.test.dao;

import com.test.dto.BannerDto;
import com.test.mapper.BannerMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public class BannerDao {
    @Autowired
    SqlSession sqlSession;

    public ArrayList<BannerDto> getBannerList(){
        try{
            System.out.println("ban.do Dao do");
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            ArrayList<BannerDto> bannerInfoList = bannerMapper.getBannerList();
            System.out.println("ban.do Dao end");
            return bannerInfoList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void deleteBanner(int banNo){
        try{
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            bannerMapper.deleteBanner(banNo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public BannerDto selectBanner(int banNo){
        try{
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            //System.out.println("select: " + lecNo);
            BannerDto banner = bannerMapper.selectBanner(banNo);
            return banner;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void editBanner(int banNo, String banTitle, String banContent, String banImg){
        try{
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            //System.out.println("edit: " + lecCategory +" "+ lecName +" "+ lecPrice);
            bannerMapper.editBanner(banNo, banTitle, banContent, banImg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /*public void editItemWithoutImage(int lecNo, String lecCategory, String lecName, int lecPrice){
        try{
            LectureMapper lectureMapper = sqlSession.getMapper(LectureMapper.class);
            System.out.println("edit: " + lecCategory +" "+ lecName +" "+ lecPrice);
            lectureMapper.editItemWithoutImage(lecNo, lecCategory, lecName, lecPrice);
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/
    public void addBanner( String banTitle, String banContent, String banImg){
        try{
            System.out.println("aa");
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            System.out.println("Dao : banTitle = " + banTitle + ", banContent = " + banContent + ", banImg = " + banImg);
            bannerMapper.addBanner(banTitle, banContent, banImg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
