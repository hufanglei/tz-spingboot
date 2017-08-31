package springbootpackage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Example")
public class ExampleController {

	@RequestMapping("/")
	 public String home(){
		 return "你好，同学";
	 }
	
	//带参数的方法处理
	@RequestMapping("/{myName}")
	public String home(@PathVariable String myName){
	   return "你好,同学"+myName;	
	}
}
