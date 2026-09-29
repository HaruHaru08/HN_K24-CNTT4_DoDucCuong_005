package org.example.rentalservice.models.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.rentalservice.clients.VehicleClient;
import org.example.rentalservice.models.entities.RentalDetail;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleGatewayService {

    private final VehicleClient vehicleClient;

    public RentalDetail getVehicleById(Long vehicleId) {
        return vehicleClient.getVehicleById(vehicleId);
    }
}
