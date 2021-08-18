package ecpay.payment.integration.exception;

public class EcpayException extends Error{
	private static final long serialVersionUID = 1L;
	String NewExceptionMessage;
	public EcpayException(String s){
		this.NewExceptionMessage = s;
	}
	public String getNewExceptionMessage() {
		return NewExceptionMessage;
	}
	public void setNewExceptionMessage(String newExceptionMessage) {
		NewExceptionMessage = newExceptionMessage;
	}
	public void ShowExceptionMessage(){
		
		System.out.println("發生錯誤: " + getNewExceptionMessage());
	}
	
}
