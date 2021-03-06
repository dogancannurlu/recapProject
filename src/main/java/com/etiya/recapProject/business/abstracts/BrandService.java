package com.etiya.recapProject.business.abstracts;

import java.util.List;

import com.etiya.recapProject.core.utilities.results.DataResult;
import com.etiya.recapProject.core.utilities.results.Result;
import com.etiya.recapProject.entities.dtos.BrandDto;
import com.etiya.recapProject.entities.requests.brandRequest.CreateBrandRequest;
import com.etiya.recapProject.entities.requests.brandRequest.DeleteBrandRequest;
import com.etiya.recapProject.entities.requests.brandRequest.UpdateBrandRequest;

public interface BrandService {
	Result add(CreateBrandRequest createBrandRequest);

	Result update(UpdateBrandRequest updateBrandRequest);

	Result delete(DeleteBrandRequest deleteBrandRequest);

	DataResult<List<BrandDto>> getAll();

	DataResult<BrandDto> findById(int id);
	
}
