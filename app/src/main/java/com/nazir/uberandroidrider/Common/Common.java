package com.nazir.uberandroidrider.Common;

import com.nazir.uberandroidrider.Remote.FCMClient;
import com.nazir.uberandroidrider.Remote.IFCService;

public class Common {

    public static final String DRIVER_TBL = "Drivers";
    public static final String DRIVER_INFO_TBL = "DriverInformation";
    public static final String RIDERS_INFO_TBL = "RidersInformation";
    public static final String PICKUP_REQUEST_TBL = "PickupRequest";

    public static final String baseURL = "https://maps.googleapi.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";
    public static final String TOKEN_TBL = "Token";


    public static IFCService getFCMService(){

        return FCMClient.getClient(fcmURL).create(IFCService.class);
    }

}
