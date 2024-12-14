# CustomersApi

All URIs are relative to *https://dev.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomerV1**](CustomersApi.md#deleteCustomerV1) | **DELETE** /v1/customers/{customerId} | Delete Customer By ID
[**getCustomerByIdV1**](CustomersApi.md#getCustomerByIdV1) | **GET** /v1/customers/{customerId} | Get Customer By ID
[**listCustomersV1**](CustomersApi.md#listCustomersV1) | **GET** /v1/customers | List Customers
[**v1CustomersCustomerIdPut**](CustomersApi.md#v1CustomersCustomerIdPut) | **PUT** /v1/customers/{customerId} | Update Customer
[**v1CustomersPost**](CustomersApi.md#v1CustomersPost) | **POST** /v1/customers | New Customer

<a name="deleteCustomerV1"></a>
# **deleteCustomerV1**
> deleteCustomerV1(customerId)

Delete Customer By ID

Delete a customer by its Id value.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
UUID customerId = new UUID(); // UUID | Customer Id
try {
    apiInstance.deleteCustomerV1(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#deleteCustomerV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**UUID**](.md)| Customer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCustomerByIdV1"></a>
# **getCustomerByIdV1**
> Customer getCustomerByIdV1(customerId)

Get Customer By ID

Get a single **Customer** by its Id value.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
UUID customerId = new UUID(); // UUID | Customer Id
try {
    Customer result = apiInstance.getCustomerByIdV1(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerByIdV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**UUID**](.md)| Customer Id |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCustomersV1"></a>
# **listCustomersV1**
> CustomerPagedList listCustomersV1(pageNumber, pageSize)

List Customers

Get a list of customers in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
Integer pageNumber = 56; // Integer | Page Number
Integer pageSize = 56; // Integer | Page Size
try {
    CustomerPagedList result = apiInstance.listCustomersV1(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#listCustomersV1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page Number | [optional]
 **pageSize** | **Integer**| Page Size | [optional]

### Return type

[**CustomerPagedList**](CustomerPagedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1CustomersCustomerIdPut"></a>
# **v1CustomersCustomerIdPut**
> v1CustomersCustomerIdPut(body, customerId)

Update Customer

Update customer by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
Customer body = new Customer(); // Customer | 
UUID customerId = new UUID(); // UUID | Customer Id
try {
    apiInstance.v1CustomersCustomerIdPut(body, customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#v1CustomersCustomerIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |
 **customerId** | [**UUID**](.md)| Customer Id |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="v1CustomersPost"></a>
# **v1CustomersPost**
> v1CustomersPost(body)

New Customer

Create a new customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


CustomersApi apiInstance = new CustomersApi();
Customer body = new Customer(); // Customer | 
try {
    apiInstance.v1CustomersPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#v1CustomersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

