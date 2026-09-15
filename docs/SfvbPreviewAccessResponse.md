

# SfvbPreviewAccessResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessUrl** | **String** | One time link on the storefront&#39;s own host.  Opening it in any browser, including an agent&#39;s built in browser with no UltraCart login, gets past the storefront lock and applies the preview session and theme for the rest of that browser&#39;s session, then redirects to path.  It is a credential until used, so do not paste it anywhere other than the browser that should open it. |  [optional] |
|**expiresInSeconds** | **Integer** | Seconds left to open access_url.  It stops working after that, and after its first use. |  [optional] |
|**path** | **String** | Storefront path the browser lands on, after reserved preview parameters are removed. |  [optional] |
|**previewSessionId** | **String** | The preview session applied, when one was requested. |  [optional] |
|**sessionLifetimeSeconds** | **Integer** | How long the browser stays in preview once access_url is opened.  The remaining life of the preview session, or eight hours when none was given.  The user and their storefront permission are checked again on every page, so removing either ends it sooner. |  [optional] |
|**singleUse** | **Boolean** | Always true.  A second open of access_url returns 410. |  [optional] |
|**themeOid** | **Integer** | The theme shown, when one was requested. |  [optional] |
|**usageNote** | **String** | Plain language instructions, safe to show a user. |  [optional] |



