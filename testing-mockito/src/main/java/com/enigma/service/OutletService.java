package com.enigma.service;

import com.enigma.entity.Outlet;

public interface OutletService {
    void saveNewOutlet(Outlet newOutlet) ;

    void getOutletById(Integer idOutlet);
}
