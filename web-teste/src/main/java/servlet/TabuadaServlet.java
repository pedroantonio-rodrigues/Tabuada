package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Tabuada;

@WebServlet(name = "TabuadaServlet", urlPatterns = { "/tabuada" })
public class TabuadaServlet extends HttpServlet {

	private String numero = null;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Tabuada tabuada = new Tabuada();
        numero = req.getParameter("numero");
        if (numero != null) {
        	for (String i : new ArrayList<String>(Arrays.asList(numero.split(";")))){
        		if (i.matches("[0-9]")) {
        			out.println(tabuada.calcular(Integer.parseInt(i)));
        		}
        	}
        	
        }else {
        	for (int i = 1; i <= tabuada.getNumeroMaximoTabuada(); i++ ) {
        		out.println(tabuada.calcular(i));
        	}
        }
	}
}
