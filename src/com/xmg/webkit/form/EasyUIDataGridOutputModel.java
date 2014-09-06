package com.xmg.webkit.form;

import java.util.List;

public class EasyUIDataGridOutputModel<Entity> {

	private int total;
	private List<Entity> rows;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Entity> getRows() {
		return rows;
	}

	public void setRows(List<Entity> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "EasyUIDataGridOutputModel [total=" + total + ", rows=" + rows
				+ "]";
	}

}
