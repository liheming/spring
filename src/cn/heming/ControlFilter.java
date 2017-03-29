package cn.heming;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class ControlFilter
 */
@WebFilter("/ControlFilter")
public class ControlFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public ControlFilter() {
		// TODO Auto-generated constructor stub
		System.out.println(" ControlFilter  constructor");
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("ControlFilter  do filter");
		// pass the request along the filter chain
		HttpServletRequest res = (HttpServletRequest) request;
		String url = res.getServletPath();
		System.out.println("ControlFilter getServletPath:" + url);

		if (url.equals("ControlFilter  /register.action")) {
			res.getRequestDispatcher("reg.jsp").forward(request, response);
			return;
		} else if (url.equals("/saveUser.action")) {
			String username = res.getParameter("username");
			String password = res.getParameter("password");
			String password1 = res.getParameter("password1");
			System.out.println("ControlFilter 用户名：" + username + "ControlFilter 密码：" + password);
			if (password.equals(password1)) {
				Users users = new Users();
				users.setUsernmae(username);
				users.setPassword(password);
				res.getRequestDispatcher("end.jsp").forward(request, response);
				return;
			} else {
				res.getRequestDispatcher("reg.jsp").forward(request, response);

			}
		}

		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
