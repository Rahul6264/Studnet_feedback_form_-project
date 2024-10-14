package p1;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
        String courseName = request.getParameter("courseName");
        String instructorName = request.getParameter("instructorName");
        String comments = request.getParameter("comments");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Feedback", "root", "test");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO feedback (student_name, course_name, instructor_name, comments) VALUES (?, ?, ?, ?)");
            ps.setString(1, studentName);
            ps.setString(2, courseName);
            ps.setString(3, instructorName);
            ps.setString(4, comments);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        response.sendRedirect("feedback_form.jsp");
    }

}

