package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求
        //响应处理请求结果
        /*
        * 设置响应头
        * 设置响应实体*/
        resp.setHeader("mouse","fly");
        resp.addHeader("key","wollo");
        //设置响应格式
       // resp.setHeader("content-type","text/html;charset=utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //设置状态码
        //resp.sendError(405,"notfound");
        //设置响应实体
        resp.getWriter().write("今天天气真好！");
    }
}
