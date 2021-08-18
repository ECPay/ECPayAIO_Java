package ecpay.payment.integration.domain;

/**
 * 開立發票物件
 * @author mark.chiu
 *
 */
public class InvoiceObj {
	
	/**
	 * RelateNumber
	 * 合作特店自訂編號
	 */
	private String RelateNumber = "";
	
	/**
	 * CustomerID
	 * 客戶代號
	 */
	private String CustomerID = "";
	
	/**
	 * CustomerIdentifier
	 * 統一編號
	 */
	private String CustomerIdentifier = "";
	
	/**
	 * CustomerName
	 * 客戶名稱
	 */
	private String CustomerName = "";
	
	/**
	 * CustomerAddr
	 * 客戶地址
	 */
	private String CustomerAddr = "";
	
	/**
	 * CustomerPhone
	 * 客戶手機號碼
	 */
	private String CustomerPhone = "";
	
	/**
	 * CustomerEmail
	 * 客戶電子信箱
	 */
	private String CustomerEmail = "";
	
	/**
	 * ClearanceMark
	 * 通關方式
	 */
	private String ClearanceMark = "";
	
	/**
	 * TaxType
	 * 課稅類別
	 */
	private String TaxType = "";
	
	/**
	 * CarruerType
	 * 載具類別
	 */
	private String CarruerType = "";
	
	/**
	 * CarruerNum
	 * 載具編號
	 */
	private String CarruerNum = "";
	
	/**
	 * Donation
	 * 捐贈註記
	 */
	private String Donation = "";
	
	/**
	 * LoveCode
	 * 愛心碼
	 */
	private String LoveCode = "";
	
	/**
	 * Print
	 * 列印註記
	 */
	private String Print = "";
	
	/**
	 * InvoiceItemName
	 * 商品名稱
	 */
	private String InvoiceItemName = "";
	
	/**
	 * InvoiceItemCount
	 * 商品數量
	 */
	private String InvoiceItemCount = "";
	
	/**
	 * InvoiceItemWord
	 * 商品單位
	 */
	private String InvoiceItemWord = "";
	
	/**
	 * InvoiceItemPrice
	 * 商品價格
	 */
	private String InvoiceItemPrice = "";
	
	/**
	 * InvoiceItemTaxType
	 * 商品課稅別
	 */
	private String InvoiceItemTaxType = "";
	
	/**
	 * InvoiceRemark
	 * 備註
	 */
	private String InvoiceRemark = "";
	
	/**
	 * DelayDay
	 * 延遲天數
	 */
	private String DelayDay = "";
	
	/**
	 * InvType
	 * 字軌類別
	 */
	private String InvType = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得RelateNumber 合作特店自訂編號
	 * @return RelateNumber
	 */
	public String getRelateNumber() {
		return RelateNumber;
	}
	/**
	 * 設定RelateNumber 合作特店自訂編號
	 * @param relateNumber
	 */
	public void setRelateNumber(String relateNumber) {
		RelateNumber = relateNumber;
	}
	/**
	 * 取得CustomerID 客戶代號
	 * @return CustomerID
	 */
	public String getCustomerID() {
		return CustomerID;
	}
	/**
	 * 設定CustomerID 客戶代號
	 * @param customerID
	 */
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	/**
	 * 取得CustomerIdentifier 統一編號
	 * @return CustomerIdentifier
	 */
	public String getCustomerIdentifier() {
		return CustomerIdentifier;
	}
	/**
	 * 設定CustomerIdentifier 統一編號
	 * @param customerIdentifier
	 */
	public void setCustomerIdentifier(String customerIdentifier) {
		CustomerIdentifier = customerIdentifier;
	}
	/**
	 * 取得CustomerName 客戶名稱
	 * @return CustomerName
	 */
	public String getCustomerName() {
		return CustomerName;
	}
	/**
	 * 設定CustomerName 客戶名稱
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	/**
	 * 取得CustomerAddr 客戶地址
	 * @return CustomerAddr
	 */
	public String getCustomerAddr() {
		return CustomerAddr;
	}
	/**
	 * 設定CustomerAddr 客戶地址
	 * @param customerAddr
	 */
	public void setCustomerAddr(String customerAddr) {
		CustomerAddr = customerAddr;
	}
	/**
	 * 取得CustomerPhone 客戶手機號碼
	 * @return CustomerPhone
	 */
	public String getCustomerPhone() {
		return CustomerPhone;
	}
	/**
	 * 設定CustomerPhone 客戶手機號碼
	 * @param customerPhone
	 */
	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}
	/**
	 * 取得CustomerEmail 客戶電子信箱
	 * @return CustomerEmail
	 */
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	/**
	 * 設定CustomerEmail 客戶電子信箱
	 * @param customerEmail
	 */
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	/**
	 * 取得ClearanceMark 通關方式
	 * @return ClearanceMark
	 */
	public String getClearanceMark() {
		return ClearanceMark;
	}
	/**
	 * 設定ClearanceMark 通關方式
	 * @param clearanceMark
	 */
	public void setClearanceMark(String clearanceMark) {
		ClearanceMark = clearanceMark;
	}
	/**
	 * 取得TaxType 課稅類別
	 * @return TaxType
	 */
	public String getTaxType() {
		return TaxType;
	}
	/**
	 * 設定TaxType 課稅類別
	 * @param taxType
	 */
	public void setTaxType(String taxType) {
		TaxType = taxType;
	}
	/**
	 * 取得CarruerType 載具類別
	 * @return CarruerType
	 */
	public String getCarruerType() {
		return CarruerType;
	}
	/**
	 * 設定CarruerType 載具類別
	 * @param carruerType
	 */
	public void setCarruerType(String carruerType) {
		CarruerType = carruerType;
	}
	/**
	 * 取得CarruerNum 載具編號
	 * @return CarruerNum
	 */
	public String getCarruerNum() {
		return CarruerNum;
	}
	/**
	 * 設定CarruerNum 載具編號
	 * @param carruerNum
	 */
	public void setCarruerNum(String carruerNum) {
		CarruerNum = carruerNum;
	}
	/**
	 * 取得Donation 捐贈註記
	 * @return Donation
	 */
	public String getDonation() {
		return Donation;
	}
	/**
	 * 設定Donation 捐贈註記
	 * @param donation
	 */
	public void setDonation(String donation) {
		Donation = donation;
	}
	/**
	 * 取得LoveCode 愛心碼
	 * @return LoveCode
	 */
	public String getLoveCode() {
		return LoveCode;
	}
	/**
	 * 設定LoveCode 愛心碼
	 * @param loveCode
	 */
	public void setLoveCode(String loveCode) {
		LoveCode = loveCode;
	}
	/**
	 * 取得Print 列印註記
	 * @return Print
	 */
	public String getPrint() {
		return Print;
	}
	/**
	 * 設定Print 列印註記
	 * @param print
	 */
	public void setPrint(String print) {
		Print = print;
	}
	/**
	 * 取得InvoiceItemName 商品名稱
	 * @return InvoiceItemName
	 */
	public String getInvoiceItemName() {
		return InvoiceItemName;
	}
	/**
	 * 設定InvoiceItemName 商品名稱
	 * @param invoiceItemName
	 */
	public void setInvoiceItemName(String invoiceItemName) {
		InvoiceItemName = invoiceItemName;
	}
	/**
	 * 取得InvoiceItemCount 商品數量
	 * @return InvoiceItemCount
	 */
	public String getInvoiceItemCount() {
		return InvoiceItemCount;
	}
	/**
	 * 設定InvoiceItemCount 商品數量
	 * @param invoiceItemCount
	 */
	public void setInvoiceItemCount(String invoiceItemCount) {
		InvoiceItemCount = invoiceItemCount;
	}
	/**
	 * 取得InvoiceItemWord 商品單位
	 * @return InvoiceItemWord
	 */
	public String getInvoiceItemWord() {
		return InvoiceItemWord;
	}
	/**
	 * 設定InvoiceItemWord 商品單位
	 * @param invoiceItemWord
	 */
	public void setInvoiceItemWord(String invoiceItemWord) {
		InvoiceItemWord = invoiceItemWord;
	}
	/**
	 * 取得InvoiceItemPrice 商品價格
	 * @return InvoiceItemPrice
	 */
	public String getInvoiceItemPrice() {
		return InvoiceItemPrice;
	}
	/**
	 * 設定InvoiceItemPrice 商品價格
	 * @param invoiceItemPrice
	 */
	public void setInvoiceItemPrice(String invoiceItemPrice) {
		InvoiceItemPrice = invoiceItemPrice;
	}
	/**
	 * 取得InvoiceItemTaxType 商品課稅別
	 * @return InvoiceItemTaxType
	 */
	public String getInvoiceItemTaxType() {
		return InvoiceItemTaxType;
	}
	/**
	 * 設定InvoiceItemTaxType 商品課稅別
	 * @param invoiceItemTaxType
	 */
	public void setInvoiceItemTaxType(String invoiceItemTaxType) {
		InvoiceItemTaxType = invoiceItemTaxType;
	}
	/**
	 * 取得InvoiceRemark 備註
	 * @return InvoiceRemark
	 */
	public String getInvoiceRemark() {
		return InvoiceRemark;
	}
	/**
	 * 設定InvoiceRemark 備註
	 * @param invoiceRemark
	 */
	public void setInvoiceRemark(String invoiceRemark) {
		InvoiceRemark = invoiceRemark;
	}
	/**
	 * 取得DelayDay 延遲天數
	 * @return DelayDay
	 */
	public String getDelayDay() {
		return DelayDay;
	}
	/**
	 * 設定DelayDay 延遲天數
	 * @param delayDay
	 */
	public void setDelayDay(String delayDay) {
		DelayDay = delayDay;
	}
	/**
	 * 取得InvType 字軌類別
	 * @return InvType
	 */
	public String getInvType() {
		return InvType;
	}
	/**
	 * 設定InvType 字軌類別
	 * @param invType
	 */
	public void setInvType(String invType) {
		InvType = invType;
	}
	@Override
	public String toString() {
		return "InvoiceObj [RelateNumber=" + RelateNumber + ", CustomerID=" + CustomerID + ", CustomerIdentifier="
				+ CustomerIdentifier + ", CustomerName=" + CustomerName + ", CustomerAddr=" + CustomerAddr
				+ ", CustomerPhone=" + CustomerPhone + ", CustomerEmail=" + CustomerEmail + ", ClearanceMark="
				+ ClearanceMark + ", TaxType=" + TaxType + ", CarruerType=" + CarruerType + ", CarruerNum=" + CarruerNum
				+ ", Donation=" + Donation + ", LoveCode=" + LoveCode + ", Print=" + Print + ", InvoiceItemName="
				+ InvoiceItemName + ", InvoiceItemCount=" + InvoiceItemCount + ", InvoiceItemWord=" + InvoiceItemWord
				+ ", InvoiceItemPrice=" + InvoiceItemPrice + ", InvoiceItemTaxType=" + InvoiceItemTaxType
				+ ", InvoiceRemark=" + InvoiceRemark + ", DelayDay=" + DelayDay + ", InvType=" + InvType + "]";
	}
}
