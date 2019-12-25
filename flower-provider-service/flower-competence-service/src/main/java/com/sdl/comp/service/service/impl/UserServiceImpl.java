package com.sdl.comp.service.service.impl;

import com.sdl.comp.service.entity.SysUser;
import com.sdl.comp.service.mapper.SysUserMapper;
import com.sdl.comp.service.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program flowerPaaS
 * @description:
 * @author: songdeling
 * @create: 2019/12/25 10:25
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService  {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findOne(SysUser sysUser) {
        return sysUserMapper.selectByUserName(sysUser.getUsername(),sysUser.getValid());
    }
}
