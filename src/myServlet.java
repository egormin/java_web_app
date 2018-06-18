import com.mysoft.DAO;

import java.io.IOException;

/**
 * Created by root on 6/16/18.
 */
@javax.servlet.annotation.WebServlet(name = "myServlet", urlPatterns = "/posts")
public class myServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("posts", DAO.getPosts());
        request.getRequestDispatcher("WEB-INF/posts.jsp").forward(request, response);

//        int id = Integer.parseInt(request.getParameter("id"));
//        response.getOutputStream().write(("ID is " + id).getBytes());
    }
}
