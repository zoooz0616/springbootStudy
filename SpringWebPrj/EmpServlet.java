package com.sample.myapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet({ "/EmpServlet", "/emp.do", "*.do" })//ur매
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd =request.getParameter("cmd"); //emp.do?cmd=xxxx(xxx는 String 변수)
		String uri = request.getRequestURI();
		System.out.println(uri);
		String view="";
		uri=uri.substring(request.getServletContext().getServletContextName().length());
		
		if("a.do".equals(uri)) {
			//a 요청 처
			System.out.println("a요청 처리");
			EmpDao dao=new EmpDao();
			EmpVo emp=dao.getData();//biz()메서드 실행
			
			request.setAttribute("empData", emp);//View(JSP)에서 출력할 데이터를요청객체에 저장
			view="result.jsp";
		}else if ("b.do".equals(uri)) {
			System.out.println("b요청 처리");
			view="result_b.jsp";
			System.out.println("다른 페이지로 리다이렉트 합니다.");
			
//			request.setAttribute("message", "Hello B");//못담아옴 
			HttpSession session=request.getSession();
			session.setAttribute("message", "Hello BBBBBBBBBBBBB");
			
			response.sendRedirect(view);
			return;//아래 다른 코드가 실ㄹ행되면 안됨
		}
		
//		EmpDao dao=new EmpDao();
//		EmpVo emp=dao.getData();//biz()메서드 실행
//		
//		request.setAttribute("empData", emp);//View(JSP)에서 출력할 데이터를요청객체에 저장
		
//		RequestDispatcher disp=request.getRequestDispatcher("result.jsp");
		
		
		RequestDispatcher disp=request.getRequestDispatcher(view);
		disp.forward(request, response);
		
		response.getWriter()
		.append("Served at: ")
		.append(request.getContextPath())
		.append("<br>")
		.append("<h1>HelloServlet</h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
