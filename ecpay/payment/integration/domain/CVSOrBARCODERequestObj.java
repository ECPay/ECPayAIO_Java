package ecpay.payment.integration.domain;

/**
 * 當ChoosePayment為CVS或BARCODE時的取號結果通知物件
 * @author mark.chiu
 *
 */
public class CVSOrBARCODERequestObj {
	
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
	 * 
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
	 * CheckMacValue
	 * 檢查碼
	 */
	private String CheckMacValue;
	
	/**
	 * PaymentNo
	 * 繳費代碼
	 */
	private String PaymentNo;
	
	/**
	 * ExpireDate
	 * 繳費期限
	 */
	private String ExpireDate;
	
	/**
	 * Barcode1
	 * 條碼第一段號碼
	 */
	private String Barcode1;
	
	/**
	 * Barcode2
	 * 條碼第二段號碼
	 */
	private String Barcode2;
	
	/**
	 * Barcode3
	 * 條碼第三段號碼
	 */
	private String Barcode3;
	
	/**
	 * StoreID
	 * 合作特店商店代碼，提供合作特店填入店家代碼使用
	 */
	private String StoreID;
	
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
	 * @param merchantTradeNo
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
	 * @param rtnCode
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
	 * @param rtnMsg
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
	 * @param tradeNo
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
	 * @param tradeAmt
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
	 * @param paymentType
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
	 * @param tradeDate
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
	 * @param checkMacValue
	 */
	public void setCheckMacValue(String checkMacValue) {
		CheckMacValue = checkMacValue;
	}
	/**
	 * 取得PaymentNo 繳費代碼
	 * @return PaymentNo
	 */
	public String getPaymentNo() {
		return PaymentNo;
	}
	/**
	 * 設定PaymentNo 繳費代碼
	 * @param paymentNo
	 */
	public void setPaymentNo(String paymentNo) {
		PaymentNo = paymentNo;
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
	 * @param expireDate
	 */
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	/**
	 * 取得Barcode1 條碼第一段號碼
	 * @return Barcode1
	 */
	public String getBarcode1() {
		return Barcode1;
	}
	/**
	 * 設定Barcode1 條碼第一段號碼
	 * @param barcode1
	 */
	public void setBarcode1(String barcode1) {
		Barcode1 = barcode1;
	}
	/**
	 * 取得Barcode2 條碼第二段號碼
	 * @return Barcode2
	 */
	public String getBarcode2() {
		return Barcode2;
	}
	/**
	 * 設定Barcode2 條碼第二段號碼
	 * @param barcode2
	 */
	public void setBarcode2(String barcode2) {
		Barcode2 = barcode2;
	}
	/**
	 * 取得Barcode3 條碼第三段號碼
	 * @return Barcode3
	 */
	public String getBarcode3() {
		return Barcode3;
	}
	/**
	 * 設定Barcode3 條碼第三段號碼
	 * @param barcode3
	 */
	public void setBarcode3(String barcode3) {
		Barcode3 = barcode3;
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
		return "CVSOrBARCODERequestObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo
				+ ", RtnCode=" + RtnCode + ", RtnMsg=" + RtnMsg + ", TradeNo=" + TradeNo + ", TradeAmt=" + TradeAmt
				+ ", PaymentType=" + PaymentType + ", PaymentTypeChargeFee=" + PaymentTypeChargeFee + ", TradeDate="
				+ TradeDate + ", SimulatePaid=" + SimulatePaid + ", CheckMacValue=" + CheckMacValue + ", PaymentNo="
				+ PaymentNo + ", ExpireDate=" + ExpireDate + ", Barcode1=" + Barcode1 + ", Barcode2=" + Barcode2
				+ ", Barcode3=" + Barcode3 + ", StoreID=" + StoreID + ", CustomField1=" + CustomField1
				+ ", CustomField2=" + CustomField2 + ", CustomField3=" + CustomField3 + ", CustomField4=" + CustomField4
				+ "]";
	}
}
