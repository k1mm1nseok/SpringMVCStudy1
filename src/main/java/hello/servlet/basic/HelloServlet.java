package hello.servlet.basic;

import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        Cookie[] cookies = req.getCookies();
        resp.getWriter().write("username = " + username +" !!!");

        System.out.println("username = " + username);
        System.out.println("cookies = " + cookies);
    }
}
