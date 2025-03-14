package com.learn.rest_api.controller;

import com.learn.rest_api.model.CloudVendor;
import com.learn.rest_api.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couldVendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    @GetMapping("/{vendorId}")
    public CloudVendor getVendorDetails(@PathVariable("vendorId") String vendorId) {

        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllVendorDetails() {

        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createVendorDetails(@RequestBody CloudVendor vendor) {

        cloudVendorService.createCloudVendor(vendor);
        return "Cloud vendor created successfully";
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor vendor) {

        cloudVendorService.updateCloudVendor(vendor);
        return "Cloud vendor updated successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteVendorDetails(@PathVariable("vendorId") String vendorId) {

        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted successfully";
    }
}