package ecpay.payment.integration.domain;

/**
 * 下載信用卡撥款對帳資料檔物件
 * @author mark.chiu
 *
 */
public class FundingReconDetailObj {
	
	/**
	 * MerchantID
	 * 會員編號(由allPay提供)
	 */
	private String MerchantID = "";
	
	/**
	 * PayDateType
	 * 查詢日期類別
	 */
	private String PayDateType = "";
	
	/**
	 * StartDate
	 * 查詢開始日期
	 */
	private String StartDate = "";
	
	/**
	 * EndDate
	 * 查詢結束日期
	 */
	private String EndDate = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 會員編號(由allPay提供)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 會員編號(由allPay提供)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得PayDateType 查詢日期類別
	 * @return PayDateType
	 */
	public String getPayDateType() {
		return PayDateType;
	}
	/**
	 * 設定PayDateType 查詢日期類別
	 * @param payDateType
	 */
	public void setPayDateType(String payDateType) {
		PayDateType = payDateType;
	}
	/**
	 * 取得StartDate 查詢開始日期
	 * @return StartDate
	 */
	public String getStartDate() {
		return StartDate;
	}
	/**
	 * 設定StartDate 查詢開始日期
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	/**
	 * 取得EndDate 查詢結束日期
	 * @return EndDate
	 */
	public String getEndDate() {
		return EndDate;
	}
	/**
	 * 設定EndDate 查詢結束日期
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	@Override
	public String toString() {
		return "FundingReconDetailObj [MerchantID=" + MerchantID + ", PayDateType=" + PayDateType + ", StartDate="
				+ StartDate + ", EndDate=" + EndDate + "]";
	}
}
