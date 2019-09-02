package com.lxd.movie.controller;

import com.lxd.movie.bean.Admin;
import com.lxd.movie.service.AdminService;
import com.lxd.movie.service.impl.AdminServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@Controller
public class LoginController {
    private AdminService adminService = new AdminServiceImpl();

    //登陆验证
    @RequestMapping("/admin_Login")
    public ModelAndView adminLogin(String adminName, String adminPass, HttpServletRequest request) {
        int i = adminService.adminLogin(adminName, adminPass);
        ModelAndView modelAndView = new ModelAndView();
//        获取session对象
        HttpSession session = request.getSession();
        if (i == 1) {
//            登陆成功将用户名放置session中
            session.setAttribute("adminName", adminName);
            Admin admin = adminService.selectAdminByName(adminName);
            admin.setLogCount(admin.getLogCount() + 1);
            adminService.updateAdmin(admin);
            return new ModelAndView("redirect:/view/main");
        } else {
//            登陆失败返回信息前台显示
            modelAndView.addObject("msg", "n");
            modelAndView.setViewName("admin_Login");
            return modelAndView;
        }
    }

    //通过Ajax判断是否有这个用户名
    @RequestMapping("/admin_Check")
    public void adminCheck(String adminName, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
//        收到username,判断是否符合要求，将消息返回
        int i = adminService.adminLoginCheck(adminName);
        if (i == 1) {
            out.print(true);
        } else {
            out.print(false);
        }
    }

    //退出登录
    @RequestMapping("/logoutAdmin")
    public ModelAndView logoutAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("adminName");
        session.invalidate();
        return new ModelAndView("redirect:/");
    }

}
