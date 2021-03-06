package com.etiya.recapProject.business.abstracts;

import java.util.List;

import com.etiya.recapProject.core.utilities.results.DataResult;
import com.etiya.recapProject.core.utilities.results.Result;
import com.etiya.recapProject.entities.dtos.AdditionalServiceDto;
import com.etiya.recapProject.entities.requests.additionalServiceRequest.CreateAdditionalServiceRequest;
import com.etiya.recapProject.entities.requests.additionalServiceRequest.DeleteAdditionalServiceRequest;
import com.etiya.recapProject.entities.requests.additionalServiceRequest.UpdateAdditionalServiceRequest;

public interface AdditionalServiceService {
	Result add(CreateAdditionalServiceRequest createAdditionalServiceRequest);

	Result update(UpdateAdditionalServiceRequest updateAdditionalServiceRequest);

	Result delete(DeleteAdditionalServiceRequest deleteAdditionalServiceRequest);

	DataResult<List<AdditionalServiceDto>> getAll();

	DataResult<AdditionalServiceDto> findById(int id);
	
	DataResult<List<AdditionalServiceDto>> findByRentals_Id(int rentalId);
}
