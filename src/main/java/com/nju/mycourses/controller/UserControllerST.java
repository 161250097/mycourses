package com.nju.mycourses.controller;

import com.nju.mycourses.DAO.UserRepository;
import com.nju.mycourses.entity.User;
import com.nju.mycourses.util.CookieUtils;
import com.nju.mycourses.util.Prompt;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserControllerST {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/homepageST")
    public String homepageST(HttpServletRequest request, Model model) {
        String userName=CookieUtils.getCookieValue(request,"userName");
        model.addAttribute("userName",userName);
        return "homepageST";
    }

    @GetMapping("/profileST")
    public String profileST(HttpServletRequest request, Model model) {
        String userName=CookieUtils.getCookieValue(request,"userName");
        User user=userRepository.findByUserName(userName);
        model.addAttribute("userName",userName);
        model.addAttribute("grade",user.getStudentGrade());
        model.addAttribute("studentID",user.getStudentID());
        model.addAttribute("email",user.getEmail());
        return "profileST";
    }

    @PostMapping("/cancelST")
    public void cancelST(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userName=CookieUtils.getCookieValue(request,"userName");
        User user=userRepository.findByUserName(userName);
        user.setActive(false);
        userRepository.save(user);
        Prompt prompt=new Prompt("Cancel successfully!");
        response.setContentType("application/json; charset=UTF-8");
        response.getWriter().print(new JSONObject(prompt));
    }
}
