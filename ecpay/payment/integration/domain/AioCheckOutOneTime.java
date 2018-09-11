package ecpay.payment.integration.domain;

/**
 * ���縑��銝�甈∩����隞�
 * @author mark.chiu
 *
 */
public class AioCheckOutOneTime {
	
	/**
	 * MerchantID
	 * ���摨楊���(�蝬����)
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * ���摨漱��楊���(����摨���)嚗府鈭斗�楊����銴�
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * MerchantTradeDate
	 * ���摨漱�����
	 */
	private String MerchantTradeDate = "";
	
	/**
	 * PaymentType
	 * 鈭斗����
	 */
	private String PaymentType = "aio";
	
	/**
	 * TotalAmount
	 * 鈭斗�憿�
	 */
	private String TotalAmount = "";
	
	/**
	 * TradeDesc
	 * 鈭斗��膩
	 */
	private String TradeDesc = "";
	
	/**
	 * ItemName
	 * ����迂
	 */
	private String ItemName = "";
	
	/**
	 * ReturnURL
	 * 隞狡摰���蝬脣�
	 */
	private String ReturnURL = "";
	
	/**
	 * ChoosePayment
	 * ����身隞狡�撘�
	 */
	private String ChoosePayment = "Credit";
	
	/**
	 * ClientBackURL
	 * Client蝡航����摨頂蝯梁����蝯�
	 */
	private String ClientBackURL = "";
	
	/**
	 * ItemURL
	 * ����蝬脣�
	 */
	private String ItemURL = "";
	
	/**
	 * Remark
	 * �閮餅���
	 */
	private String Remark = "";
	
	/**
	 * ChooseSubPayment
	 * ����身隞狡摮�
	 */
	private String ChooseSubPayment = "";
	
	/**
	 * OrderResultURL
	 * Client蝡臬�隞狡蝯�雯��
	 */
	private String OrderResultURL = "";
	
	/**
	 * NeedExtraPaidInfo
	 * ����閬����狡鞈��
	 */
	private String NeedExtraPaidInfo = "";
	
	/**
	 * DeviceSource
	 * 鋆蔭靘��
	 */
	private String DeviceSource = "";
	
	/**
	 * IgnorePayment
	 * ����狡�撘�
	 */
	private String IgnorePayment = "";
	
	/**
	 * PlatformID
	 * �蝝��像���誨���(�蝬����)
	 */
	private String PlatformID = "";
	
	/**
	 * InvoiceMark
	 * �摮蟡券��酉閮�
	 */
	private String InvoiceMark = "";
	

	private String EncryptType = "1";
	
	/**
	 * Redeem
	 * 靽∠���雿輻蝝��
	 */
	private String Redeem = "";
	
	/**
	 * UnionPay
	 * �������鈭斗��
	 */
	private String UnionPay = "";
	
	/**
	 * Language
	 * 隤頂閮剖��
	 */
	private String Language = "";
	
	/**
	 * StoreID
	 * ���摨��誨蝣潘�����摨‵�摨振隞�蝣潔蝙�
	 */
	private String StoreID = "";
	
	/**
	 * CustomField1
	 * �閮�迂甈��1嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField1 = "";
	
	/**
	 * CustomField2
	 * �閮�迂甈��2嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField2 = "";
	
	/**
	 * CustomField3
	 * �閮�迂甈��3嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField3 = "";
	
	/**
	 * CustomField4
	 * �閮�迂甈��4嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 */
	private String CustomField4 = "";
	
	/**
	 * BidingCard
	 * 閮����蝙�閮靽∠� 1:雿輻  0:銝蝙�
	 */
	private String BidingCard = "";
	
	/**
	 * MerchantMemberID
	 * 閮����蝣潘����摨蝙���霅蝣潘�閮���1��������蝣潛敹‵
	 */
	private String MerchantMemberID = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * ���erchantID ���摨楊���(�蝬����)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 閮剖�erchantID ���摨楊���(�蝬����)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * ���erchantTradeNo ���摨漱��楊���(����摨���)嚗府鈭斗�楊����銴�
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 閮剖�erchantTradeNo ���摨漱��楊���(����摨���)嚗府鈭斗�楊����銴�
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * ���erchantTradeDate ���摨漱�����
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	/**
	 * 閮剖�erchantTradeDate ���摨漱������誑 yyyy/MM/dd HH:mm:ss�撘葆�
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	/**
	 * ���aymentType 鈭斗����
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * 閮剖�aymentType 鈭斗����
	 * @param paymentType
	 */
//	public void setPaymentType(String paymentType) {
//		PaymentType = paymentType;
//	}
	/**
	 * ���otalAmount 鈭斗�憿�
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * 閮剖�otalAmount 鈭斗�憿�
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	/**
	 * ���radeDesc 鈭斗��膩
	 * @return TradeDesc
	 */
	public String getTradeDesc() {
		return TradeDesc;
	}
	/**
	 * 閮剖�radeDesc 鈭斗��膩
	 * @param tradeDesc
	 */
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}
	/**
	 * ���temName ����迂
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * 閮剖�temName ����迂
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * ���eturnURL 隞狡摰���蝬脣�
	 * @return ReturnURL
	 */
	public String getReturnURL() {
		return ReturnURL;
	}
	/**
	 * 閮剖�eturnURL 隞狡摰���蝬脣�
	 * @param returnURL
	 */
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	/**
	 * ���hoosePayment ����身隞狡�撘�
	 * @return ChoosePayment
	 */
	public String getChoosePayment() {
		return ChoosePayment;
	}
	/**
	 * 閮剖�hoosePayment ����身隞狡�撘�
	 * @param choosePayment
	 */
//	public void setChoosePayment(String choosePayment) {
//		ChoosePayment = choosePayment;
//	}
	/**
	 * ���lientBackURL Client蝡航����摨頂蝯梁����蝯�
	 * @return ClientBackURL
	 */
	public String getClientBackURL() {
		return ClientBackURL;
	}
	/**
	 * 閮剖�lientBackURL Client蝡航����摨頂蝯梁����蝯�
	 * @param clientBackURL
	 */
	public void setClientBackURL(String clientBackURL) {
		ClientBackURL = clientBackURL;
	}
	/**
	 * ���temURL ����蝬脣�
	 * @return ItemURL
	 */
	public String getItemURL() {
		return ItemURL;
	}
	/**
	 * 閮剖�� ItemURL ����蝬脣�
	 * @param itemURL
	 */
	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
	}
	/**
	 * ���emark �閮餅���
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * 閮剖�emark �閮餅���
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	/**
	 * ���hooseSubPayment ����身隞狡摮�
	 * @return ChooseSubPayment
	 */
	public String getChooseSubPayment() {
		return ChooseSubPayment;
	}
	/**
	 * 閮剖�hooseSubPayment ����身隞狡摮�
	 * @param chooseSubPayment
	 */
	public void setChooseSubPayment(String chooseSubPayment) {
		ChooseSubPayment = chooseSubPayment;
	}
	/**
	 * ���rderResultURL Client蝡臬�隞狡蝯�雯��
	 * @return OrderResultURL
	 */
	public String getOrderResultURL() {
		return OrderResultURL;
	}
	/**
	 * 閮剖�rderResultURL Client蝡臬�隞狡蝯�雯��
	 * @param orderResultURL
	 */
	public void setOrderResultURL(String orderResultURL) {
		OrderResultURL = orderResultURL;
	}
	/**
	 * ���eedExtraPaidInfo ����閬����狡鞈�� 
	 * @return NeedExtraPaidInfo
	 */
	public String getNeedExtraPaidInfo() {
		return NeedExtraPaidInfo;
	}
	/**
	 * 閮剖�eedExtraPaidInfo ����閬����狡鞈�� 
	 * @param needExtraPaidInfo
	 */
	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		NeedExtraPaidInfo = needExtraPaidInfo;
	}
	/**
	 * ���eviceSource 鋆蔭靘��
	 * @return DeviceSource
	 */
	public String getDeviceSource() {
		return DeviceSource;
	}
	/**
	 * 閮剖�eviceSource 鋆蔭靘��
	 * @param deviceSource
	 */
	public void setDeviceSource(String deviceSource) {
		DeviceSource = deviceSource;
	}
	/**
	 * ���gnorePayment ����狡�撘�
	 * @return IgnorePayment
	 */
	public String getIgnorePayment() {
		return IgnorePayment;
	}
	/**
	 * 閮剖�gnorePayment ����狡�撘�
	 * @param ignorePayment
	 */
	public void setIgnorePayment(String ignorePayment) {
		IgnorePayment = ignorePayment;
	}
	/**
	 * ���latformID �蝝��像���誨���(�蝬����)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 閮剖�latformID �蝝��像���誨���(�蝬����)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * ���nvoiceMark �摮蟡券��酉閮�
	 * @return InvoiceMark
	 */
	public String getInvoiceMark() {
		return InvoiceMark;
	}
	/**
	 * 閮剖�nvoiceMark �摮蟡券��酉閮�
	 * @param invoiceMark
	 */
	public void setInvoiceMark(String invoiceMark) {
		InvoiceMark = invoiceMark;
	}
	
	/**
	 * ���ncryptType CheckMacValue�撖���
	 * @return EncryptType
	 */
	public String getEncryptType() {
		return EncryptType;
	}
	/**
	 * 閮剖�ncryptType CheckMacValue�撖���
	 * @param encryptType
	 */
//	public void setEncryptType(String encryptType) {
//		EncryptType = encryptType;
//	}
	/**
	 * ���edeem 靽∠���雿輻蝝��
	 * @return Redeem
	 */
	public String getRedeem() {
		return Redeem;
	}
	/**
	 * 閮剖�edeem 靽∠���雿輻蝝��
	 * @param redeem
	 */
	public void setRedeem(String redeem) {
		Redeem = redeem;
	}
	/**
	 * ���nionPay �������鈭斗��
	 * @return UnionPay
	 */
	public String getUnionPay() {
		return UnionPay;
	}
	/**
	 * 閮剖�nionPay �������鈭斗��
	 * @param unionPay
	 */
	public void setUnionPay(String unionPay) {
		UnionPay = unionPay;
	}
	/**
	 * ���anguage 隤頂閮剖��
	 * @return Language
	 */
	public String getLanguage() {
		return Language;
	}
	/**
	 * 閮剖�anguage 隤頂閮剖��
	 * @param language
	 */
	public void setLanguage(String language) {
		Language = language;
	}
	/**
	 * ���toreID ���摨��誨蝣潘�����摨‵�摨振隞�蝣潔蝙�
	 * @return StoreID
	 */
	public String getStoreID() {
		return StoreID;
	}
	/**
	 * 閮剖�toreID ���摨��誨蝣潘�����摨‵�摨振隞�蝣潔蝙�
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	/**
	 * ���ustomField1 �閮�迂甈��1嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField1
	 */
	public String getCustomField1() {
		return CustomField1;
	}
	/**
	 * 閮剖�ustomField1 �閮�迂甈��1嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField1
	 */
	public void setCustomField1(String customField1) {
		CustomField1 = customField1;
	}
	/**
	 * ���ustomField2 �閮�迂甈��2嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField2
	 */
	public String getCustomField2() {
		return CustomField2;
	}
	/**
	 * 閮剖�ustomField2 �閮�迂甈��2嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField2
	 */
	public void setCustomField2(String customField2) {
		CustomField2 = customField2;
	}
	/**
	 * ���ustomField3 �閮�迂甈��3嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField3
	 */
	public String getCustomField3() {
		return CustomField3;
	}
	/**
	 * 閮剖�ustomField3 �閮�迂甈��3嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField3
	 */
	public void setCustomField3(String customField3) {
		CustomField3 = customField3;
	}
	/**
	 * ���ustomField4 �閮�迂甈��4嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @return CustomField4
	 */
	public String getCustomField4() {
		return CustomField4;
	}
	/**
	 * 閮剖�ustomField4 �閮�迂甈��4嚗������蝙�閮�摰Ｚˊ��蝙�甈��
	 * @param customField4
	 */
	public void setCustomField4(String customField4) {
		CustomField4 = customField4;
	}
	/**
	 * ���idingCard 閮����蝙�閮靽∠� 1:雿輻  0:銝蝙�
	 * @return BidingCard
	 */
	public String getBidingCard() {
		return BidingCard;
	}
	/**
	 * 閮剖�idingCard 閮����蝙�閮靽∠� 1:雿輻  0:銝蝙�
	 * @param bidingCard
	 */
	public void setBidingCard(String bidingCard) {
		BidingCard = bidingCard;
	}
	/**
	 * ���erchantMemberID 閮����蝣潘����摨蝙���霅蝣潘�閮���1��������蝣潛敹‵
	 * @return MerchantMemberID
	 */
	public String getMerchantMemberID() {
		return MerchantMemberID;
	}
	/**
	 * 閮剖�erchantMemberID 閮����蝣潘����摨蝙���霅蝣潘�閮���1��������蝣潛敹‵
	 * @param merchantMemberID
	 */
	public void setMerchantMemberID(String merchantMemberID) {
		MerchantMemberID = merchantMemberID;
	}
	@Override
	public String toString() {
		return "AioCheckOutOneTime [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo
				+ ", MerchantTradeDate=" + MerchantTradeDate + ", PaymentType=" + PaymentType + ", TotalAmount="
				+ TotalAmount + ", TradeDesc=" + TradeDesc + ", ItemName=" + ItemName + ", ReturnURL=" + ReturnURL
				+ ", ChoosePayment=" + ChoosePayment + ", ClientBackURL=" + ClientBackURL + ", ItemURL=" + ItemURL
				+ ", Remark=" + Remark + ", ChooseSubPayment=" + ChooseSubPayment + ", OrderResultURL=" + OrderResultURL
				+ ", NeedExtraPaidInfo=" + NeedExtraPaidInfo + ", DeviceSource=" + DeviceSource + ", IgnorePayment="
				+ IgnorePayment + ", PlatformID=" + PlatformID + ", InvoiceMark=" + InvoiceMark + ", EncryptType=" + EncryptType + ", Redeem=" + Redeem + ", UnionPay=" + UnionPay
				+ ", Language=" + Language + ", StoreID=" + StoreID + ", CustomField1=" + CustomField1
				+ ", CustomField2=" + CustomField2 + ", CustomField3=" + CustomField3 + ", CustomField4=" + CustomField4
				+ ", BidingCard=" + BidingCard + ", MerchantMemberID=" + MerchantMemberID + "]";
	}
}
