package misc;

public class StringCheck {

    public static void main(String[] args) {
        String req = "{\"status\":\"OK\",\"header\":{\"headerAttributes\":{\"Response-Time\":22,\"Date\":\"Thu, 08 Aug 2019 18:15:16 UTC\"}},\"payload\":[{\"offerId\":{\"offerId\":\"6B20B909CD224EF5B89B26B8D488DCC8\",\"wupc\":\"0004300004520\",\"legacySellerId\":\"10D2E6BEB0F84585BF5E7BFF5332EE60\",\"sellerId\":\"10D2E6BEB0F84585BF5E7BFF5332EE60\",\"sellerType\":\"EXTERNAL\"},\"logisticsOffer\":{\"createdBy\":\"limo\",\"createdAt\":\"2016-03-28T00:12:22.953+00:00\",\"modifiedBy\":\"limo\",\"modifiedAt\":\"2019-07-10T01:16:46.643+00:00\",\"logisticsOfferId\":{\"offerId\":\"6B20B909CD224EF5B89B26B8D488DCC8\",\"upc\":\"845251064155\",\"wupc\":\"0084525106415\",\"gtin\":\"00845251064155\",\"legacyItemId\":\"116342607\",\"legacySellerId\":\"149\",\"sellerId\":\"10D2E6BEB0F84585BF5E7BFF5332EE60\",\"offerUUID\":\"6b20b909-cd22-4ef5-b89b-26b8d488dcc8\",\"offerType\":\"ONLINE_ONLY\"},\"flagAttributes\":{},\"primarySupplyItemId\":\"E9SNILCE7B\",\"marketAttributes\":[{\"attributeName\":\"item_class_id\",\"values\":[\"1\"],\"type\":\"STRING\"},{\"attributeName\":\"rh_path\",\"values\":[\"20000:21000:21004:21121:21331\"],\"type\":\"STRING\"},{\"attributeName\":\"reporting_hierarchy\",\"values\":[\"POINT AND SHOOT CAMERAS\"],\"type\":\"STRING\"},{\"attributeName\":\"reporting_hierarchy_id\",\"values\":[\"21331\"],\"type\":\"STRING\"},{\"attributeName\":\"path_str\",\"values\":[\"[\\\"ENTERTAINMENT\\\",\\\"ELECTRONICS\\\",\\\"WIRELESS AND CAMERAS\\\",\\\"CAMERAS AND CAMCORDERS AND LENSES\\\",\\\"POINT AND SHOOT CAMERAS\\\"]\"],\"type\":\"STRING\"},{\"attributeName\":\"display_status\",\"values\":[\"STAGING\"],\"type\":\"STRING\"},{\"attributeName\":\"product_type\",\"values\":[\"Digital Cameras\"],\"type\":\"STRING\"}],\"productPackageDimensions\":[{\"packageId\":1,\"unitWeight\":{\"unitOfMeasure\":\"LB\",\"measurementValue\":14.74}}],\"programEligibilities\":[{\"eligibilityName\":\"S2H\",\"eligibilityValue\":true,\"eligibilityValueOverridable\":{\"isOverridden\":false,\"overriddenValue\":false,\"computedValue\":true},\"availabilityThreshold\":{\"low\":0,\"mid\":0,\"high\":0}}],\"offerShipmentSpecification\":{\"shipSizeCodeOverridable\":{\"isOverridden\":false},\"shipAsIs\":false,\"shippingSlaAttributes\":{\"geoItemClassification\":\"ALWAYS_TWO_DAY\",\"slaTier\":\"TWO_DAY\",\"reasonCode\":\"MP_TWO_DAY\"},\"shipping\":[{\"geoItemClassification\":\"ALWAYS_TWO_DAY\",\"slaTier\":\"TWO_DAY\",\"reasonCode\":\"MP_TWO_DAY\"}],\"geoItemClassification\":\"ALWAYS_TWO_DAY\"},\"preOrderInfo\":{\"streetDate\":null,\"isPreOrder\":false,\"streetDateDisplayable\":null,\"streetDateType\":null,\"preOrderInfoOverridable\":null},\"offerFulfillment\":{\"itemType\":0}},\"fulfillmentOffer\":{\"fulfillmentEligibilities\":[{\"storeFrontId\":{\"storeId\":\"0\",\"onlineStoreFront\":true,\"storeUUID\":\"F2AC45A479F04796A584DD9FCE751842\"},\"zipCode\":\"94588\",\"fulfillmentOptions\":[{\"fulfillmentOption\":\"S2H\",\"availability\":{\"status\":\"NOT_AVAILABLE\",\"quantity\":0.0},\"shipping\":[{\"shipMethod\":[\"VALUE\",\"STANDARD\",\"EXPEDITED\",\"ONE_DAY\"],\"availability\":{\"status\":\"NOT_AVAILABLE\",\"quantity\":0.0}}],\"eligible\":\"true\"}]}],\"pickupDiscountEligibility\":false,\"sourcePickupDiscountEligibility\":false}}]}";
        System.out.println(req.contains("\"slaTier\":\"TWO_DAY\""));
    }
}