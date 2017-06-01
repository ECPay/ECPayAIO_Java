package ecpay.payment.integration.domain;

/**
 * 下載合作特店對帳媒體檔物件
 * @author mark.chiu
 *
 */
public class TradeNoAioObj {
	
	/**
	 * MerchantID
	 * 合作特店編號(由綠界提供)
	 */
	private String MerchantID = "";
	
	/**
	 * DateType
	 * 查詢日期類別
	 */
	private String DateType = "";
	
	/**
	 * BeginDate
	 * 查詢開始日期
	 */
	private String BeginDate = "";
	
	/**
	 * EndDate
	 * 查詢結束日期
	 */
	private String EndDate = "";
	
	/**
	 * PaymentType
	 * 付款方式
	 */
	private String PaymentType = "";
	
	/**
	 * PlatformStatus
	 * 訂單類型
	 */
	private String PlatformStatus = "";
	
	/**
	 * PaymentStatus
	 * 付款狀態
	 */
	private String PaymentStatus = "";
	
	/**
	 * AllocateStatus
	 * 撥款狀態
	 */
	private String AllocateStatus = "";
	
	/**
	 * MediaFormatted
	 * CSV格式
	 */
	private String MediaFormated = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 合作特店編號(由綠界提供)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 合作特店編號(由綠界提供)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得DateType 查詢日期類別
	 * @return DateType
	 */
	public String getDateType() {
		return DateType;
	}
	/**
	 * 設定DateType 查詢日期類別
	 * @param dateType
	 */
	public void setDateType(String dateType) {
		DateType = dateType;
	}
	/**
	 * 取得BeginDate 查詢開始日期
	 * @return BeginDate
	 */
	public String getBeginDate() {
		return BeginDate;
	}
	/**
	 * 設定BeginDate 查詢開始日期
	 * @param beginDate
	 */
	public void setBeginDate(String beginDate) {
		BeginDate = beginDate;
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
	/**
	 * 取得PaymentType 付款方式
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * 設定PaymentType 付款方式
	 * @param paymentType
	 */
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	/**
	 * 取得PlatformStatus 訂單類型
	 * @return PlatformStatus
	 */
	public String getPlatformStatus() {
		return PlatformStatus;
	}
	/**
	 * 設定PlatformStatus 訂單類型
	 * @param platformStatus
	 */
	public void setPlatformStatus(String platformStatus) {
		PlatformStatus = platformStatus;
	}
	/**
	 * 取得PaymentStatus 付款狀態
	 * @return PaymentStatus
	 */
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	/**
	 * 設定PaymentStatus 付款狀態
	 * @param paymentStatus
	 */
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	/**
	 * 取得AllocateStatus 撥款狀態
	 * @return AllocateStatus
	 */
	public String getAllocateStatus() {
		return AllocateStatus;
	}
	/**
	 * 設定AllocateStatus 撥款狀態
	 * @param allocateStatus
	 */
	public void setAllocateStatus(String allocateStatus) {
		AllocateStatus = allocateStatus;
	}
	/**
	 * 取得MediaFormatted CSV格式
	 * @return MediaFormatted
	 */
	public String getMediaFormated() {
		return MediaFormated;
	}
	/**
	 * 設定MediaFormatted CSV格式
	 * @param mediaFormated
	 */
	public void setMediaFormated(String mediaFormated) {
		MediaFormated = mediaFormated;
	}
	@Override
	public String toString() {
		return "TradeNoAioObj [MerchantID=" + MerchantID + ", DateType=" + DateType + ", BeginDate=" + BeginDate
				+ ", EndDate=" + EndDate + ", PaymentType=" + PaymentType + ", PlatformStatus=" + PlatformStatus
				+ ", PaymentStatus=" + PaymentStatus + ", AllocateStatus=" + AllocateStatus + ", MediaFormated="
				+ MediaFormated + "]";
	}
}
