package com.cav.m_tiba;

/**
 * Created by wasike on 29/09/17.
 */

public class Constants {
    public static final String MTIBA_TOKEN = BuildConfig.MTIBA_TOKEN;
    public static final String BASE_URL = "http://usermanagement-test.ap-southeast-1.elasticbeanstalk.com";
    public static final String PROGRAM_BASE_URL = "http://program-service-test.ap-southeast-1.elasticbeanstalk.com/accountholders/user/";
    public static final String MTIBA_BASE_URL = "http://provider-service-test.ap-southeast-1.elasticbeanstalk.com/providers";
    public static final String MTIBA_QUERY_PARAMETER = "q";
    public static final String MTIBA_TILL_KEY = "till";

    //paths to endpoints
    public static final String MTIBA_LOGIN = "login";
    public static final String MTIBA_CREATE_PASSWORD = "changepassword";

    public static final String MTIBA_CHECK_USER = "users/phonenumbers/";

    //JSON information
    public static final String MTIBA_PASSWORD = "password";
    public static final String MTIBA_NEW_PASSWORD = "newPassword";
    public static final String MTIBA_USERNAME_KEY = "username";
}
