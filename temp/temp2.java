public int getMaxNumBlacklistBssid() {
        if (mFirmwareRoamingSupported) {
            return mMaxNumBlacklistBssid;
        } else {
            Log.e(TAG, "getMaxNumBlacklistBssid: Firmware roaming is not supported");
            return INVALID_LIST_SIZE;
       }
    }