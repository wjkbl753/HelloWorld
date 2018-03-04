package com.weixin.shiro.realms;

import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.weixin.service.back.IMemberServiceBack;
import com.weixin.service.back.IUserService;
import com.weixin.vo.Member;
import com.weixin.vo.User;

public class UserRealm extends AuthorizingRealm{
	private Logger log = Logger.getLogger(UserRealm.class);
	@Autowired
	private IUserService userService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
//		log.info("********** 2、用户角色与权限：doGetAuthorizationInfo **********");
//		String mid = (String) principal.getPrimaryPrincipal() ;	// 取得用户登录名
//		SimpleAuthorizationInfo auth = new SimpleAuthorizationInfo() ;	// 定义授权信息的返回数据
//		try {
//			Map<String,Object> map = this.memberServiceBack.listAuthMyMember(mid);
//			Set<String> allRoles = (Set<String>) map.get("allRoles") ;
//			Set<String> allActions = (Set<String>) map.get("allActions") ;
//			auth.setRoles(allRoles);// 所有的角色必须以Set集合的形式出现
//			auth.setStringPermissions(allActions); 	// 所有的权限必须以Set集合的形式出现
//		} catch (Exception e) { 
//			e.printStackTrace(); 
//		} 
//		return auth;
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		log.info("doGetAuthenticationInfo:登录认证");
		//拿到用户名mid：
		String mid = (String)token.getPrincipal();
		
		//得到session：
		Subject subject = SecurityUtils.getSubject();  
		Session session = subject.getSession();
		String group = (String)session.getAttribute("groupname");
		log.info("group:"+group);
		User vo = userService.getByUsernameAndGroup((String)token.getPrincipal(), group);
		if(vo==null) {
			throw new UnknownAccountException("没有此用户");
		}else {
			//拿到用户表单密码：
			 String password = new String((char[])token.getCredentials());
			 String password_salt = getMd5By3(password);
			if(vo.getPass().equals(password_salt)) {
				return new SimpleAuthenticationInfo(mid, password, getName());
			}else {
				throw new IncorrectCredentialsException("密码错误！");
			}
		}
	}
	
	/**
	 * 3次md5加密
	 * @param pass
	 * @return
	 */
	public String getMd5By3(String pass) {
		return new Md5Hash(new Md5Hash( new Md5Hash(pass).toString()).toString()).toString(); 
	}
	
	
	public static void main(String[] args) {
		ByteSource bytes = ByteSource.Util.bytes("hello");
		String result1 = new Md5Hash("123",null, 2).toString();
//		new SimpleHash(algorithmName, source, salt, hashIterations)
		String result2 = new Md5Hash(new Md5Hash( new Md5Hash("123").toString()).toString()).toString(); 
		System.out.println(result1);
		System.out.println(result2);
	}
	

}
