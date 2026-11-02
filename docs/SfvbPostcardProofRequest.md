

# SfvbPostcardProofRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address1** | **String** | The recipient street address.  Without address1, city, state and postal_code, a sample address is used. |  [optional] |
|**address2** | **String** | The recipient second address line. |  [optional] |
|**cartItemIds** | **List&lt;String&gt;** | Item ids for the cart a cart flow card renders with.  The cart is made for the proof and deleted after it. |  [optional] |
|**city** | **String** | The recipient city. |  [optional] |
|**customerName** | **String** | The recipient name the card greets and is addressed to.  Defaults to the signed in user. |  [optional] |
|**htmlOnly** | **Boolean** | True to return only the rendered HTML of both sides, with no print vendor render.  The default, false, also returns the images that would print and the vendor proof PDF. |  [optional] |
|**orderId** | **String** | A test order for an order flow card.  Real orders are refused.  Without one, an order flow card renders with a made up order. |  [optional] |
|**postalCode** | **String** | The recipient postal code. |  [optional] |
|**state** | **String** | The recipient state. |  [optional] |



