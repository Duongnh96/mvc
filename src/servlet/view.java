package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDAO;
import model.User;

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
public class view extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public view() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>User List</h1>");
    List<User> list = UserDAO.getList();
    out.print("<table border='1' width='100%',style='border-collapse: collapse'");
    out.print(
        "<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Phone</th><th>Descaption</th><th>Image</th><th>Gender</th><th>Vehicle</th><th>Option</th></tr>");
    for (User u : list) {
      out.print("<tr><td>" + u.getId() + "</td><td>" + u.getFirstName() + "</td><td>" + u.getLastName() + "</td><td>"
          + u.getPhone() + "</td><td>" + u.getDesCaption() + "</td><td>"+u.getImage()+"</td><td>"+u.getGender()+"</td><td>"+u.getVehicle()+"</td><td>"+u.getOption()+"</td></tr>");
    }
    out.print("</table>");

  }

}
