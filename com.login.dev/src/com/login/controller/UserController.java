/**
 * FileName: UserController
 * Author:   hy
 * Date:     2019/9/28 9:24
 * Description: 拦截login请求，用于用户处理功能
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.login.controller;

import com.login.entity.User;
import com.login.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class UserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User loginuser = new User();
        UserService userse = new UserService();
        loginuser.setAccount(req.getParameter("account"));
        loginuser.setPassword(req.getParameter("password"));
        if(userse.Login(loginuser)==null){
            req.getRequestDispatcher("Login.html");
            resp.getWriter().print("用户名或密码错误");
        }else{
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}
