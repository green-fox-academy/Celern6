package Controllers;

import Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String usefulController (){
    return "useful";
  }

  @GetMapping("useful/colored")
  public String useColored (){
    return "colored";
  }


}
