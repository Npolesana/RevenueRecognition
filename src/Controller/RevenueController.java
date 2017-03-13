package Controller;

import source.Contract;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ContractModel;

/**
 * Servlet implementation class RevenueController
 */
@WebServlet("/RevenueController")
public class RevenueController extends ActionServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RevenueController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Long ContractNumber = Long.parseLong(request.getParameter("cnumber"));

			String c = ContractModel.findContract(ContractNumber);
			if (c == null){
				forward("/NotFound.jsp", request, response);}
			else {
				request.setAttribute("contractdet", c);
				request.setAttribute("contractNumber", ContractNumber);
				HttpSession session = request.getSession(true);
				session.setAttribute("contractNumber", ContractNumber);
				forward("/Contractdetails.jsp", request, response);
				
				System.out.println("success");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
