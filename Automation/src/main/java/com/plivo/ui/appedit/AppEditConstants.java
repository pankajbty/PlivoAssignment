package com.plivo.ui.appedit;

public interface AppEditConstants {
	public String letsGetStarted_byXpath = "//button[contains(text(),\"Let's get started!\")]";
	public String plusNewPage_byId = "add-page";
	public String enterNewPageName_byXpath = "(//input[@type='text'][@name='name'])[2]";
	public String enterNameInNewPageTextField = "Test";
	public String create_byXpath = "(//button[contains(text(),'Create')])[2]";
	public String messaging_byLinkText = "Messaging";
	
	public String sendAnEmailDrag_byXpath = "(//li[@class='module-item ui-widget-content ui-corner-all module-item-green ui-draggable'])[2]";
	public String sendAnSMSDrag_byXpath = "(//li[@class='module-item ui-widget-content ui-corner-all module-item-green ui-draggable'])[3]";
	public String sendAnSMSPhoneNumber_byXpath = "//textarea[@name='phone_constant']";
	public String sendAnSMSMessageText_byXpath = "(//textarea[@name='message_phrase[]'])[1]";
	public String sendAnEmailMessageText_byXpath = "(//textarea[@name='message_phrase[]'])[3]";
	public String testPageDiv_byXpath = "(//div[@class='syn-node ui-draggable syn-node-active'])[2]";
	public String startTag_byXpath = "(//div[@class='module-title'])[2]";
	
	public String dragAndDropOnSendSMS_byXpath = "//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active']";
	
	public String sendSMSDrag_byXpath = "(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[1]";
	public String sendSMSDrag_byClass = "(//th[contains(text(),'Message Text or Variable')])[1]";
	public String sendEmailDrag_byXpath = "(//th[contains(text(),'Message Text or Variable')])[2]";
	
	public String sendSMSToEmail_byXpath = "//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active']";
	public String sendSMSToEmailDrag_byXpath = "(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[2]";
	
	public String baiscButton_LinkText = "Basic";
	public String hangUpExit_byXpath = "//li[@class='module-item ui-widget-content ui-corner-all module-item-red ui-draggable']";
	public String moveHangUpExit_byXpath = "//div[@class='panel-hd panel-hd-1-button']";
	public String moveHangUpExit2_byXpath = "(//div[@class='panel-hd panel-hd-1-button'])[2]";
	public String moveHangUpExit3_byXpath = "(//div[@class='panel-hd panel-hd-1-button'])[3]";
	
	public String smtpURL_byXpath = "//input[@name='smtp_url']";
	public String smtpPort_byXpath = "//input[@name='port']";
	public String usernameField_byXpath = "//input[@class='text'][@name='username']";
	public String passwordField_byXpath = "//input[@class='text'][@name='password']";
	public String fromField_byXpath = "//textarea[@name='from_constant']";
	public String toField_byXpath = "//textarea[@name='to_constant']";
	public String subjectField_byXpath = "//textarea[@name='subject_constant']";
	
	
	public String startCircleDragElement_byXpath = "(//div[@class='syn-node ui-draggable syn-node-active'])[2]"; 
	
	public String sendAnSMSCircleSent_byXpath = "(//div[@class='syn-node syn-node-attached-w ui-draggable syn-node-active'])[1]";
	public String sendAnEmailCircleSent_byXpath = "(//div[contains(@class,'syn-node syn-node-attached-w ui-draggable syn-node-active')])";	
	public String sendAnSMSCircleNotSent_byXpath = "(//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active'])[1]";
	public String sendAnEmailCircleNotSent_byXpath = "(//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active'])";
	
	public String sendAnSMSTriangle_byXpath = "(//div[contains(@class,'syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable')])[1]";
	public String sendAnEmailTriangle_byXpath = "(//div[contains(@class,'syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable')])[2]";
	public String exitTriangle1_byXpath = "(//div[contains(@class,'syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable')])[3]";
	public String exitTriangle2_byXpath = "(//div[contains(@class,'syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable')])[4]";
	public String exitTriangle3_byXpath = "(//div[contains(@class,'syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable')])[5]";
	
	public String tab_byId = "tabs-2";
	
}
