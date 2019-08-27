package com.cssl.branches.dao;

import com.cssl.branches.entity.Branches;

import java.util.List;

public interface BranchesDao {

    //查询所有
    public List<Branches> findAll();

    //根据id
    public Branches findById(int id);

    //添加
    public int addBranches(Branches branches);

    //修改
    public int  updateBranches(Branches branches);

    //删除
    public int deleteBranches(int id);

    //模糊查询
    public List<Branches> findByMoHu(String name);
}
