package ecpay.payment.integration.domain;

/**
 * 信用卡關帳/退刷/取消/放棄物件
 * @author mark.chiu
 *
 */
public class DoActionObj {
	
	/**
	 * MerchantID
	 * 合作特店編號(由綠界提供)
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * 合作特店交易編號
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * TradeNo
	 * 綠界的交易編號
	 */
	private String TradeNo = "";
	
	/**
	 * Action
	 * 執行動作
	 */
	private String Action = "";
	
	/**
	 * TotalAmount
	 * 金額
	 */
	private String TotalAmount = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號(由綠界提供)
	 */
	private String PlatformID = "";
	
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
	 * 取得Action 執行動作
	 * @return Action
	 */
	public String getAction() {
		return Action;
	}
	/**
	 * 設定Action 執行動作
	 * @param action
	 */
	public void setAction(String action) {
		Action = action;
	}
	/**
	 * 取得TotalAmount 金額
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * 設定TotalAmount 金額
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號(由綠界提供)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號(由綠界提供)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	@Override
	public String toString() {
		return "DoActionObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", TradeNo=" + TradeNo
				+ ", Action=" + Action + ", TotalAmount=" + TotalAmount + ", PlatformID=" + PlatformID + "]";
	}
}
