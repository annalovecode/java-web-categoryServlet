package com.imooc.catergory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ʹ��Servlet��ҳ�������Ʒ������ƣ�
 * ��Ʒ�������ͨ��url��ַ���д��ݣ�
 * ��Servlet�л�ȡ������Ʋ������
 * @author Anna
 * @Date 2020/9/5
 *
 */
public class CatergoryServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String html="<h1 style='color:blue'>"+name+"</h1>";
		System.out.println("���ظ����������Ӧ����Ϊ��"+html);
		PrintWriter out=response.getWriter();
		out.println(html);
	}
	

}
