package com.xmg.webkit.form;

import java.io.Serializable;

public class MessageModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String msg;
	private Integer code;
	private boolean success;

	private enum MessageState {

		FAILURE(0, false), SUCCESS(1, true), EXCEPTION(2, false);

		public final int index;
		public final boolean success;

		MessageState(int index, boolean success) {
			this.index = index;
			this.success = success;
		}
	}

	public MessageModel() {

	}

	public MessageModel(boolean success) {
		this.success = success;
	}

	public MessageModel(MessageState state) {
		this.code = state.index;
		this.success = state.success;
	}

	public MessageModel(Integer code) {
		this.code = code;
	}

	public MessageModel(MessageState state, String msg) {
		this.code = state.index;
		this.success = state.success;
		this.msg = msg;
	}

	public MessageModel(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public MessageModel(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
