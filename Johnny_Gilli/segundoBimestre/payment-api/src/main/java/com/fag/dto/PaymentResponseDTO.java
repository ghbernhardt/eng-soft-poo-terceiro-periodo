package com.fag.dto;

import java.math.BigDecimal;

public class PaymentResponseDTO {

    private String convenant;

    private boolean isExpired;

    private BigDecimal authentication;

    private PaymentAuthDTO authenticationAPI;

    private ReceiptDTO receipt;

    private String settleDate;

    private String createDate;

    private BigDecimal transactionId;

    private String urlreceipt;

    private String errorCode;

    private String message;

    private String status;
		//GERAR GETTERS E SETTERS
}
