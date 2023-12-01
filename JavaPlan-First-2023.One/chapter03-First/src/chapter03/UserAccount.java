package chapter03;

public class UserAccount {
	private String userName; //姓名
	private String userId;  //身份证号
	private String userTel; //联系电话
	private String bankCardid;  //银行卡号
	private String dealTime;  //交易时间
	private float dealAmount;    //交易金额
	private float currentBalance; //当前余额
	public String getUserName() {
		return userName;
	}
	public float getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(float currentBalance) {
		this.currentBalance = currentBalance;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getBankCardid() {
		return bankCardid;
	}
	public void setBankCardid(String bankCardid) {
		this.bankCardid = bankCardid;
	}
	public String getDealTime() {
		return dealTime;
	}
	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}
	public float getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(float dealAmount) {
		this.dealAmount = dealAmount;
	}

	
	
}
