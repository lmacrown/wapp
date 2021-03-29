package com.test.mapper;

import com.test.dto.BannerDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface BannerMapper {
    ArrayList<BannerDto> getBannerList();
    void deleteBanner(@Param("banNo") int banNo );
    void editBanner(@Param("banNo") int banNo ,
                    @Param("banTitle") String banTitle,
                    @Param("banContent") String banContent,
                    @Param("banImg") String banImg);
    BannerDto selectBanner(@Param("banNo") int banNo );
    /*void editItemWithoutImage(@Param("lecNo") int lecNo,
                              @Param("lecCategory") String lecCategory,
                              @Param("lecName") String lecName,
                              @Param("lecPrice") int lecPrice);*/
    void addBanner(@Param("banTitle") String banTitle,
                    @Param("banContent") String banContent,
                    @Param("banImg") String banImg);



}
