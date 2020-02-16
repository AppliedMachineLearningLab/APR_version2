public int getMaxNumBlacklistBssid() {
        if (mFirmwareRoamingSupported) {
            return mMaxNumBlacklistBssid;
        } else {
            Log.e(TAG, "Firmware roaming is not supported");
            return -1;
        }
    }