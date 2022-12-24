package com.extrawest.ocpp.emulator.chargepoint.cli.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@RequiredArgsConstructor
public class ChargePointsEmulationParameters {

    @NotBlank
    private final String centralSystemUrl;

    @Min(1)
    private final int chargePointsCount;
    private final int logsRange;
}
