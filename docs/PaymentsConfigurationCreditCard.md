
# PaymentsConfigurationCreditCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptCreditCard** | **Boolean** | Master flag indicating whether this merchant accepts credit card payments |  [optional]
**billedBy** | **String** | Description that appears on customer statements |  [optional]
**chargeDuringCheckout** | **Boolean** | If false, order will be accepted and placed into Accounts Receivable without charging card first |  [optional]
**collectCvv2** | **Boolean** | UltraCart will require customer to enter cvv if this is true |  [optional]
**configuredGatewayDetails** | **String** | Human readable description of the credit card gateway currently configured |  [optional]
**failedAttempts** | **Integer** | The number of failed attempts before the order is placed into Accounts Receivable for manual intervention |  [optional]
**hideConnectSingleGateway** | **Boolean** | This internal flag aids the UI in determining which buttons to show. |  [optional]
**sendCustomerBillingUpdateOnDecline** | **Boolean** | UltraCart will send customers emails to update their credit card if the card is declined |  [optional]
**supportedCards** | [**List&lt;PaymentsConfigurationCreditCardType&gt;**](PaymentsConfigurationCreditCardType.md) | A list of credit cards the merchant wishes to accept. |  [optional]
**testMethods** | [**List&lt;PaymentsConfigurationTestMethod&gt;**](PaymentsConfigurationTestMethod.md) | An array of test methods for placing test orders.  The cards defined here may be real or fake, but any order placed with them will be marked as Test orders |  [optional]



