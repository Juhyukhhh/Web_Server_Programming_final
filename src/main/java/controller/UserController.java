package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import customer.*;
import util.*;

@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO customerDAO;
       
    public UserController() {
        super();
        customerDAO = new CustomerDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html; charset=utf-8");
    	response.setCharacterEncoding("utf-8");
		
		String cmd = request.getParameter("cmd");
		RequestDispatcher dis;
		CustomerDTO user;
		String id;
		
		switch(cmd) {
			case "idCheck":
				id = request.getParameter("user_id");
				boolean idUniqle = customerDAO.idCheck(id);
				
				request.setAttribute("idUniqle", idUniqle);
				dis = request.getRequestDispatcher("signup/idCheck.jsp");
				dis.forward(request, response);
				
				break;
				
			case "join":
				user = CustomerDTO.builder().id(request.getParameter("id"))
									.password(SHA256.toSHA256(request.getParameter("password")))
									.name(request.getParameter("name"))
									.email(request.getParameter("email"))
									.phone(request.getParameter("phone"))
									.address(request.getParameter("address"))
									.build();
				int result = customerDAO.insert(user);
				
				if (result == 1) {
					user = customerDAO.login(user.getId(), user.getPassword());
					HttpSession session = request.getSession();
					session.setAttribute("principal", user);
					dis = request.getRequestDispatcher("index.jsp");
					dis.forward(request, response);
				} else Script.back(response, "회원가입 실패");
				break;
				
			case "login":
				id = request.getParameter("id");
				
				if (!customerDAO.idCheck(id)) {
					user = customerDAO.login(id, SHA256.toSHA256(request.getParameter("password")));
					
					if (user != null) {
						HttpSession session = request.getSession();
						session.setAttribute("principal", user);
						dis = request.getRequestDispatcher("index.jsp");
						dis.forward(request, response);
					} else Script.back(response, "비밀번호를 확인해주세요");
				} else Script.back(response, "아이디를 확인해주세요");
				break;
				
			case "logout":
				HttpSession session = request.getSession();
				session.invalidate();
				dis = request.getRequestDispatcher("index.jsp");
				dis.forward(request, response);
				break;
		}
	}
}
