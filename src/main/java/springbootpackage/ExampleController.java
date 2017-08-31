package springbootpackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ymlpackage.PropertiesBean;
import ymlpackage.User;

@RestController
@RequestMapping("/Example")
@EnableConfigurationProperties({PropertiesBean.class ,User.class})
public class ExampleController {

	@Autowired
	private PropertiesBean p;
	
	@Autowired
	private User u;
	
	@RequestMapping("/")
	 public String home(){
		 return "你好，同学";
	 }
	
	@Value("${com.springboot.name}")
	private String uname;
	
	@Value("${com.springboot.title}")
	private String utitle;
	
	@Value("${com.springboot.desc}")
	private String desc;
	
	@Value("${com.springboot.value}")
	private String value;
	
	@Value("${com.springboot.number}")
	private String number;
	
	@Value("${com.springboot.bignumber}")
	private String bignumber;
	
	//带参数的方法处理
	@RequestMapping("/{myName}")
	public String home(@PathVariable String myName){
	   return "你好,同学"+myName;	
	}
	
	@RequestMapping("/properties")
	public String getContent(){
		return "字符串:"+value+"数值"+number+"最大数字"+bignumber;
	}
	
	@RequestMapping("/yml")
	public String getYmlContent(){
		return  "名称"+p.getName()+"年龄"+p.getAge()+"number"+p.getNumber()
		+"最大数值:"+p.getMax()+"随机字符值:"+p.getValue();
	}
	
	@RequestMapping("/user")
	public String getUserContent(){
		return  "大家好:"+u.getName()+u.getTitle();
	}
}
