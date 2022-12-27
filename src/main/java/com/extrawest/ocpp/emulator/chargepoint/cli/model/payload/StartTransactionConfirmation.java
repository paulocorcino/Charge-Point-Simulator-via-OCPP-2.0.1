package com.extrawest.ocpp.emulator.chargepoint.cli.model.payload;

import com.extrawest.ocpp.emulator.chargepoint.cli.model.IdTagInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@JsonCreator))
@Getter
public class StartTransactionConfirmation {

    @JsonProperty("idTagInfo")
    private final IdTagInfo idTagInfo;

    @JsonProperty("transactionId")
    private final int transactionId;
}