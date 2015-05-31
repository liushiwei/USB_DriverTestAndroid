package com.viewtool.USBDriver;


public class ErrorType {
	static public int ERR_SUCCESS = 0;					//û�д���
	static public int ERR_PARAMETER_NULL = -1;			//�����ָ��Ϊ��ָ��
	static public int ERR_INPUT_DATA_TOO_MUCH = -2;		//���������������涨����
	static public int ERR_INPUT_DATA_TOO_LESS = -3;		//���������������涨����
	static public int ERR_INPUT_DATA_ILLEGALITY = -4;	//���������ʽ�͹涨�Ĳ�����
	static public int ERR_USB_WRITE_DATA = -5;			//USBд���ݴ���
	static public int ERR_USB_READ_DATA = -6;			//USB�����ݴ���
	static public int ERR_READ_NO_DATA = -7;			//���������ʱ����û������
	static public int ERR_OPEN_DEVICE = -8;				//���豸ʧ��
	static public int ERR_CLOSE_DEVICE = -9;			//�ر��豸ʧ��
	static public int ERR_EXECUTE_CMD = -10;			//�豸ִ������ʧ��
	static public int ERR_SELECT_DEVICE = -11;			//ѡ���豸ʧ��
	static public int ERR_DEVICE_OPENED = -12;			//�豸�Ѿ���
	static public int ERR_DEVICE_NOTOPEN = -13;			//�豸û�д�
	static public int ERR_BUFFER_OVERFLOW = -14;		//���������
	static public int ERR_DEVICE_NOTEXIST = -15;		//���豸������
	static public int ERR_LOAD_KERNELDLL = -16;			//װ�ض�̬��ʧ��
	static public int ERR_CMD_FAILED = -17;				//ִ������ʧ�ܴ�����
	static public int ERR_BUFFER_CREATE = -18;			//�ڴ治��
	static public int ERR_NO_PERMISSIONS = -19;			//û��Ȩ��
}