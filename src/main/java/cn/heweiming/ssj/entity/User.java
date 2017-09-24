package cn.heweiming.ssj.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "t_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	private String password;

	private String firstName;

	private String lastName;

	private String mobile;

	private String email;

	private String imageUrl;

	private String activationKey;

	private String resetKey;

	private LocalDateTime resetDate;

	private Boolean activated;

	private String createdBy;

	private LocalDateTime createdDate;

	private String lastModifiedBy;

	private LocalDateTime lastModifiedDate;

	private String remark;

	public Long getId() {
		return id;
	}

	public User withId(Long id) {
		this.setId(id);
		return this;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public User withUsername(String username) {
		this.setUsername(username);
		return this;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public User withPassword(String password) {
		this.setPassword(password);
		return this;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public User withFirstName(String firstName) {
		this.setFirstName(firstName);
		return this;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public User withLastName(String lastName) {
		this.setLastName(lastName);
		return this;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public User withMobile(String mobile) {
		this.setMobile(mobile);
		return this;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public User withEmail(String email) {
		this.setEmail(email);
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public User withImageUrl(String imageUrl) {
		this.setImageUrl(imageUrl);
		return this;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getActivationKey() {
		return activationKey;
	}

	public User withActivationKey(String activationKey) {
		this.setActivationKey(activationKey);
		return this;
	}

	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}

	public String getResetKey() {
		return resetKey;
	}

	public User withResetKey(String resetKey) {
		this.setResetKey(resetKey);
		return this;
	}

	public void setResetKey(String resetKey) {
		this.resetKey = resetKey;
	}

	public LocalDateTime getResetDate() {
		return resetDate;
	}

	public User withResetDate(LocalDateTime resetDate) {
		this.setResetDate(resetDate);
		return this;
	}

	public void setResetDate(LocalDateTime resetDate) {
		this.resetDate = resetDate;
	}

	public Boolean getActivated() {
		return activated;
	}

	public User withActivated(Boolean activated) {
		this.setActivated(activated);
		return this;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public User withCreatedBy(String createdBy) {
		this.setCreatedBy(createdBy);
		return this;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public User withCreatedDate(LocalDateTime createdDate) {
		this.setCreatedDate(createdDate);
		return this;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public User withLastModifiedBy(String lastModifiedBy) {
		this.setLastModifiedBy(lastModifiedBy);
		return this;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public User withLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.setLastModifiedDate(lastModifiedDate);
		return this;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getRemark() {
		return remark;
	}

	public User withRemark(String remark) {
		this.setRemark(remark);
		return this;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}