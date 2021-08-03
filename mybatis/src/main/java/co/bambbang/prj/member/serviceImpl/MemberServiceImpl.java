package co.bambbang.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.bambbang.prj.common.DAO;
import co.bambbang.prj.member.service.MemberService;
import co.bambbang.prj.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	//DAO������ �Ѵ�.
	private SqlSession sqlSession = DAO.getInstance().openSession();
	
	
	
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("memberSelectList");
		//��ȣ �ȿ� ���۰� ������ �ִ� ���̵� �̸��� �� �ָ� �ȴ�.
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberSelect", vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("memberInsert", vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.update("memberDelete", vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.update("memberUpdate", vo);
	}

}
