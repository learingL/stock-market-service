package com.hiveview.dao;

import com.hiveview.entity.StockData;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockDataMapperDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StockData record);

    int saveDatas(List<StockData> list);

    StockData selectByPrimaryKey(Integer id);
    /**
     * 查询最近一小时数据
     */
    List<StockData> selectOneHour(@Param("productId") int productId);
    /**
     * 查询最新数据
     */
    StockData selectOneFreshData(@Param("productId") int productId);

    //int updateByPrimaryKey(StockData record);
}