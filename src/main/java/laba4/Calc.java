package laba4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/JavaCalc") //св€зывание сервлета с URL
public class Calc extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		 
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
	}
	
	private static class RequestCalc {
		private final String first_calc;
		private final String second_calc;
		private final String third_calc;
		private String result;
		private double kk;
						
		private RequestCalc (String first, String second, String third) {
			this.first_calc = first;
			this.second_calc = second;
			this.third_calc = third;
			}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
			request.getParameter("first"),
			request.getParameter("second"),
			request.getParameter("third"));
			}
				
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			request.setAttribute("first_result", first_calc);
			request.setAttribute("second_result", second_calc);
			request.setAttribute("third_result", third_calc);
			double first_try=0;
			double second_try=0;
			double third_try=0;
			try {
				first_try=Double.parseDouble(first_calc);
				second_try=Double.parseDouble(second_calc);
				third_try=Double.parseDouble(third_calc);
			}
			catch (Exception e) {
				first_try = 0;
				second_try= 0;
				third_try= 0;
			}
			if (first_try>0 & second_try>0 & third_try>0) {
				kk=(second_try*third_try*third_try*first_try)/(12*Math.tan(Math.toRadians(180)/second_try));
			result = "" + kk;
			} else result = "¬ведите положительные числа в пол€";
			if (second_try<3) {
        		result = "¬ведите количество сторон основани€ больше 2";
			}
		
			request.setAttribute("result", result);
		}
		
	}
}
