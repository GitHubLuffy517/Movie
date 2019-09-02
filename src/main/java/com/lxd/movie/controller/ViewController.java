package com.lxd.movie.controller;

import com.lxd.movie.bean.*;
import com.lxd.movie.dao.TypeDao;
import com.lxd.movie.dao.impl.TypeDaoImpl;
import com.lxd.movie.service.*;
import com.lxd.movie.service.impl.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/view")
public class ViewController {
    private CommentService commentService = new CommentServiceImpl();
    private UserService userService = new UserServiceImpl();
    private InforMationService inforMationService = new InformationServiceImpl();
    private TypeDao typeDao = new TypeDaoImpl();
    private PosterService posterService = new PosterServiceImpl();
    private AdminService adminService = new AdminServiceImpl();

    @RequestMapping("/main")
    //获取信息并跳转到主界面
    public ModelAndView adminMain() {
        ModelAndView modelAndView = new ModelAndView();
        List<Comment> commentList = commentService.selectCommentAll();
//            首页展示评论数量
        int commentCount;
        if (commentList == null) {
            commentCount = 0;
        } else {
            commentCount = commentList.size();
        }
        modelAndView.addObject("commentCount", commentCount);
//            首页展示用户数量
        int userCount = userService.selectUserAll().size();
        modelAndView.addObject("userCount", userCount);
        modelAndView.setViewName("admin_Main");
        return modelAndView;
    }

    //    跳转到电影列表
    @RequestMapping("/movie")
    public ModelAndView movieList() {
        ModelAndView modelAndView = new ModelAndView();
        List<InforMation> infoList = inforMationService.selectInfoAll();
        modelAndView.addObject("infoList", infoList);
        List<Type> typeList = typeDao.selectTypeAll();
//      电影表中存储的为类型的ID，将id对应的类型名存储至map中
        Map<Integer, String> typeMap = new HashMap<>();
        for (Type type : typeList) {
            typeMap.put(type.getTypeId(), type.getTypeName());
        }
        modelAndView.addObject("typeList", typeList);
        modelAndView.addObject("typeMap", typeMap);
        modelAndView.setViewName("movie/admin_Movie_updateMovie");
        return modelAndView;
    }

    //    跳转到电影添加模块
    @RequestMapping("/movie_add")
    public ModelAndView movieAdd(String msg) {
        ModelAndView modelAndView = new ModelAndView();
        List<Type> typeList = typeDao.selectTypeAll();
        modelAndView.addObject("typeList", typeList);
        modelAndView.setViewName("movie/admin_Movie_addMovie");
//            获取添加电影操作返回给前台的提示信息
        if (msg != null) {
            modelAndView.addObject("msg", msg);
        }
        return modelAndView;
    }

    //    跳转到类型添加模块
    @RequestMapping("/movie_type")
    public ModelAndView movieType(String msg) {
        ModelAndView modelAndView = new ModelAndView();
        List<Type> typeList = typeDao.selectTypeAll();
        modelAndView.addObject("typeList", typeList);
        modelAndView.setViewName("movie/admin_Movie_addMovieType");
//        获取添加类型操作返回给前台的提示信息
        if (msg != null) {
            modelAndView.addObject("msg", msg);
        }
        return modelAndView;
    }

    //    跳转到评论模块
    @RequestMapping("/comment")
    public ModelAndView commentManage() {
        ModelAndView modelAndView = new ModelAndView();
        List<Comment> commentList = commentService.selectCommentAll();
        modelAndView.addObject("commentList", commentList);
//            添加评论需要遍历电影获取电影名称
        List<InforMation> infoList = inforMationService.selectInfoAll();
        modelAndView.addObject("infoList", infoList);
        Map<Integer, String> infoMap = new HashMap<>();
        for (InforMation inforMation : infoList) {
            infoMap.put(inforMation.getMovieId(), inforMation.getMovieName());
        }
        modelAndView.addObject("infoMap", infoMap);
        modelAndView.setViewName("comment/admin_Comment");
        return modelAndView;
    }

    //    跳转到添加评论模块
    @RequestMapping("/comment_add")
    public ModelAndView commentAdd() {
        ModelAndView modelAndView = new ModelAndView();
//            添加评论需要遍历电影获取电影名称
        List<InforMation> infoList = inforMationService.selectInfoAll();
        modelAndView.addObject("infoList", infoList);
        modelAndView.setViewName("comment/admin_Comment_addComment");
        return modelAndView;
    }

    //    跳转到预告片模块
    @RequestMapping("/advance")
    public ModelAndView advanceManage() {
        ModelAndView modelAndView = new ModelAndView();
        List<InforMation> advanceList = inforMationService.selectAdvance();
        List<InforMation> advanceNullList = inforMationService.selectAdvanceNull();
        modelAndView.addObject("advanceList", advanceList);
        modelAndView.addObject("advanceNullList", advanceNullList);
        modelAndView.setViewName("advance/admin_Advance");
        return modelAndView;
    }

    //    跳转到预告片添加模块
    @RequestMapping("/advance_add")
    public ModelAndView advanceAdd() {
        ModelAndView modelAndView = new ModelAndView();
        List<InforMation> advanceNullList = inforMationService.selectAdvanceNull();
        modelAndView.addObject("advanceNullList", advanceNullList);
        modelAndView.setViewName("advance/admin_Advance_addAdvance");
        return modelAndView;
    }

    //    跳转到海报模块
    @RequestMapping("/poster")
    public ModelAndView posterManage() {
        ModelAndView modelAndView = new ModelAndView();
        List<Poster> posterList = posterService.selectPostAll();
        modelAndView.addObject("posterList", posterList);
        modelAndView.setViewName("poster/admin_Poster");
        return modelAndView;
    }

    //    跳转到添加海报模块
    @RequestMapping("/poster_add")
    public ModelAndView posterAdd(String msg) {
        ModelAndView modelAndView = new ModelAndView();
        List<InforMation> infoList = inforMationService.selectInfoAll();
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("poster/admin_Poster_addPoster");
        modelAndView.addObject("infoList", infoList);
        return modelAndView;
    }

    //    跳转到用户模块
    @RequestMapping("/user")
    public ModelAndView userManage() {
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.selectUserAll();
        modelAndView.addObject("userList", userList);
        modelAndView.setViewName("admin_User");
        return modelAndView;
    }

    //    跳转到管理员信息模块
    @RequestMapping("/admin")
    public ModelAndView adminManage(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        String adminName = (String) session.getAttribute("adminName");
        Admin admin = adminService.selectAdminByName(adminName);
        modelAndView.addObject("admin", admin);
        modelAndView.setViewName("admin_Admin");
        return modelAndView;
    }

}
