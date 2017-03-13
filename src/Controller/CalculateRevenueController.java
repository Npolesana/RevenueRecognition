package Controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpSession;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import model.ContractModel;
import model.RevenueRecognitionModel;

/**
 * Servlet implementation class CalculateRevenueController
 */
@WebServlet("/CalculateRevenueController")
public class CalculateRevenueController extends ActionServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateRevenueController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String r = request.getParameter("date");
		Long x = (Long)request.getSession(false).getAttribute("contractNumber");

		System.out.println("Id " + x);
	System.out.println(x);
		if(r.equals("TodayValue")){
			java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());

			try {
				request.setAttribute("contractRevenueAsOf", ContractModel.calculateRevenueRecognitions(x, date));
				forward("/Revenue.jsp", request, response);


			
			
		}
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		else if (r.equals("SelectedDate")){
		
			String startDate=request.getParameter("datetoquery");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date date = null;
			try {
				date = sdf1.parse(startDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
					

			try {
				System.out.println(ContractModel.calculateRevenueRecognitions(x, sqlStartDate));
				request.setAttribute("contractRevenueAsOf", ContractModel.calculateRevenueRecognitions(x, sqlStartDate));

				forward("/Revenue.jsp", request, response);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
