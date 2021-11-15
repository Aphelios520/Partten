package com.itcast.ProxyPattern.test1;

public class ProxySearcher implements  Searcher {
	private RealSearcher searcher = new RealSearcher();
	private AccessValidator validator ;
	private Logger logger;
	
	@Override
	public String doSearcher(String userId, String password) {
		if(this.validator(userId)){
			String res = searcher.doSearcher(userId,password);
			this.log(userId);
			return res;
		}else {
			return null;
		}
	}
	public boolean validator(String userId){
		validator = new AccessValidator();
		return validator.validator(userId);
	}
	public void log(String userId){
		logger= new Logger();
		logger.log(userId);
	}
}
