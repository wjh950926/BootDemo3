package com.cssl.branches.controller;

import com.cssl.branches.entity.*;
import com.cssl.branches.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class UsersController {
    @Autowired
    private BranchesService bs;

    //查询
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Branches> findAllBranches(){
        return bs.findAll();
    }

    @RequestMapping("/findById")
    @ResponseBody
    public Branches findById(int bid){
        return bs.findById(bid);
    }

    //查询所有的地区名称
    @RequestMapping("/allCname")
    @ResponseBody
    public List<Branches> allCname(){
        return bs.findAll();
    }

    //修改信息
    @RequestMapping("/updateBranches")
   // @ResponseBody
    public String updateBranches(Branches branches){

        int num=bs.updateBranches(branches);
        System.out.print("num:"+num);
        return "redirect:index.html";

    }

    //模糊查询
    @RequestMapping("/mohuName")
    @ResponseBody
    public List<Branches> mohu(String name){
        System.out.print("num:"+name);
        return bs.findByMoHu(name);
    }

    @RequestMapping("/delById")
    public String deleteByid(int bid) {
        bs.deleteBranches(bid);
        return  "redirect:/index.html";
    }

    @RequestMapping("/testmvc")
    public ModelAndView testmvc(ModelAndView mvo) {
        System.out.println("---------testmvc");

        mvo.setViewName("index");
        return  mvo;
    }
}
