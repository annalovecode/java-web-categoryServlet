package com.imooc.catergory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 使用Servlet在页面输出商品类别名称，
 * 商品类别名称通过url地址进行传递，
 * 在Servlet中获取类别名称并输出。
 * @author Anna
 * @Date 2020/9/5
 *
 */
public class CatergoryServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String html="<h1 style='color:blue'>"+name+"</h1>";
		System.out.println("返回给浏览器的响应数据为："+html);
		PrintWriter out=response.getWriter();
		out.println(html);
	}
	

}
