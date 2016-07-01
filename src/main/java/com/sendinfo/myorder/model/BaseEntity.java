package com.sendinfo.myorder.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class BaseEntity<E extends Serializable> implements java.io.Serializable {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", modifiedTime=" + modifiedTime
				+ ", createTime=" + createTime + ", deleted=" + deleted
				+ ", now=" + now + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8105824487457790337L;

	private E id;

	// 修改时间
	private Timestamp modifiedTime;
	// 创建时间
	private Timestamp createTime;
	// 删除标志
	private boolean deleted;

	private Timestamp now;

	/**
	 * @return the id
	 */
	public E getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(E id) {
		this.id = id;
	}

	/**
	 * @return the modifiedTime
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * @param modifiedTime the modifiedTime to set
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	/**
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}

	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * @return the now
	 */
	public Timestamp getNow() {
		return now;
	}

	/**
	 * @param now the now to set
	 */
	public void setNow(Timestamp now) {
		this.now = now;
	}
	
	

}
