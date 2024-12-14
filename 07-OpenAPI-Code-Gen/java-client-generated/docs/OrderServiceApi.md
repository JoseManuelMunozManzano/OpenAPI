# OrderServiceApi

All URIs are relative to *https://dev.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CustomersCustomerIdOrdersPost**](OrderServiceApi.md#v1CustomersCustomerIdOrdersPost) | **POST** /v1/customers/{customerId}/orders | 

<a name="v1CustomersCustomerIdOrdersPost"></a>
# **v1CustomersCustomerIdOrdersPost**
> v1CustomersCustomerIdOrdersPost(customerId, body)



Place Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrderServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");


OrderServiceApi apiInstance = new OrderServiceApi();
UUID customerId = new UUID(); // UUID | Customer Id
BeerOrder body = new BeerOrder(); // BeerOrder | 
try {
    apiInstance.v1CustomersCustomerIdOrdersPost(customerId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderServiceApi#v1CustomersCustomerIdOrdersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | [**UUID**](.md)| Customer Id |
 **body** | [**BeerOrder**](BeerOrder.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)[JwtAuthToken](../README.md#JwtAuthToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

