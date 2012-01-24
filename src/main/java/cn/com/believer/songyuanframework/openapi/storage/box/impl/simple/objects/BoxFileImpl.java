/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.objects;

import cn.com.believer.songyuanframework.openapi.storage.box.objects.BoxFile;

/**
 * @author Jimmy
 * 
 */
public class BoxFileImpl extends BoxAbstractFileImpl implements BoxFile {

	/**
     * 
     */
	private static final long serialVersionUID = -7282178963330936208L;

	/** shared name. */
	private String sharedName;

	/** file description. */
	private String description;

	/** sha1 value, used to verify file content. */
	private String sha1;

	/** user id of the one who created this file. */
	private String createdBy;

	/** user id of the one who updated this file. */
	private String updatedBy;

	/**
	 * @return the fileId
	 */
	public String getFileId() {
		return getId();
	}

	/**
	 * @param fileId the fileId to set
	 */
	public void setFileId(String fileId) {
		setId(fileId);
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return getName();
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		setName(fileName);
	}

	/**
	 * @return the folderId
	 */
	public String getFolderId() {
		return getParentId();
	}

	/**
	 * @param folderId the folderId to set
	 */
	public void setFolderId(String folderId) {
		setParentId(folderId);
	}

	/**
	 * @return the sharedName
	 */
	public String getSharedName() {
		return this.sharedName;
	}

	/**
	 * @param sharedName the sharedName to set
	 */
	public void setSharedName(String sharedName) {
		this.sharedName = sharedName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the sha1
	 */
	public String getSha1() {
		return this.sha1;
	}

	/**
	 * @param sha1 the sha1 to set
	 */
	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public boolean isFolder() {
		return false;
	}

	@Override
	public void setFolder(boolean isFolder) {
		setFolder(false);
	}

}
