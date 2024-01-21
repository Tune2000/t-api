package com.tune.project.service.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tune.project.common.ErrorCode;
import com.tune.project.exception.BusinessException;
import com.tune.project.mapper.UserMapper;
import com.tune.tapicommon.model.entity.User;
import com.tune.tapicommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
