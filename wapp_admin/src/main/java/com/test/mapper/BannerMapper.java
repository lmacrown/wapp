package com.test.mapper;

import com.test.dto.BannerDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface BannerMapper {
    ArrayList<BannerDto> getBannerList();
    void deleteBanner(@Param("banCount ") int banCount );
    void editBanner(@Param("banCount ") int banCount ,
                    @Param("banTitle") String banTitle,
                    @Param("banContent") String banContent,
                    @Param("banImg") String banImg);
    BannerDto selectBanner(@Param("banCount ") int banCount );
    /*void editItemWithoutImage(@Param("lecNo") int lecNo,
                              @Param("lecCategory") String lecCategory,
                              @Param("lecName") String lecName,
                              @Param("lecPrice") int lecPrice);*/
    void addBanner(@Param("banCount") int banCount,
                   @Param("banTitle") String banTitle,
                    @Param("banContent") String banContent,
                    @Param("banImg") MultipartFile banImg);



}
