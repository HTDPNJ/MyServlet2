package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;

public class RequestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求头数据
                //获取强求方式
        String method=req.getMethod();
        System.out.println(method);
        //获取url
        StringBuffer url=req.getRequestURL();
        System.out.println(url);
        //获取uri
        String uri=req.getRequestURI();
        System.out.println(uri);
        //获取协议
        String protocal=req.getScheme();
        System.out.println(protocal);
        //获取请求指定键的行数据
        String value=req.getHeader("");
        System.out.println(value);
        //获取所有的行的键的枚举
        Enumeration e=req.getHeaderNames();
        while(e.hasMoreElements()){
            String name=(String)e.nextElement();
            String value2=req.getHeader(name);
            System.out.println(name+":"+value2);
        }
        ///获取用户数据
        String name=req.getParameter("uname");
        System.out.println(name);

        String[] favs=req.getParameterValues("fav");
        if(favs!=null){
            for(String fav:favs){
                System.out.println(fav);
            }
        }
        Enumeration e2=req.getParameterNames();
        while(e2.hasMoreElements()){
            System.out.println(e2.nextElement());
        }
    }
}
