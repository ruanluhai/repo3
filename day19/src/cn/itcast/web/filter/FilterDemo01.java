package cn.itcast.web.filter;

import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;

public class FilterDemo01 implements Filter {
    ArrayList<String> list = new ArrayList();
    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String word = req.getParameter("info");
        System.out.println(word);
        if (list != null) {
            for (String o : list) {
                if (word.contains(o)) {
                    resp.getWriter().write("不文明");
                    return;
                }
            }
        }
        chain.doFilter(req, resp); // 放形
    }

    public void init(FilterConfig config) throws ServletException {
        try {
            ServletContext context = config.getServletContext();
            String realPath = context.getRealPath("/dirty.txt");
            File file = new File(realPath);
            FileInputStream fi = new FileInputStream(file);
            InputStreamReader is = new InputStreamReader(fi, "utf-8");
            BufferedReader br = new BufferedReader(is);
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (Exception e) {

        }

    }

}
