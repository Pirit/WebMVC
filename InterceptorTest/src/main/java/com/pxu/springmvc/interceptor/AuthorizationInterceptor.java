package com.pxu.springmvc.interceptor;

import com.pxu.springmvc.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationInterceptor implements HandlerInterceptor {

    private static final String[] IGNORE_URI={"loginForm","/login"};

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
         System.out.println("AuthorizationInterceptor preHandle -->");

         boolean flag = false;

         String servletPath = httpServletRequest.getServletPath();

         for (String s:IGNORE_URI){
             if(servletPath.contains(s)){
                 flag=true;
                 break;
             }
         }

         if (!flag){
             User user = (User) httpServletRequest.getSession().getAttribute("user");

             if (user==null){
                 System.out.println("AuthorizationInterceptor Application: ");
                 httpServletRequest.setAttribute("message","Please login first.");
                 httpServletRequest.getRequestDispatcher("loginForm").forward(httpServletRequest,httpServletResponse);
             }else {
                 System.out.println("Logined and PASS");
                 flag=true;
             }
         }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("AuthorizationInterceptor postHandle -->");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("AuthorizationInterceptor afterCompletion -->");
    }
}
