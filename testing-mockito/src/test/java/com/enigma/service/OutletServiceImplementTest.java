package com.enigma.service;

import com.enigma.entity.Outlet;
import com.enigma.repository.OutletRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OutletServiceImplementTest {
    @Autowired
    OutletService outletService;
    @MockBean
    OutletRepository outletRepository;
    @MockBean
    AnotherService anotherService;

    @Test
    public void createNewOutlet_should_call_panggilCetak_once() {
        Outlet newOutlet = new Outlet("fgasdfasdgafsuasd76","Toko Bapak");
        outletService.saveNewOutlet(newOutlet);
        Mockito.verify(anotherService,Mockito.times(1)).panggiCetak(newOutlet.getOutletName());
    }
    @Test
    public void createNewOutlet_should_call_ouletRepository_save_once() {
        Outlet newOutlet = new Outlet("fgasdfasdgafsuasd76","Toko Bapak");
        outletService.saveNewOutlet(newOutlet);
        Mockito.verify(outletRepository,Mockito.times(1)).save(newOutlet);
    }
//    @Test
//    public void  getOutletById_should_call_ouletRepository_findById_once(){
//        Outlet newOutlet = new Outlet("fgasdfasdgafsuasd76","Toko Bapak");
//
//        outletService.getOutletById();
//    }

}