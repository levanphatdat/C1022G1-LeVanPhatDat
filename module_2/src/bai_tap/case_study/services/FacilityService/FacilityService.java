package bai_tap.case_study.services.FacilityService;

import bai_tap.case_study.repository.Facility.FacilityRepository;
import bai_tap.case_study.repository.Facility.IFacilityRepository;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository=new FacilityRepository();
    @Override
    public void display() {
        iFacilityRepository.display();
    }
}
