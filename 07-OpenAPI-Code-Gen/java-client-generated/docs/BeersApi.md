# BeersApi

All URIs are relative to *https://dev.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBeerV1**](BeersApi.md#deleteBeerV1) | **DELETE** /v1/beers/{beerId} | Delete Beer by Id
[**getBeerByIdV1**](BeersApi.md#getBeerByIdV1) | **GET** /v1/beers/{beerId} | Get Beer by ID
[**listBeersV1**](BeersApi.md#listBeersV1) | **GET** /v1/beers | List Beers
[**updateBeerByIdV1**](BeersApi.md#updateBeerByIdV1) | **PUT** /v1/beers/{beerId} | Update Beer by ID
[**v1BeersPost**](BeersApi.md#v1BeersPost) | **POST** /v1/beers | New Beer

<a name="deleteBeerV1"></a>
# **deleteBeerV1**
> deleteBeerV1(beerId)

Delete Beer by Id

Delete a beer resource by its ID value.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


BeersApi apiInstance = new BeersApi();
UUID beerId = new UUID(); // UUID | Beer Id
try {
    apiInstance.deleteBeerV1(beerId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeersApi#deleteBeerV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerId** | [**UUID**](.md)| Beer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBeerByIdV1"></a>
# **getBeerByIdV1**
> Beer getBeerByIdV1(beerId)

Get Beer by ID

Get a single beer by its ID value.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


BeersApi apiInstance = new BeersApi();
UUID beerId = new UUID(); // UUID | Beer Id
try {
    Beer result = apiInstance.getBeerByIdV1(beerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeersApi#getBeerByIdV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerId** | [**UUID**](.md)| Beer Id |

### Return type

[**Beer**](Beer.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBeersV1"></a>
# **listBeersV1**
> BeerPagedList listBeersV1(pageNumber, pageSize)

List Beers

List all beers in system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


BeersApi apiInstance = new BeersApi();
Integer pageNumber = 56; // Integer | Page Number
Integer pageSize = 56; // Integer | Page Size
try {
    BeerPagedList result = apiInstance.listBeersV1(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BeersApi#listBeersV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page Number | [optional]
 **pageSize** | **Integer**| Page Size | [optional]

### Return type

[**BeerPagedList**](BeerPagedList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBeerByIdV1"></a>
# **updateBeerByIdV1**
> updateBeerByIdV1(body, beerId)

Update Beer by ID

Update a beer by its ID value.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


BeersApi apiInstance = new BeersApi();
Beer body = new Beer(); // Beer | 
UUID beerId = new UUID(); // UUID | Beer Id
try {
    apiInstance.updateBeerByIdV1(body, beerId);
} catch (ApiException e) {
    System.err.println("Exception when calling BeersApi#updateBeerByIdV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Beer**](Beer.md)|  |
 **beerId** | [**UUID**](.md)| Beer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="v1BeersPost"></a>
# **v1BeersPost**
> v1BeersPost(body)

New Beer

Create a new Beer Object

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BeersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


BeersApi apiInstance = new BeersApi();
Beer body = new Beer(); // Beer | 
try {
    apiInstance.v1BeersPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BeersApi#v1BeersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Beer**](Beer.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

