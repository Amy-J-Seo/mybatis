package co.bambbang.prj.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.bambbang.prj.common.Command;
import co.bambbang.prj.member.service.MemberService;
import co.bambbang.prj.member.serviceImpl.MemberServiceImpl;
import co.bambbang.prj.member.vo.MemberVO;

public class MemberSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		System.out.println(request.getParameter("id"));
		vo.setId(request.getParameter("id"));
		vo = memberDao.memberSelect(vo);
		request.setAttribute("member",vo);
		
		return "member/memberSelect";
		
	}

}
