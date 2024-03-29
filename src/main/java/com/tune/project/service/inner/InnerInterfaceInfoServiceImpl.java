package com.tune.project.service.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tune.project.common.ErrorCode;
import com.tune.project.exception.BusinessException;
import com.tune.project.mapper.InterfaceInfoMapper;
import com.tune.tapicommon.model.entity.InterfaceInfo;
import com.tune.tapicommon.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
