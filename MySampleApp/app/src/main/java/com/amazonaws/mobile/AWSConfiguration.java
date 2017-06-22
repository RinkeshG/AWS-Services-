//
// Copyright 2017 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.18
//
package com.amazonaws.mobile;

import android.graphics.Color;

import com.amazonaws.mobilehelper.config.AWSMobileHelperConfiguration;
import com.amazonaws.regions.Regions;
import com.mysampleapp.R;

/**
 * This class defines constants for the developer's resource
 * identifiers and API keys. This configuration should not
 * be shared or posted to any public source code repository.
 */
public class AWSConfiguration {
    // AWS MobileHub user agent string
    public static final String AWS_MOBILEHUB_USER_AGENT =
        "MobileHub bb1789e8-0365-4b1c-8bfc-3447341338ee aws-my-sample-app-android-v0.18";
    // AMAZON COGNITO
    public static final Regions AMAZON_COGNITO_REGION =
      Regions.fromName("ap-northeast-1");
    public static final String  AMAZON_COGNITO_IDENTITY_POOL_ID =
        "ap-northeast-1:d620ee84-eb63-499d-8145-6dfbebbfcbc1";
    public static final String AMAZON_COGNITO_USER_POOL_ID =
        "ap-northeast-1_phhb9nM1A";
    public static final String AMAZON_COGNITO_USER_POOL_CLIENT_ID =
        "5oa96o5lflaaq5eleimu2cstep";
    public static final String AMAZON_COGNITO_USER_POOL_CLIENT_SECRET =
        "1tsf5dliiv6h0i87c8e777v9g4093eoughe87lebqa7nujt4bcph";

    private static final AWSMobileHelperConfiguration helperConfiguration = new AWSMobileHelperConfiguration.Builder()
        .withCognitoRegion(AMAZON_COGNITO_REGION)
        .withCognitoIdentityPoolId(AMAZON_COGNITO_IDENTITY_POOL_ID)
        .withCognitoUserPool(AMAZON_COGNITO_USER_POOL_ID,
            AMAZON_COGNITO_USER_POOL_CLIENT_ID, AMAZON_COGNITO_USER_POOL_CLIENT_SECRET)
        .build();
    /**
     * @return the configuration for AWSKit.
     */
    public static AWSMobileHelperConfiguration getAWSMobileHelperConfiguration() {
        return helperConfiguration;
    }
}
