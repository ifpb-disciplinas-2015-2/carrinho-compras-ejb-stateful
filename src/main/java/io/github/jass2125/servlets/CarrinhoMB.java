package io.github.jass2125.servlets;

import io.github.jass2125.sessionbeans.CarrinhoBean;

import java.io.IOException;
import java.util.Set;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "serv", urlPatterns = {"/op"})
public class CarrinhoMB extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	private CarrinhoBean carrinho;
	private String produto;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String produto = request.getParameter("p");
		if(!this.getLista().contains(produto)){
			carrinho.add(produto);
		}else{
			carrinho.remove(produto);
		}
		request.getSession().setAttribute("lista", getLista());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	public Set<String> getLista(){
		return carrinho.getProdutos();
	}

}
