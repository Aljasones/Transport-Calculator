package aljasones.servlet;
import aljasones.model.Box;
import aljasones.service.TransportCalculator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TransportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String costOnKgByString = req.getParameter("kg");
        String costOnKmByString = req.getParameter("km");
        String weightByString = req.getParameter("weight");
        String distanceByString = req.getParameter("distance");

        int costOnKg = Integer.parseInt(costOnKgByString);
        int costOnKm = Integer.parseInt(costOnKmByString);
        int weight = Integer.parseInt(weightByString);
        int distance = Integer.parseInt(distanceByString);

        TransportCalculator calculator = new TransportCalculator(costOnKg, costOnKm);
        Box table = new Box(weight);

        int total = calculator.cost(table, distance);

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Your cost is</h1>");
        writer.println(total);


    }
}
