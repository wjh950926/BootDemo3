package com.cssl.branches.service;

import com.cssl.branches.dao.BranchesDao;
import com.cssl.branches.entity.Branches;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@MapperScan(basePackages = "com.cssl.branches.dao")
@Component
public class BranchesServiceImpl implements BranchesService {
    @Autowired
    private BranchesDao bd;

    @Override

    public List<Branches> findAll() {
        return bd.findAll();
    }

    @Override
    public Branches findById(int id) {
        return bd.findById(id);
    }

    @Override
    public int addBranches(Branches branches) {
        return bd.addBranches(branches);
    }

    @Override
    public int updateBranches(Branches branches) {
        return bd.updateBranches(branches);
    }

    @Override
    public int deleteBranches(int id) {
        return bd.deleteBranches(id);
    }

    @Override
    public List<Branches> findByMoHu(String name) {
        System.out.print("name:"+name);
        return bd.findByMoHu(name);
    }
}
