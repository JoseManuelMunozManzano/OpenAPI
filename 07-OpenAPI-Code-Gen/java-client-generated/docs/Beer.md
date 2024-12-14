# Beer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**beerName** | **String** |  |  [optional]
**style** | [**StyleEnum**](#StyleEnum) |  |  [optional]
**price** | **Float** |  |  [optional]
**quantityOnHand** | **Integer** |  |  [optional]
**brewery** | [**Brewery**](Brewery.md) |  |  [optional]

<a name="StyleEnum"></a>
## Enum: StyleEnum
Name | Value
---- | -----
ALE | &quot;ALE&quot;
PALE_ALE | &quot;PALE_ALE&quot;
IPA | &quot;IPA&quot;
WHEAT | &quot;WHEAT&quot;
LAGER | &quot;LAGER&quot;
