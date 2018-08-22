package com.payneteasy.dapi.acknowledge.check.request;

/**
 * Class is uses for security purposes and allows PaynetEasy to compare the data sent by Merchant’s app
 * with the data stored on Merchant’s server through check-verification operations. PayneEasy sends HTTP request
 * to Merchant's acknowledge server with this structure.
 */
public class CheckVerificationRequest extends AbstractCheckRequest {
}
