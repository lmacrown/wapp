package com.test.dao;

import com.test.dto.BannerDto;
import com.test.dto.LectureDto;
import com.test.mapper.BannerMapper;
import com.test.mapper.LectureMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import sun.font.CompositeFont;

import java.util.ArrayList;

@Repository
public class BannerDao {


    @Autowired
    SqlSession sqlSession;

    public ArrayList<BannerDto> getBannerList(){
        try{
            System.out.println("ban.do Dao do");
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            ArrayList<BannerDto> BannerInfoList = bannerMapper.getBannerList();
            System.out.println("lec.do Dao end");
            return BannerInfoList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void deleteBanner(int banCount){
        try{
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            bannerMapper.deleteBanner(banCount);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public BannerDto selectBanner(int banCount){
        try{
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            //System.out.println("select: " + lecNo);
            BannerDto banner = bannerMapper.selectBanner(banCount);
            return banner;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void editBanner(int banCount,  String banContent, String banTitle,  String banImg){
        try{
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            //System.out.println("edit: " + lecCategory +" "+ lecName +" "+ lecPrice);
            bannerMapper.editBanner(banCount, banContent, banTitle, banImg);
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
    public void addBanner(int banCount, String banTitle, String banContent, MultipartFile banImg){
        try{
            BannerMapper bannerMapper = sqlSession.getMapper(BannerMapper.class);
            //System.out.println("dao: " + lecCategory +" "+ lecName +" "+ lecPrice);
            bannerMapper.addBanner(banCount, banTitle, banContent, banImg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
