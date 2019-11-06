package com.monster.cargo.service.cargoinfo;

import com.monster.cargo.model.SuperCargoInfoDo;

public interface CargoInfoService {

	public SuperCargoInfoDo querySuperCargoInfos(SuperCargoInfoDo superCargoInfoDo);
	
    int insert(SuperCargoInfoDo record);
}
