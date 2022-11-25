package Day06.accessmodifier;

import Day06.mypac.MemberVO;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * id : jhin 
		 * pwd : jhin1234
		 * name : 진
		 * phonenum : 010-1234-5678
		 * address : 서울시 서대문구 신촌동
		 * birth : 2014-05-05
		 */
		MemberVO memVo = new MemberVO();
		memVo.setId("jhin");
		memVo.setPassword("jhin1234");
		memVo.setName("진");
		memVo.setPhoneNumber("010-1234-5678");
		memVo.setAddress("서울시 서대문구 신촌동");
		memVo.setBirth("2014.05.05");
		
		String id = memVo.getId();
		String password = memVo.getPassword();
		String name = memVo.getName();
		String phoneNumber = memVo.getPhoneNumber();
		String address = memVo.getAddress();
		String birth = memVo.getBirth();
		
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(address);
		System.out.println(birth);
		
		
	}
}
