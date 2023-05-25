package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "RequestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---all parameter find---");
        req.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + " = " + req.getParameter(paramName)));
        System.out.println("---all parameter find end---");
        System.out.println();

        System.out.println("---single parameter find---");
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        System.out.println("age = " + age);
        System.out.println("username = " + username);
        System.out.println("---single parameter find end---");
        System.out.println();

        System.out.println("---same parameter find---");
        String[] usernames = req.getParameterValues("username");
        for (String name : usernames){
            System.out.println("name = " + name);
        }
        System.out.println("---same paramter find end---");

        resp.getWriter().write("OK");
    }
}
