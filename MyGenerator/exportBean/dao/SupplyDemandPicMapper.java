package dao;

import model.SupplyDemandPic;

public interface SupplyDemandPicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SupplyDemandPic record);

    int insertSelective(SupplyDemandPic record);

    SupplyDemandPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SupplyDemandPic record);

    int updateByPrimaryKey(SupplyDemandPic record);
}