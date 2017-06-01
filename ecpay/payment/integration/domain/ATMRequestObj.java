package ecpay.payment.integration.domain;

/**
 * 當ChoosePayment為ATM時的取號結果通知物件
 * @author mark.chiu
 *
 */
public class ATMRequestObj {
	
	/**
	 * MerchantID
	 * 合作特店編號
	 */
	private String MerchantID;
	
	/**
	 * MerchantTradeNo
	 * 合作特店交易編號
	 */
	private String MerchantTradeNo;
	
	/**
	 * StoreID
	 * 合作特店商店代碼，提供合作特店填入店家代碼使用
	 */
	private String StoreID;
	
	/**
	 * RtnCode
	 * 交易狀態
	 */
	private String RtnCode;
	
	/**
	 * RtnMsg
	 * 交易訊息
	 */
	private String RtnMsg;
	
	/**
	 * TradeNo
	 * 綠界的交易編號
	 */
	private String TradeNo;
	
	/**
	 * TradeAmt
	 * 交易金額
	 */
	private String TradeAmt;

	/**
	 * PaymentType
	 * 合作特店選擇的付款方式
	 */
	private String PaymentType;
	
	/**
	 * PaymentTypeChargeFee
	 * 通路費 
	 */
	private String PaymentTypeChargeFee;
	
	/**
	 * TradeDate
	 * 訂單成立時間
	 */
	private String TradeDate;
	
	/**
	 * SimulatePaid
	 * 是否為模擬付款 
	 */
	private String SimulatePaid;
	
	/**
	 * CustomField1
	 * 自訂名稱欄位1，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField1;
	
	/**
	 * CustomField2
	 * 自訂名稱欄位2，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField2;
	
	/**
	 * CustomField3
	 * 自訂名稱欄位3，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField3;
	
	/**
	 * CustomField4
	 * 自訂名稱欄位4，提供合作廠商使用記錄用客製化使用欄位
	 */
	private String CustomField4;
	
	/**
	 * CheckMacValue
	 * 檢查碼
	 */
	private String CheckMacValue;
	
	/**
	 * BankCode
	 * 繳費銀行代碼
	 */
	private String BankCode;
	
	/**
	 * vAccount
	 * 繳費虛擬帳號
	 */
	private String vAccount;
	
	/**
	 * ExpireDate
	 * 繳費期限
	 */
	private String ExpireDate;
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 合作特店編號
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 合作特店編號
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得MerchantTradeNo 合作特店交易編號
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 設定MerchantTradeNo 合作特店交易編號
	 * @param MerchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * 取得RtnCode 交易狀態
	 * @return RtnCode
	 */
	public String getRtnCode() {
		return RtnCode;
	}
	/**
	 * 設定RtnCode 交易狀態
	 * @param RtnCode
	 */
	public void setRtnCode(String rtnCode) {
		RtnCode = rtnCode;
	}
	/**
	 * 取得RtnMsg 交易訊息
	 * @return RtnMsg
	 */
	public String getRtnMsg() {
		return RtnMsg;
	}
	/**
	 * 設定RtnMsg 交易訊息
	 * @param RtnMsg
	 */
	public void setRtnMsg(String rtnMsg) {
		RtnMsg = rtnMsg;
	}
	/**
	 * 取得TradeNo 綠界的交易編號
	 * @return TradeNo
	 */
	public String getTradeNo() {
		return TradeNo;
	}
	/**
	 * 設定TradeNo 綠界的交易編號
	 * @param TradeNo
	 */
	public void setTradeNo(String tradeNo) {
		TradeNo = tradeNo;
	}
	/**
	 * 取得TradeAmt 交易金額
	 * @return TradeAmt
	 */
	public String getTradeAmt() {
		return TradeAmt;
	}
	/**
	 * 設定TradeAmt 交易金額
	 * @param TradeAmt
	 */
	public void setTradeAmt(String tradeAmt) {
		TradeAmt = tradeAmt;
	}
	/**
	 * 取得PaymentType 合作特店選擇的付款方式
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * 設定PaymentType 合作特店選擇的付款方式
	 * @param PaymentType
	 */
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	/**
	 * 取得TradeDate 訂單成立時間
	 * @return TradeDate
	 */
	public String getTradeDate() {
		return TradeDate;
	}
	/**
	 * 設定TradeDate 訂單成立時間
	 * @param TradeDate
	 */
	public void setTradeDate(String tradeDate) {
		TradeDate = tradeDate;
	}
	/**
	 * 取得CheckMacValue 檢查碼
	 * @return CheckMacValue
	 */
	public String getCheckMacValue() {
		return CheckMacValue;
	}
	/**
	 * 設定CheckMacValue 檢查碼
	 * @param CheckMacValue
	 */
	public void setCheckMacValue(String checkMacValue) {
		CheckMacValue = checkMacValue;
	}
	/**
	 * 取得BankCode 繳費銀行代碼
	 * @return BankCode
	 */
	public String getBankCode() {
		return BankCode;
	}
	/**
	 * 設定BankCode 繳費銀行代碼
	 * @param BankCode
	 */
	public void setBankCode(String bankCode) {
		BankCode = bankCode;
	}
	/**
	 * 取得vAccount 繳費虛擬帳號
	 * @return vAccount
	 */
	public String getvAccount() {
		return vAccount;
	}
	/**
	 * 設定vAccount 繳費虛擬帳號
	 * @param vAccount
	 */
	public void setvAccount(String vAccount) {
		this.vAccount = vAccount;
	}
	/**
	 * 取得ExpireDate 繳費期限
	 * @return ExpireDate
	 */
	public String getExpireDate() {
		return ExpireDate;
	}
	/**
	 * 設定ExpireDate 繳費期限
	 * @param ExpireDate
	 */
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	/**
	 * 取得StoreID 合作特店商店代碼，提供合作特店填入店家代碼使用
	 * @return StoreID
	 */
	public String getStoreID() {
		return StoreID;
	}
	/**
	 * 設定StoreID 合作特店商店代碼，提供合作特店填入店家代碼使用
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	/**
	 * 取得CustomField1 自訂名稱欄位1，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField1
	 */
	public String getCustomField1() {
		return CustomField1;
	}
	/**
	 * 設定CustomField1 自訂名稱欄位1，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField1
	 */
	public void setCustomField1(String customField1) {
		CustomField1 = customField1;
	}
	/**
	 * 取得CustomField2 自訂名稱欄位2，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField2
	 */
	public String getCustomField2() {
		return CustomField2;
	}
	/**
	 * 設定CustomField2 自訂名稱欄位2，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField2
	 */
	public void setCustomField2(String customField2) {
		CustomField2 = customField2;
	}
	/**
	 * 取得CustomField3 自訂名稱欄位3，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField3
	 */
	public String getCustomField3() {
		return CustomField3;
	}
	/**
	 * 設定CustomField3 自訂名稱欄位3，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField3
	 */
	public void setCustomField3(String customField3) {
		CustomField3 = customField3;
	}
	/**
	 * 取得CustomField4 自訂名稱欄位4，提供合作廠商使用記錄用客製化使用欄位
	 * @return CustomField4
	 */
	public String getCustomField4() {
		return CustomField4;
	}
	/**
	 * 設定CustomField4 自訂名稱欄位4，提供合作廠商使用記錄用客製化使用欄位
	 * @param customField4
	 */
	public void setCustomField4(String customField4) {
		CustomField4 = customField4;
	}
	/**
	 * 取得PaymentTypeChargeFee 通路費
	 * @return PaymentTypeChargeFee
	 */
	public String getPaymentTypeChargeFee() {
		return PaymentTypeChargeFee;
	}
	/**
	 * 設定PaymentTypeChargeFee 通路費
	 * @param paymentTypeChargeFee
	 */
	public void setPaymentTypeChargeFee(String paymentTypeChargeFee) {
		PaymentTypeChargeFee = paymentTypeChargeFee;
	}
	/**
	 * 取得SimulatePaid 是否為模擬付款 
	 * @return SimulatePaid
	 */
	public String getSimulatePaid() {
		return SimulatePaid;
	}
	/**
	 * 設定SimulatePaid 是否為模擬付款 
	 * @param simulatePaid
	 */
	public void setSimulatePaid(String simulatePaid) {
		SimulatePaid = simulatePaid;
	}
	@Override
	public String toString() {
		return "ATMRequestObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", StoreID="
				+ StoreID + ", RtnCode=" + RtnCode + ", RtnMsg=" + RtnMsg + ", TradeNo=" + TradeNo + ", TradeAmt="
				+ TradeAmt + ", PaymentType=" + PaymentType + ", PaymentTypeChargeFee=" + PaymentTypeChargeFee
				+ ", TradeDate=" + TradeDate + ", SimulatePaid=" + SimulatePaid + ", CustomField1=" + CustomField1
				+ ", CustomField2=" + CustomField2 + ", CustomField3=" + CustomField3 + ", CustomField4=" + CustomField4
				+ ", CheckMacValue=" + CheckMacValue + ", BankCode=" + BankCode + ", vAccount=" + vAccount
				+ ", ExpireDate=" + ExpireDate + "]";
	}
}
