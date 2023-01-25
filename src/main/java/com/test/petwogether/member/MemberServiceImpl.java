package com.test.petwogether.member;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.test.petwogether.PetDTO;
import com.test.petwogether.admin.AdminDAO;
import com.test.petwogether.admin.AdminDTO;
import com.test.petwogether.petsitter.PetSitterDAO;
import com.test.petwogether.petsitter.PetSitterDTO;
import com.test.petwogether.petsitter.RDateDTO;
import com.test.petwogether.petsitter.RegisterDTO;

@Service
@Primary
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO mdao;

	@Autowired
	private PetSitterDAO pdao;

	@Autowired
	private AdminDAO ddao;

	@Override
	public MemberDTO mLoginCheck(String id, String pass) {

		MemberDTO dto = new MemberDTO();
		dto.setMid(id);
		dto.setMpw(pass);

		return mdao.mLoginCheck(dto);

	}

	@Override
	public PetSitterDTO fLoginCheck(String id, String pass) {

		PetSitterDTO dto = new PetSitterDTO();
		dto.setPsid(id);
		dto.setPspw(pass);

		return pdao.pLoginCheck(dto);
	}

	@Override
	public AdminDTO aLoginCheck(String id, String pass) {

		AdminDTO dto = new AdminDTO();
		dto.setAdid(id);
		dto.setAdpw(pass);

		return ddao.aLoginCheck(dto);
	}

	// 지현 부분 START
	@Override
	public List<PetSitterDTO> pslist() {

		return pdao.pslist();
	}

	@Override
	public PetSitterDTO psinfo(String psseq) {

		return pdao.psinfo(psseq);
	}

	@Override
	public RegisterDTO rget(String psseq) {

		return pdao.rget(psseq);
	}

	@Override
	public List<PetDTO> pspetlist(String psseq) {

		return pdao.pspet(psseq);
	}

	@Override
	public List<RDateDTO> rdlist(String psseq) {

		return pdao.rdlist(psseq);
	}

	@Override
	public List<PetDTO> mpetlist(String mseq) {

		return mdao.mpetlist(mseq);
	}

	@Override
	public int setcareservice(CareServiceDTO csdto) {

		return mdao.setcareservice(csdto);
	}

	@Override
	public int getmaxcsseq() {

		return mdao.getmaxcsseq();
	}
	
	@Override
	public int setrdate(RDateDTO rddto) {
		
		return mdao.setrdate(rddto);
	}
	
	// 지현 부분 END
	
	//동균 부분 START
		@Override
		public List<PSReviewDTO> getPSReviewList() {
			
			return mdao.getPSReviewList();
		}
		
		@Override
		public String getMemberId(String mseq) {
			
			return mdao.getMemberId(mseq);
		}
		
		@Override
		public PSReviewDTO getPSReview(String psrseq) {
			
			return mdao.getPSReview(psrseq);
		}
		
		@Override
		public CareServiceDTO getRService(String psrseq) {
			
			return mdao.getRService(psrseq);
		}
		
		@Override
		public PetSitterDTO getRPetSiiter(String psrseq) {
			
			return mdao.getRPetSiiter(psrseq);
		}
		
		@Override
		public int addPSReview(PSReviewDTO dto) {
			
			return mdao.addPSReview(dto);
		}
		
		@Override
		public List<CareServiceDTO> getCSSeq(String attribute) {
			
			return mdao.getCSSeq(attribute);
		}
		
		@Override
		public int editPSReview(PSReviewDTO dto) {
			
			return mdao.editPSReview(dto);
		}
		
		@Override
		public void viewCount(String psrseq) {
			
			mdao.viewCount(psrseq);
			
		}
		
		@Override
		public int psrdeleteok(String psrseq) {
			
			return mdao.psrdeleteok(psrseq);
		}
		
		@Override
		public List<PSReviewDTO> psreviewsearch(String word) {
			
			return mdao.psreviewsearch(word);
		}
		
		@Override
		public int aCnt() {
			
			return mdao.aCnt();
		}
		
		@Override
		public int mCnt() {
			
			return mdao.mCnt();
		}
		
		@Override
		public int psCnt() {
			
			return mdao.psCnt();
		}
		
		@Override
		public int psrCnt() {
			
			return mdao.psrCnt();
		}
		//동균 부분 END	

}
