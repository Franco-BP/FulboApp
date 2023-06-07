package fulboapp.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fulboapp.model.Field;
import lombok.Data;

@Data
public class CompanyDTO implements Serializable {
	
	private static final long serialVersionUID = 4356543432156478977L;
	
	private Long id;

	private String companyName;

	private String phoneNumber;

	private String email;

	private List<FieldDTO> fieldsInCompany = new ArrayList<FieldDTO>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<FieldDTO> getFieldsInCompany() {
		return fieldsInCompany;
	}

	public void setFieldsInCompany(List<FieldDTO> fieldsInCompany) {
		this.fieldsInCompany = fieldsInCompany;
	}
}
