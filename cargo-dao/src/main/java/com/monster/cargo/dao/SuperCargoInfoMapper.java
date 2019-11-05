package com.monster.cargo.dao;

import com.monster.cargo.model.SuperCargoInfoDo;

public interface SuperCargoInfoMapper {

    int deleteByPrimaryKey(SuperCargoInfoDo key);

    int insert(SuperCargoInfoDo record);

    int insertSelective(SuperCargoInfoDo record);

    SuperCargoInfoDo selectByPrimaryKey(SuperCargoInfoDo key);

    int updateByPrimaryKeySelective(SuperCargoInfoDo record);

    int updateByPrimaryKey(SuperCargoInfoDo record);
}