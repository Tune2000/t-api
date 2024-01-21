package com.tune.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tune.tapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Tune
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-01-09 19:57:43
* @Entity com.tune.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




