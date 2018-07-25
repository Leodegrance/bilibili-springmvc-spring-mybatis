package com.main.service;

public interface ErrorCode {
	String Success = "成功";
	String User_Email_Identical = "旧邮箱不匹配";
	String User_Email_Error = "新旧邮箱相同";
	String Email_Length_Error = "邮箱长度错误，正确长度 0 ~ 32";
	String Email_Foramt_Error = "邮箱格式错误";
	String UnInput = "尚未输入";
	String Password_Identical = "旧密码不正确";
	String AmendTheSuccess = "修改成功";
	String InputInconsistency = "新密码两次输入不一致";
	String Oldpwd_Newpwd = "新旧密码相同";
	String Length_Inputerror = "长度输入错误, 0 ~ 48";
	String Change_Address_Error = "修改地址失败";
	String Unknow = "未知错误";
}
