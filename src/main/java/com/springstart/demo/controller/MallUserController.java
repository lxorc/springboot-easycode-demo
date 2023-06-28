package com.springstart.demo.controller;

import com.springstart.demo.entity.MallUser;
import com.springstart.demo.service.MallUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MallUser)表控制层
 *
 * @author makejava
 * @since 2023-06-28 13:35:41
 */
@RestController
@RequestMapping("mallUser")
public class MallUserController {
    /**
     * 服务对象
     */
    @Resource
    private MallUserService mallUserService;

    /**
     * 分页查询
     *
     * @param mallUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<MallUser>> queryByPage(MallUser mallUser) {
        return ResponseEntity.ok(this.mallUserService.queryByPage(mallUser));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<MallUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.mallUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mallUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<MallUser> add(MallUser mallUser) {
        return ResponseEntity.ok(this.mallUserService.insert(mallUser));
    }

    /**
     * 编辑数据
     *
     * @param mallUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<MallUser> edit(MallUser mallUser) {
        return ResponseEntity.ok(this.mallUserService.update(mallUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.mallUserService.deleteById(id));
    }

}

