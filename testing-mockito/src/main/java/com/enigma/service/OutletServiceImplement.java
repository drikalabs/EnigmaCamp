package com.enigma.service;

import com.enigma.entity.Outlet;
import com.enigma.repository.OutletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutletServiceImplement implements OutletService {
    @Autowired
    OutletRepository outletRepository;
    @Autowired
    AnotherService anotherService;

    @Override
    public void saveNewOutlet(Outlet newOutlet) {
        anotherService.panggiCetak(newOutlet.getOutletName());
        outletRepository.save(newOutlet);
    }

    @Override
    public void getOutletById(Integer idOutlet) {
        outletRepository.findById(idOutlet).get();
    }
}
