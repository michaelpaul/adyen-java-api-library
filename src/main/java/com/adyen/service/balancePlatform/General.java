package com.adyen.service.balancePlatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.BalancePlatform;
import com.adyen.model.balanceplatform.PaginatedAccountHoldersResponse;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.balancePlatform.BalancePlatformResource;

import java.io.IOException;
import java.util.Map;

public class General extends Service {

    public General(Client client) {
        super(client);
    }

    public BalancePlatform retrieve(String id) throws IOException, ApiException {
        BalancePlatformResource resource = new BalancePlatformResource(this, String.format("/balancePlatforms/%s", id));
        String jsonResult = resource.request(null, null, ApiConstants.HttpMethod.GET, null);
        return BalancePlatform.fromJson(jsonResult);
    }

    // need to add query parameters (with param Map? should we make a model for this)
    public PaginatedAccountHoldersResponse listAccountHolders(String id, Map<String, String> params) throws IOException, ApiException {
        BalancePlatformResource resource = new BalancePlatformResource(this, String.format("/balancePlatforms/%s/accountHolders", id));
        String jsonResult = resource.request(null, null, ApiConstants.HttpMethod.GET, params);
        return PaginatedAccountHoldersResponse.fromJson(jsonResult);
    }
}