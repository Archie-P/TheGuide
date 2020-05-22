package com.example.theguide;

/**
 * Location represents a location for tourists.
 * It contains resource IDs for the name, the description, the address, basic information, additional information
 * and a picture of that location.
 */
public class Location {

        /** String resource ID for the name of the location */
        private int mLocationNameId;

        /** String resource ID for the description of the location */
        private int mLocationDescriptionId;

    /** String resource ID for the address of the location */
    private int mLocationAddressId;

    /** String resource ID for the basic information of the location */
    private int mLocationBasicInformationId;

    /** String resource ID for the additional information of the location */
    private int mLocationAdditionalInformationId;

    /** Image resource ID for the image of the location */
        private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this Location */
    private static final int NO_IMAGE_PROVIDED = -1;

        /**
         * Create a new Location object.
         *
         * LocationNameId is the string resource ID for the name of the location
         * LocationDescriptionId is the string resource Id for the description of the location
         * LocationAddressId is the string resource Id for the address of the location
         * LocationBasicInformationId is the string resource Id for the basic information of the location
         * LocationAdditionalInformationId is the resource ID for the additional information of the location
         */
        public Location(int LocationNameId, int LocationDescriptionId,
                        int LocationAddressId, int LocationBasicInformationId,
                        int LocationAdditionalInformationId,
                        int imageResourceId) {
            mLocationNameId = LocationNameId;
            mLocationDescriptionId = LocationDescriptionId;
            mLocationAddressId = LocationAddressId;
            mLocationBasicInformationId = LocationBasicInformationId;
            mLocationAdditionalInformationId = LocationAdditionalInformationId;
            mImageResourceId = imageResourceId;
        }

        /**
         * Get the string resource ID for the name of the location.
         */
        public int getLocationNameId() {
            return mLocationNameId;
        }

        /**
         * Get the string resource ID for the description of the location.
         */
        public int getLocationDescriptionId() {
            return mLocationDescriptionId;
        }

    /**
     * Get the string resource ID for the address of the location.
     */
    public int getLocationAddressId() {
        return mLocationAddressId;
    }

    /**
     * Get the string resource ID for the basic information of the location.
     */
    public int getLocationBasicInformationId() { return mLocationBasicInformationId; }

    /**
     * Get the string resource ID for the additional information of the location.
     */
    public int getLocationAdditionalInformationId() { return mLocationAdditionalInformationId; }

        /**
         * Return the image resource ID of the word.
         */
        public int getImageResourceId() {
            return mImageResourceId;
        }

        /**
         * Returns whether or not there is an image for this word.
         */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }

    }

