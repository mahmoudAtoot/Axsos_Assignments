package axsos.assignment;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Date {
	@RequestMapping("/date")
	public String dateDisplay(Model model) {
		String pattern = "EEE, d MMM yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new java.util.Date());
		model.addAttribute("date",date);
		return "date.jsp";
	}
}
 