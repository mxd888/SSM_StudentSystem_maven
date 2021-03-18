package test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.springframework.util.DigestUtils;

import com.hdu.wll.Enum.PageEnum;
import com.hdu.wll.util.MD5Util;

public class securityTest {

	
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		System.out.println(PageEnum.CURRENTLIMIT);
		System.out.println(PageEnum.CURRENTLIMIT.getInfo()+"---"+PageEnum.CURRENTLIMIT.getDefualtlimit());
		System.out.println(DigestUtils.md5DigestAsHex("1234".getBytes()));
		System.out.println("-------------md5-----------");
		String password = "2020ABCDEFGHIJKLMN";
		String md5pass =  MD5Util.getEncryptedPwd(password);
		System.out.println(md5pass);
		boolean b = MD5Util.validPassword(password, md5pass);
		System.out.println(b);
		System.out.println(MD5Util.validPassword("555", md5pass));
		
		
		
	}
	
	
}
