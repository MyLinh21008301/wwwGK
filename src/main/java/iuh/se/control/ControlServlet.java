package iuh.se.control;

import java.io.IOException;
import java.util.Optional;

import iuh.se.dao.NhanVienDAO;
import iuh.se.models.NhanVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ControlServlet", urlPatterns = {"/control-servlet"})
public class ControlServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String getAcction = req.getParameter("action");
        if (getAcction != null && getAcction.equalsIgnoreCase("DanhSach")) {
            NhanVienDAO nvdao = new NhanVienDAO();
            Optional<NhanVien> op = nvdao.layTheoMa("0003");
            
            if (op.isPresent()) {
                NhanVien nv = op.get();
                req.setAttribute("employee", nv);
                resp.sendRedirect("Home.jsp"); // Redirect to the JSP
            } else {
                req.setAttribute("error", "Employee not found.");
                resp.sendRedirect("Home.jsp"); // Redirect to the JSP
            }
        }
	}
}
