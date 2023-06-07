package fulboapp.dao;

import java.util.List;

import fulboapp.dto.CompanyDTO;
import fulboapp.dto.FieldDTO;

public interface ICompanyDAO {

	public void addCompany(CompanyDTO companyDTO);

	public void deleteCompany(CompanyDTO companyDTO);

	public void updateCompany(CompanyDTO companyDTO);

	public CompanyDTO findCompany(Long companyId);

	public List<CompanyDTO> findAll();

	public List<FieldDTO> findFields(Long companyId);
}
