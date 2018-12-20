package com.plivo.ui.appedit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.plivo.ui.BasePage;

public class AppEdit extends BasePage implements AppEditConstants{

	public AppEdit(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = letsGetStarted_byXpath)
	WebElement letsGetStartedByXpath;
	public WebElement getLetsGetStartedByXpath(){
		return letsGetStartedByXpath;
	}
	
	@FindBy(id = plusNewPage_byId)
	WebElement plusNewPageById;
	public WebElement getPlusNewPageById(){
		return plusNewPageById;
	}
	
	@FindBy(xpath = enterNewPageName_byXpath)
	WebElement enterNewPageNameByXpath;
	public WebElement getEnterNewPageNameByXpath(){
		return enterNewPageNameByXpath;
	}
	
	@FindBy(xpath = create_byXpath)
	WebElement create_ByXpath;
	public WebElement getCreateByXpath(){
		return create_ByXpath;
	}
	
	@FindBy(partialLinkText = messaging_byLinkText)
	WebElement messaging_ByLinkText;
	public WebElement getMessagingByLinkText(){
		return messaging_ByLinkText;
	}
	
	@FindBy(xpath = sendAnSMSDrag_byXpath)
	WebElement sendAnSMSDragByXpath;
	public WebElement getSendAnSMSDragByXpath(){
		return sendAnSMSDragByXpath;
	}
	
	@FindBy(xpath = sendSMSDrag_byClass)
	WebElement sendAnSMSDragByClass;
	public WebElement getSendAnSMSDragByClass(){
		return sendAnSMSDragByClass;
	}
	
	@FindBy(xpath = testPageDiv_byXpath)
	WebElement testPageDivByXpath;
	public WebElement getTestPageDivByXpath(){
		return testPageDivByXpath;
	}
	
	@FindBy(xpath = sendSMSDrag_byXpath)
	WebElement sendSMSDragByXpath;
	public WebElement getSendSMSDragByXpath(){
		return sendSMSDragByXpath;
	}
	
//	@FindBy(xpath = sendSMSDrag_byClass)
//	WebElement sendSMSDragByClass;
//	public WebElement getSendSMSDragByClass(){
//		return sendSMSDragByClass;
//	}
	
	@FindBy(xpath = sendAnEmailDrag_byXpath)
	WebElement sendAnEmailDragByXpath;
	public WebElement getSendAnEmailDragByXpath(){
		return sendAnEmailDragByXpath;
	}
	
	@FindBy(xpath = dragAndDropOnSendSMS_byXpath)
	WebElement dragAndDropOnSendSMSByXpath;
	public WebElement getDragAndDropOnSendSMSByXpath(){
		return dragAndDropOnSendSMSByXpath;
	}

	@FindBy(xpath = sendEmailDrag_byXpath)
	WebElement sendEmailDragByXpath;
	public WebElement getSendEmailDragByXpath(){
		return sendEmailDragByXpath;
	}
	
	@FindBy(xpath = sendSMSToEmail_byXpath)
	WebElement sendSMSToEmailByXpath;
	public WebElement getSendSMSToEmailByXpath(){
		return sendSMSToEmailByXpath;
	}
	
	@FindBy(xpath = sendSMSToEmailDrag_byXpath)
	WebElement sendSMSToEmailDragByXpath;
	public WebElement getSendSMSToEmailDragByXpath(){
		return sendSMSToEmailDragByXpath;
	}
	
	@FindBy(linkText = baiscButton_LinkText)
	WebElement baiscButtonLinkText;
	public WebElement getBaiscButtonLinkText(){
		return baiscButtonLinkText;
	}
	
	@FindBy(xpath = hangUpExit_byXpath)
	WebElement hangUpExitByXpath;
	public WebElement getHangUpExitByXpath(){
		return hangUpExitByXpath;
	}
	
	@FindBy(xpath = moveHangUpExit_byXpath)
	WebElement moveHangUpExitByXpath;
	public WebElement getMoveHangUpExitByXpath(){
		return moveHangUpExitByXpath;
	}
	
	@FindBy(xpath = moveHangUpExit2_byXpath)
	WebElement moveHangUpExit2ByXpath;
	public WebElement getMoveHangUpExit2ByXpath(){
		return moveHangUpExit2ByXpath;
	}
	
	@FindBy(xpath = moveHangUpExit3_byXpath)
	WebElement moveHangUpExit3ByXpath;
	public WebElement getMoveHangUpExit3ByXpath(){
		return moveHangUpExit3ByXpath;
	}
	
	@FindBy(xpath = sendAnSMSPhoneNumber_byXpath)
	WebElement sendAnSMSPhoneNumberByXpath;
	public WebElement getSendAnSMSPhoneNumberByXpath(){
		return sendAnSMSPhoneNumberByXpath;
	}
	
	@FindBy(xpath = sendAnSMSMessageText_byXpath)
	WebElement sendAnSMSMessageTextByXpath;
	public WebElement getsendAnSMSMessageTextByXpath(){
		return sendAnSMSMessageTextByXpath;
	}
	
	@FindBy(xpath = sendAnEmailMessageText_byXpath)
	WebElement sendAnEmailMessageTextByXpath;
	public WebElement getsendAnEmailMessageTextByXpath(){
		return sendAnEmailMessageTextByXpath;
	}
	
	
	@FindBy(xpath = smtpURL_byXpath)
	WebElement smtpURLByXpath;
	public WebElement getSmtpURLByXpath(){
		return smtpURLByXpath;
	}
	
	//
	@FindBy(xpath = smtpPort_byXpath)
	WebElement smtpPortByXpath;
	public WebElement getSmtpPortByXpath(){
		return smtpPortByXpath;
	}
	
	@FindBy(xpath = usernameField_byXpath)
	WebElement usernameFieldByXpath;
	public WebElement getUsernameFieldByXpath(){
		return usernameFieldByXpath;
	}
	
	@FindBy(xpath = passwordField_byXpath)
	WebElement passwordFieldByXpath;
	public WebElement getPasswordFieldByXpath(){
		return passwordFieldByXpath;
	}
	
	@FindBy(xpath = fromField_byXpath)
	WebElement fromFieldByXpath;
	public WebElement getFromFieldByXpath(){
		return fromFieldByXpath;
	}
	
	@FindBy(xpath = toField_byXpath)
	WebElement toFieldByXpath;
	public WebElement getToFieldByXpath(){
		return toFieldByXpath;
	}
	
	@FindBy(xpath = subjectField_byXpath)
	WebElement subjectFieldByXpath;
	public WebElement getSubjectFieldByXpath(){
		return subjectFieldByXpath;
	}
	
	
	
	//
	@FindBy(xpath = startCircleDragElement_byXpath)
	WebElement startCircleDragElementByXpath;
	public WebElement getStartCircleDragElementByXpath(){
		return startCircleDragElementByXpath;
	}
	
	@FindBy(xpath = sendAnSMSCircleSent_byXpath)
	WebElement sendAnSMSCircleSentByXpath;
	public WebElement getSendAnSMSCircleSentByXpath(){
		return sendAnSMSCircleSentByXpath;
	}
	
	@FindBy(xpath = sendAnEmailCircleSent_byXpath)
	WebElement sendAnEmailCircleSentByXpath;
	public WebElement getSendAnEmailCircleSentByXpath(){
		return sendAnEmailCircleSentByXpath;
	}
	
	@FindBy(xpath = sendAnSMSCircleNotSent_byXpath)
	WebElement sendAnSMSCircleNotSentByXpath;
	public WebElement getSendAnSMSCircleNotSentByXpath(){
		return sendAnSMSCircleNotSentByXpath;
	}
	
	@FindBy(xpath = sendAnEmailCircleNotSent_byXpath)
	WebElement sendAnEmailCircleNotSentByXpath;
	public WebElement getSendAnEmailCircleNotSentByXpath(){
		return sendAnEmailCircleNotSentByXpath;
	}
	
	@FindBy(xpath = sendAnSMSTriangle_byXpath)
	WebElement sendAnSMSTriangleByXpath;
	public WebElement getSendAnSMSTriangleByXpath(){
		return sendAnSMSTriangleByXpath;
	}
	
	@FindBy(xpath = sendAnEmailTriangle_byXpath)
	WebElement sendAnEmailTriangleByXpath;
	public WebElement getSendAnEmailTriangleByXpath(){
		return sendAnEmailTriangleByXpath;
	}
	
	@FindBy(xpath = exitTriangle1_byXpath)
	WebElement exitTriangle1ByXpath;
	public WebElement getExitTriangle1ByXpath(){
		return exitTriangle1ByXpath;
	}
	
	@FindBy(xpath = exitTriangle2_byXpath)
	WebElement exitTriangle2ByXpath;
	public WebElement getExitTriangle2ByXpath(){
		return exitTriangle2ByXpath;
	}
	
	@FindBy(xpath = exitTriangle3_byXpath)
	WebElement exitTriangle3ByXpath;
	public WebElement getExitTriangle3ByXpath(){
		return exitTriangle3ByXpath;
	}
	
	
	
	@FindBy(id = tab_byId)
	WebElement tab;
	public WebElement getTabById(){
		return tab;
	}
}
