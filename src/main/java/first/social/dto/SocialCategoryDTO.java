package first.social.dto;

public class SocialCategoryDTO {
	String gCode;
	String dCode;
	String userId;
	int score;
	
	@Override
	public String toString() {
		return "SocialCategoryDTO [gCode=" + gCode + ", dCode=" + dCode + ", userId=" + userId + ", score=" + score
				+ "]";
	}

	public SocialCategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SocialCategoryDTO(String gCode, String dCode, String userId, int score) {
		super();
		this.gCode = gCode;
		this.dCode = dCode;
		this.userId = userId;
		this.score = score;
	}
	
	public String getgCode() {
		return gCode;
	}
	public void setgCode(String gCode) {
		this.gCode = gCode;
	}
	public String getdCode() {
		return dCode;
	}
	public void setdCode(String dCode) {
		this.dCode = dCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	 
	
	

}
