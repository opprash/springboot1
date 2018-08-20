package springboot1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import project.changemima;

/**
 * @Auther opprash
 * @Date 2018\8\16 0016 7:15
 */
@RestController
//@RequestMapping("/mi")
public class mimaController {
    @RequestMapping("/changemima")
    public void changmima(@PathVariable String uuid, @PathVariable String phoneNum){
        changemima changwmima=new changemima(uuid,phoneNum);
        //ModelAndView modelAndView=new ModelAndView( );
        changwmima.changmima();
        System.out.println("change successful!");
        //return modelAndView;
    }
}
