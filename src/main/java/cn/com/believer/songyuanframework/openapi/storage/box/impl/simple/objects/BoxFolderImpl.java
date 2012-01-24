/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.objects;

import cn.com.believer.songyuanframework.openapi.storage.box.objects.BoxFolder;

/**
 * @author Jimmy
 * 
 */
public class BoxFolderImpl extends BoxAbstractFileImpl implements BoxFolder {

	/**
     * 
     */
	private static final long serialVersionUID = -3688421474186239469L;

	/** folder type id. */
	private String folderTypeId;

	/** user id. */
	private String userId;

	/** path. */
	private String path;

	/** folder share flag. */
	private String shared;

	/** public name. */
	private String publicName;

	/** show comments. */
	private String showComments;

	/** password to access this folder. */
	private String password;

	/** checksum. */
	private String checksum;

	/** if have collaborators. */
	private String hasCollaborators;

	/**
	 * @return the folderId
	 */
	public String getFolderId() {
		return getId();
	}

	/**
	 * @param folderId the folderId to set
	 */
	public void setFolderId(String folderId) {
		setId(folderId);
	}

	/**
	 * @return the folderName
	 */
	public String getFolderName() {
		return getName();
	}

	/**
	 * @param folderName the folderName to set
	 */
	public void setFolderName(String folderName) {
		setName(folderName);
	}

	/**
	 * @return the folderTypeId
	 */
	public String getFolderTypeId() {
		return this.folderTypeId;
	}

	/**
	 * @param folderTypeId the folderTypeId to set
	 */
	public void setFolderTypeId(String folderTypeId) {
		this.folderTypeId = folderTypeId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return this.path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the shared
	 */
	public String getShared() {
		return this.shared;
	}

	/**
	 * @param shared the shared to set
	 */
	public void setShared(String shared) {
		this.shared = shared;
	}

	/**
	 * @return the publicName
	 */
	public String getPublicName() {
		return this.publicName;
	}

	/**
	 * @param publicName the publicName to set
	 */
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	/**
	 * @return the showComments
	 */
	public String getShowComments() {
		return this.showComments;
	}

	/**
	 * @param showComments the showComments to set
	 */
	public void setShowComments(String showComments) {
		this.showComments = showComments;
	}

	/**
	 * @return the parentFolderId
	 */
	public String getParentFolderId() {
		return getParentId();
	}

	/**
	 * @param parentFolderId the parentFolderId to set
	 */
	public void setParentFolderId(String parentFolderId) {
		setParentId(parentFolderId);
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the checksum
	 */
	public String getChecksum() {
		return this.checksum;
	}

	/**
	 * @param checksum the checksum to set
	 */
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	/**
	 * @return the hasCollaborators
	 */
	public String getHasCollaborators() {
		return this.hasCollaborators;
	}

	/**
	 * @param hasCollaborators the hasCollaborators to set
	 */
	public void setHasCollaborators(String hasCollaborators) {
		this.hasCollaborators = hasCollaborators;
	}

	@Override
	public boolean isFolder() {
		return true;
	}

	@Override
	public void setFolder(boolean isFolder) {
		setFolder(true);
	}

}
