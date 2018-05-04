package action;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.JsonObject;

import utils.JdbcUtils;
import dao.LoginDao;
import dao.MemberDao;
import dao.RegisterDao;
import daoImpl.RegisterDaoImpl;

@WebServlet(name = "loginCheckAction", urlPatterns = "/loginCheckAction")
public class LoginCheckAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private LoginDao loginDao = new LoginDao();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		try {
		ResultSet rs = loginDao.ManagerLogin(username);
		if(rs.next()) {
			session.setAttribute("adminName", rs.getString(2));
			// 跳转到主页
			request.getRequestDispatcher("/Managers_Home.jsp")
					.forward(request, response);
		}else {
			request.getRequestDispatcher(
					"/login.jsp?errorMessage=用户名或密码错误!").forward(
					request, response);
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/*
	 * 保持用户名和密码保存在cookies中,使用URLEncoder解决无法在cookie中保持中文的问题,先转码，在解码
	 */
}
