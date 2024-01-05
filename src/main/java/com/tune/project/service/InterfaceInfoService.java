package com.tune.project.service;

import com.tune.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Tune
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-01-01 23:14:02
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
