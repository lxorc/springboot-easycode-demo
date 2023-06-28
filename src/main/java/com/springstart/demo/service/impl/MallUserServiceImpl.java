package com.springstart.demo.service.impl;

import com.springstart.demo.entity.MallUser;
import com.springstart.demo.dao.MallUserDao;
import com.springstart.demo.service.MallUserService;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MallUser)表服务实现类
 *
 * @author makejava
 * @since 2023-06-28 13:35:47
 */
@Service("mallUserService")
public class MallUserServiceImpl implements MallUserService {
    @Resource
    private MallUserDao mallUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MallUser queryById(Integer id) {
        return this.mallUserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param mallUser 筛选条件
//     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MallUser> queryByPage(MallUser mallUser) {
        return new PageImpl<>(this.mallUserDao.queryAll(mallUser));
    }

    /**
     * 新增数据
     *
     * @param mallUser 实例对象
     * @return 实例对象
     */
    @Override
    public MallUser insert(MallUser mallUser) {
        this.mallUserDao.insert(mallUser);
        return mallUser;
    }

    /**
     * 修改数据
     *
     * @param mallUser 实例对象
     * @return 实例对象
     */
    @Override
    public MallUser update(MallUser mallUser) {
        this.mallUserDao.update(mallUser);
        return this.queryById(mallUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.mallUserDao.deleteById(id) > 0;
    }
}
