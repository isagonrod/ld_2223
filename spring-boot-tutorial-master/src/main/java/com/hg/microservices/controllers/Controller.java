package com.hg.microservices.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller {
	@RequestMapping(value = "/saludo")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			processRequest(request, response);
	}

	@RequestMapping(value = "/saludo")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
//			response.setContentType("text/html;charset=UTF-8");
//			PrintWriter out = response.getWriter();
//			out.println("<html><head><title>Tutorías</title></head>");
//			out.println("<body>hola</body></html>");
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		if (dispatcher != null) {
			dispatcher.forward(request, response);
		}
	}
}
