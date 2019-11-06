package com.monster.cargo.service.cargoinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.cargo.dao.SuperCargoInfoMapper;
import com.monster.cargo.model.SuperCargoInfoDo;

@Service("cargoInfoService")
public class CargoInfoServiceImpl implements CargoInfoService{

	@Autowired
	private SuperCargoInfoMapper superCargoInfoMapper;
	
	public SuperCargoInfoDo querySuperCargoInfos(SuperCargoInfoDo superCargoInfoDo){
		return superCargoInfoMapper.selectByPrimaryKey(superCargoInfoDo);
	}

	@Override
	public int insert(SuperCargoInfoDo record) {
		return superCargoInfoMapper.insert(record);
	}
	
}
