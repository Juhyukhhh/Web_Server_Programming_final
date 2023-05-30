package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import product.*;
import util.*;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDAO productDAO;
       
    public ProductController() {
        super();
        productDAO = new ProductDAO();
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
		
		System.out.println(request.getRequestURI());
		String cmd = request.getParameter("cmd");
		RequestDispatcher dis;
		ProductDTO product;
		
		switch(cmd) {
			case "serch":
				List<ProductDTO> searchedProductList = new ArrayList<>();
				String keyword = request.getParameter("keyword");
				
				searchedProductList = productDAO.findByKeyword(keyword);
				request.setAttribute("searchedProductList", searchedProductList);
				
				dis = request.getRequestDispatcher("/product/search.jsp");
				dis.forward(request, response);
				break;
		}
	}
}
