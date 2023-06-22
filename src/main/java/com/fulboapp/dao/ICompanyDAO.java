package com.fulboapp.dao;

import java.util.List;
import com.fulboapp.dto.CompanyDTO;
import com.fulboapp.dto.FieldDTO;

public interface ICompanyDAO {

  void addCompany(CompanyDTO companyDTO);

  void deleteCompany(CompanyDTO companyDTO);

  void updateCompany(CompanyDTO companyDTO);

  CompanyDTO findCompany(Long companyId);

  List<CompanyDTO> findAll();

  List<FieldDTO> findFields(Long companyId);
}
