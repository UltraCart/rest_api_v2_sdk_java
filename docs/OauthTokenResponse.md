

# OauthTokenResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | Access token to use in OAuth authenticated API call |  [optional] |
|**error** | **String** |  |  [optional] |
|**errorCode** | **String** | With error access_denied, a machine readable reason.  sfvb.beta_access_required means the account isn&#39;t enabled for the StoreFront CLI beta, not that a person clicked Deny. |  [optional] |
|**errorDescription** | **String** |  |  [optional] |
|**errorUri** | **String** |  |  [optional] |
|**expiresIn** | **String** | The number of seconds since issuance when the access token will expire and need to be refreshed using the refresh token |  [optional] |
|**merchantId** | **String** | The UltraCart merchant account that authorized this token.  Use it to map the token to the merchant within your own system.  Also returned by GET /oauth/me along with the account name. |  [optional] |
|**objectId** | **String** | With error_code sfvb.beta_access_required, the merchant id that was refused. |  [optional] |
|**refreshToken** | **String** | The refresh token that should be used to fetch a new access token when the expiration occurs |  [optional] |
|**refreshTokenExpiresIn** | **String** | Seconds until the refresh token expires.  Returned only by applications that rotate refresh tokens, which return a new refresh token on every refresh. |  [optional] |
|**scope** | **String** | The scope of permissions associated with teh access token |  [optional] |
|**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Type of token |  [optional] |



## Enum: TokenTypeEnum

| Name | Value |
|---- | -----|
| BEARER | &quot;bearer&quot; |



