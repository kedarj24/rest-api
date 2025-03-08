package com.learn.rest_api.controller;

import com.learn.rest_api.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couldVendor")
public class CloudVendorAPIService {

    CloudVendor vendor;

    @GetMapping("/{vendorId}")
    public CloudVendor getVendorDetails(String vendorId) {

        //return new CloudVendor("C1","Vendor 1","Address One","12345");
        return vendor;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody CloudVendor vendor) {

        this.vendor = vendor;
        return "Cloud vendor created successfully";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor vendor) {

        this.vendor = vendor;
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteVendorDetails(String vendorId) {

        this.vendor = null;
        return "Cloud vendor deleted successfully";
    }
}