package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDAO;
import model.User;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Insert() {
    super();
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/jsp");
    PrintWriter out = response.getWriter();
    String fname = request.getParameter("firstname");
    String lname = request.getParameter("lastname");
    String number = request.getParameter("num1") + request.getParameter("num2") + request.getParameter("num3");
    String image = request.getParameter("image");
    String gender = request.getParameter("gender");
    String vehicle = request.getParameter("vehicle");
    String des = request.getParameter("descap");
    String option = request.getParameter("option");
    User user = new User(fname, lname, number, image, gender, vehicle, des, option);
    if (UserDAO.add(user)) {
      response.sendRedirect("Database.jsp");
    } else {
      out.println("Error!");
    }
    out.close();
  }

}
