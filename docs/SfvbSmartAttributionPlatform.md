

# SfvbSmartAttributionPlatform


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assistPercent** | **BigDecimal** | This platform&#39;s assist credit, 0 to 1.  Used only when platform_type_override is true. |  [optional] |
|**closerPercent** | **BigDecimal** | This platform&#39;s closer credit, 0 to 1.  Used only when platform_type_override is true. |  [optional] |
|**fireOnRebill** | **Boolean** | True when the platform also reports auto order rebills.  On a write, when left out, true for paid and owned and false for the affiliate types. |  [optional] |
|**integrationId** | **Integer** | The integration&#39;s id, such as an affiliate network pixel&#39;s oid.  Null for a platform matched by name.  On a write it must be an id from platforms or available_platforms. |  [optional] |
|**integrationName** | **String** | The platform, as Smart Attribution names it, up to 50 characters. |  [optional] |
|**nonParticipantPercent** | **BigDecimal** | The credit this platform reports for an order it took no part in, 0 to 1.  0 when left out. |  [optional] |
|**originatorPercent** | **BigDecimal** | This platform&#39;s originator credit, 0 to 1.  Used only when platform_type_override is true. |  [optional] |
|**platformType** | **String** | paid, owned, external affiliate, affiliate network pixel, or excluded. |  [optional] |
|**platformTypeOverride** | **Boolean** | True when this platform uses its own originator, assist and closer split instead of the global one.  On a write, when left out, true if all three of its percentages are sent. |  [optional] |



