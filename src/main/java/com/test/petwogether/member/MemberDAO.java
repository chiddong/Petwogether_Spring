package com.test.petwogether.member;

import java.util.List;

import com.test.petwogether.PetDTO;
import com.test.petwogether.petsitter.PetSitterDTO;
import com.test.petwogether.petsitter.RDateDTO;

public interface MemberDAO {

	MemberDTO mLoginCheck(MemberDTO dto);


	
	//지현 ==== START
	
	List<PetDTO> mpetlist(String mseq);

	int setcareservice(CareServiceDTO csdto);
	
	int getmaxcsseq();
	
	int setrdate(RDateDTO rddto);
	
	//지현 ==== END
	
	// 동균 부분 START
		List<PSReviewDTO> getPSReviewList();

		String getMemberId(String mseq);
		
		PSReviewDTO getPSReview(String psrseq);

		CareServiceDTO getRService(String psrseq);

		PetSitterDTO getRPetSiiter(String psrseq);

		int addPSReview(PSReviewDTO dto);

		List<CareServiceDTO> getCSSeq(String attribute);

		int editPSReview(PSReviewDTO dto);

		void viewCount(String psrseq);

		int psrdeleteok(String psrseq);

		List<PSReviewDTO> psreviewsearch(String word);

		int aCnt();

		int mCnt();

		int psCnt();

		int psrCnt();
		// 동균 부분 END
	
	
}