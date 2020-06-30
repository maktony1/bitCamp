package edu.bit.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.command.BCommand;
import edu.bit.ex.command.BListCommand;


@WebServlet("*.do") //확장자 패턴(전자정부프레임)
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BFrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ //request 받으려면 왜 try catch 해야하나
		System.out.println("actionDo");
		request.setCharacterEncoding("EUC-KR");
		
		String viewPage = null;
		BCommand command = null;
		
		// http://~~~~~/jsp_mvcboard/list.do   <--빼내려고
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		System.out.println("uri:"+uri);
		System.out.println("conPath:"+conPath);
		System.out.println("com:"+com);
				
		if(com.equals("/list.do")) {
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
		}else if(com.equals("/content_view.do")) {
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
	

}
