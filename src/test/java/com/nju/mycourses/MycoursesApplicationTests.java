package com.nju.mycourses;

import com.nju.mycourses.DAO.CurriculumRepository;
import com.nju.mycourses.DAO.UserRepository;
import com.nju.mycourses.entity.Curriculum;
import com.nju.mycourses.entity.User;
import com.nju.mycourses.enums.UserType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MycoursesApplicationTests {

    @Test
    public void contextLoads() {
    }


    /**
     * 发送模板邮件
     */

//    @Autowired
//    private JavaMailSender javaMailSender;
//    @Autowired
//    private TemplateEngine templateEngine;
//    @Test
//    public void sendTemplateMail() {
//        MimeMessage message = javaMailSender.createMimeMessage();
//        try {
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom("877728156@qq.com");
//            helper.setTo("877728156@qq.com");
//            helper.setSubject("Verify Your Account in My Courses");
//
//            Context context = new Context();
//            context.setVariable("id", "test");
//            String emailContent = templateEngine.process("emailTemplate", context);
//            helper.setText(emailContent, true);
//        } catch (MessagingException e) {
//            throw new RuntimeException("Messaging  Exception !", e);
//        }
//        javaMailSender.send(message);
//    }

    @Autowired
    private CurriculumRepository curriculumRepositoryi;

    @Test
    public void test() throws Exception {
        Curriculum c=curriculumRepositoryi.findById((long) 1).get();
        System.out.println(c.getSchedule());
    }
}

