package com.lxd.movie.controller;

import com.lxd.movie.bean.*;
import com.lxd.movie.dao.TypeDao;
import com.lxd.movie.dao.impl.TypeDaoImpl;
import com.lxd.movie.service.*;
import com.lxd.movie.service.impl.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.PrintWriter;
import java.util.Calendar;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private AdminService adminService = new AdminServiceImpl();
    private InforMationService inforMationService = new InformationServiceImpl();
    private TypeDao typeDao = new TypeDaoImpl();
    private CommentService commentService = new CommentServiceImpl();
    private PosterService posterService = new PosterServiceImpl();
    private UserService userService = new UserServiceImpl();
    //更新电影
    @RequestMapping("/updateMovie")
    public ModelAndView update(int id, String daoYan, String zhuYan, String vote,int typeId) {
        InforMation inforMation = new InforMation();
        inforMation.setDaoYan(daoYan);
        inforMation.setZhuYan(zhuYan);
        inforMation.setVote(vote);
        inforMation.setMovieId(id);
        inforMation.setTypeId(typeId);
        inforMationService.updateInfo(inforMation);
        return new ModelAndView("redirect:/view/movie");
    }

    //删除电影
    @RequestMapping("/deleteMovie")
    public ModelAndView delete(int id) {
        inforMationService.deleteInfo(id);
        commentService.deleteCommentByMovieId(id);
        return new ModelAndView("redirect:/view/movie?msg=delete");
    }

    //添加电影
    @RequestMapping("/addMovie")
    public ModelAndView addMovie(String movieName, int typeId, String daoYan, String zhuYan, String vote, MultipartFile photo) throws Exception {
//        返回信息为msg，用来返回前台电影重复信息和图片上传错误信息
        String msg = "success";
        InforMation inforMation = new InforMation();
        inforMation.setMovieName(movieName);
        inforMation.setTypeId(typeId);
        inforMation.setDaoYan(daoYan);
        inforMation.setZhuYan(zhuYan);
        inforMation.setVote(vote);
        //  当文件不为空时做如下操作
        if (!photo.isEmpty()) {
//          用年月日做路径名
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
//          月份从0开始
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            String path = "C:/upload/" + year + "/" + month + "/" + day;
//            获取文件名
            String filename = photo.getOriginalFilename();
            inforMation.setPicAddress(path + "/" + filename);
//            判断文件是否是指定类型文件
            if ("image/jpeg".equals(photo.getContentType())) {
                fileUpload(filename, path, photo);
                int a = inforMationService.addInfo(inforMation);
                if (a == -2) {
                    msg = "movie_repeat";
                    return new ModelAndView("redirect:/view/movie_add?msg=" + msg);
                }
            } else {
                msg = "failure";
                return new ModelAndView("redirect:/view/movie_add?msg=" + msg);
            }
        }
        return new ModelAndView("redirect:/view/movie?msg=" + msg);
    }

    //删除类型
    @RequestMapping("/deleteType")
    public ModelAndView deleteType(int typeId) {
        typeDao.deleteType(typeId);
        return new ModelAndView("redirect:/view/movie_type");
    }

    //添加类型
    @RequestMapping("/addType")
    public ModelAndView addType(String typeName) {
        String msg = "success";
        int a = typeDao.addType(typeName);
        if (a == -2) {
            msg = "type_repeat";
        }
        return new ModelAndView("redirect:/view/movie_type?msg=" + msg);
    }

    //更新评论
    @RequestMapping("/updateComment")
    public ModelAndView updateComment(int id, String commentTitle, String commentContent, String commentAuthor) {
        Comment comment = new Comment();
        comment.setId(id);
        comment.setCommentTitle(commentTitle);
        comment.setCommentContent(commentContent);
        comment.setAuthor(commentAuthor);
        commentService.updateComment(comment);
        return new ModelAndView("redirect:/view/comment");
    }

    //删除评论
    @RequestMapping("/deleteComment")
    public ModelAndView deleteComment(int id) {
        commentService.deleteComment(id);
        return new ModelAndView("redirect:/view/comment");
    }

    //添加评论
    @RequestMapping("/addComment")
    public ModelAndView addComment(String commentTitle, int movieId, String commentContent, String commentAuthor) {
        Comment comment = new Comment();
        comment.setCommentTitle(commentTitle);
        comment.setCommentContent(commentContent);
        comment.setMovieId(movieId);
        comment.setAuthor(commentAuthor);
        commentService.addComment(comment);
        return new ModelAndView("redirect:/view/comment");
    }

    //更新预告片
    @RequestMapping("/updateAdvance")
    public ModelAndView updateAdvance(String MovieName, String Content) {
        inforMationService.updateAdvance(MovieName, Content);
        return new ModelAndView("redirect:/view/advance");
    }

    //删除预告片
    @RequestMapping("/deleteAdvance")
    public ModelAndView deleteAdvance(String MovieName) {
        inforMationService.deleteAdvance(MovieName);
        return new ModelAndView("redirect:/view/advance");
    }

    //添加预告片
    @RequestMapping("/addAdvance")
    public ModelAndView addAdvance(String Content, int MovieId, String AudioAddress, String ShowTime) {
        InforMation inforMation = new InforMation();
        inforMation.setMovieId(MovieId);
        inforMation.setContent(Content);
        inforMation.setAudioAddress(AudioAddress);
        inforMation.setShowTime(ShowTime);
        inforMationService.addAdvance(inforMation);
        return new ModelAndView("redirect:/view/advance");
    }

    //更新预告片
    @RequestMapping("/updatePoster")
    public ModelAndView updatePoster(String PostDescription, int PosterId) {
        posterService.updatePoster(PostDescription, PosterId);
        return new ModelAndView("redirect:/view/poster");
    }

    //删除海报
    @RequestMapping("/deletePoster")
    public ModelAndView deletePoster(int PosterId) {
        posterService.deletePoster(PosterId);
        return new ModelAndView("redirect:/view/poster");
    }

    //添加海报
    @RequestMapping("/addPoster")
    public ModelAndView addPoster(int MovieId, String PostDescription, MultipartFile photo) throws Exception {
        String msg = "success";
        Poster poster = new Poster();
        poster.setMovieId(MovieId);
        poster.setMovieName(inforMationService.selectInfoById(MovieId).getMovieName());
        poster.setPostDescription(PostDescription);
        //  当文件不为空时做如下操作
        if (!photo.isEmpty()) {
//          用年月日做路径名
            String path = "C:/upload/poster";
//            获取文件名
            String filename = photo.getOriginalFilename();
//            判断文件是否是指定文件
            if ("image/jpeg".equals(photo.getContentType())) {
                fileUpload(filename, path, photo);
                poster.setPostAddress(path + "/" + filename);
                posterService.addPoster(poster);
            } else {
                msg = "failure";
                return new ModelAndView("redirect:/view/poster_add?msg=" + msg);
            }
        }
        return new ModelAndView("redirect:/view/poster");
    }

    //更新用户
    @RequestMapping("/updateUser")
    public ModelAndView updateUser(int MemberId, String UserPwd, String Tel, String QQ, String Email) {
        User user = userService.selectUserById(MemberId);
        user.setUserPwd(UserPwd);
        user.setTel(Tel);
        user.setQQ(QQ);
        user.setEmail(Email);
        userService.updateUser(user);
        return new ModelAndView("redirect:/view/user");
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(int MemberId) {
        userService.deleteUser(MemberId);
        return new ModelAndView("redirect:/view/user");
    }

    //更新管理员信息
    @RequestMapping("/updateAdmin")
    public ModelAndView updateAdmin(String adminName, String Pwd,HttpServletRequest request) {
        HttpSession session=request.getSession();
        Admin admin = adminService.selectAdminByName(adminName);
        admin.setPwd(Pwd);
        adminService.updateAdmin(admin);
        session.removeAttribute("adminName");
        session.invalidate();
        return new ModelAndView("redirect:/");
    }

    //封装文件上传公用代码
    public void fileUpload(String filename, String path, MultipartFile photo) throws Exception {
        //  创建文件，如果没有文件夹，则新建
        File file = null;
        if (filename != null) {
            file = new File(path, filename);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
//       完成上传，要在配置文件中指定上传的两种方式之一
        photo.transferTo(file);
    }
}




