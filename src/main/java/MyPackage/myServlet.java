package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 
 */
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
			"I told my computer I needed a break, and now it won't stop sending me vacation ads.",
			"I'm reading a book on anti-gravity. It's impossible to put down!",
			"Why did the golfer bring two pairs of pants? In case he got a hole in one!",
			"I am friends with 25 letters of the alphabet. I dont know y.",
			"I used to play piano by ear, but now I use my hands.",
			"I'm writing a book. I've got the page numbers done.",
			"I used to be a baker, but I couldn't make enough dough.",
			"I'm on a seafood diet. I see food and I eat it.",
			"Why did the math book look sad? Because it had too many problems.",
			"I'm reading a book on the history of glue. I just can't seem to put it down.",
			"I'm friends with 25 letters of the alphabet. I don't know y."
	};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		int ans = 0;
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
        switch (str3) {
        case "1":
            ans = num1 + num2;
            break;
        case "2":
            ans = num1 - num2;
            break;
        case "3":
            ans = num1 * num2;
            break;
        case "4":
            if (num2 != 0) {
                ans = num1 / num2;
            } else {
                response.sendRedirect("NewFile.jsp?ans=Error: Division by zero");
                return;
            }
            break;
    }

        int randomIndex = (int)(Math.random()*jokes.length);
        String randomJoke = jokes[randomIndex];
        response.sendRedirect("NewFile.jsp?ans=" + ans+"&Joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
