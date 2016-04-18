package first.food.dto;

public class FoodCategoryDTO {
	String cCode ;
	String docId;
	String userId;
	int likesCount;
	long createdTime;
	
	public FoodCategoryDTO() {
		 
	}

	public FoodCategoryDTO(String cCode, String docId, String userId, int likesCount, long createdTime) {
		super();
		this.cCode = cCode;
		this.docId = docId;
		this.userId = userId;
		this.likesCount = likesCount;
		this.createdTime = createdTime;
	}
	public String getcCode() {
		return cCode;
	}
	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getLikesCount() {
		return likesCount;
	}
	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}
	public long getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}
	
	@Override
	public String toString() {
		return "FoodCategoryDTO - C_CODE : "+cCode+", DOC_ID : "+docId+", USER_ID : "+userId+", LIKES_COUNT : "+likesCount+", CREATED_TIME : "+createdTime;
	}
	
	
}
