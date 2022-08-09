package com.awantunai.test.demo.Service;


@Service
public class ServiceClass implements ServiceInterface {

	
	@Autowired 
	RepositoryInterface repositoryClass;
	
	@Override
	public String  signupMethod(User user) {
	  
		
		repositoryClass.save();
		
	}
}
