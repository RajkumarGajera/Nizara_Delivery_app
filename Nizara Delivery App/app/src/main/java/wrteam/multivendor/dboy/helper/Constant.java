package wrteam.multivendor.dboy.helper;

import com.android.volley.toolbox.ImageLoader;

import java.text.DecimalFormat;

public class Constant {

    public static String BASE_URL = "https://nizara.in/admin/"; //Admin panel url

    //set your jwt secret key here...key must same in PHP and Android
    public static String JWT_KEY = "biki1626";



    public static final String BaseUrl = BASE_URL + "api-firebase/";



    public static final String FAQ_URL = BaseUrl + "get-faqs.php";
    public static final String CATEGORY_URL = BaseUrl + "get-categories.php";
    public static final String SELLER_URL = BaseUrl + "get-seller-data.php";
    public static final String GET_RAZORPAY_ORDER_URL = BaseUrl + "create-razorpay-order.php";
    public static final String SubCATEGORY_URL = BaseUrl + "get-subcategories.php";
    public static final String GET_SECTION_URL = BaseUrl + "sections.php";
    public static final String GET_ADDRESS_URL = BaseUrl + "user-addresses.php";
    public static final String REGISTER_URL = BaseUrl + "user-registration.php";
    public static final String LOGIN_URL = BaseUrl + "login.php";
    public static final String GET_ALL_DATA_URL = BaseUrl + "get-all-data.php";
    public static final String GET_PRODUCTS_URL = BaseUrl + "get-products.php";
    public static final String GET_SELLER_DATA_URL = BaseUrl + "get-seller-data.php";
    public static final String SETTING_URL = BaseUrl + "settings.php";
    public static final String GET_FAVORITES_URL = BaseUrl + "favorites.php";
    public static final String GET_LOCATIONS_URL = BaseUrl + "get-locations.php";
    public static final String ORDERPROCESS_URL = BaseUrl + "order-process.php";
    public static final String USER_DATA_URL = BaseUrl + "get-user-data.php";
    public static final String CART_URL = BaseUrl + "cart.php";
    public static final String TRANSACTION_URL = BaseUrl + "get-user-transactions.php";
    public static final String PROMO_CODE_CHECK_URL = BaseUrl + "validate-promo-code.php";
    public static final String VERIFY_PAYMENT_REQUEST = BaseUrl + "payment-request.php";
    public static final String REGISTER_DEVICE_URL = BaseUrl + "store-fcm-id.php";







    public static final String SUB_URL = "delivery-boy/";
    public static final String MAIN_URL = BASE_URL + SUB_URL + "api/api-v1.php";
    public static final String Order_URL = BASE_URL + SUB_URL + "orders.php";
    public static final String Home_URL = BASE_URL + SUB_URL + "home.php";
    public static final String DELIVERY_BOY_POLICY = BASE_URL + "delivery-boy-play-store-privacy-policy.php";
    public static final String DELIVERY_BOY_TERMS = BASE_URL + "delivery-boy-play-store-terms-conditions.php";
    public static final String AccessKey = "accesskey";
    public static final String AccessKeyVal = "90336";
    public static final String GetVal = "1";
    public static final String LOGIN = "login";
    public static final String GET_DELIVERY_BOY_BY_ID = "get_delivery_boy_by_id";
    public static final String UPDATE_DELIVERY_BOY_PROFILE = "update_delivery_boy_profile";
    public static final String BULK_STATUS_UPDATE = "bulk_status_update";
    public static final String GET_WITHDRAWAL_REQUEST = "get_withdrawal_requests";
    public static final String SEND_WITHDRAWAL_REQUEST = "send_withdrawal_request";
    public static final String TYPE = "type";
    public static final String DELIVERY_BOY = "delivery_boy";
    public static final String DELIVERY_BOY_FORGOT_PASSWORD = "delivery_boy_forgot_password";
    public static final String GET_NOTIFICATION = "get_notifications";
    public static final String CHECK_DELIVERY_BOY_BY_MOBILE = "check_delivery_boy_by_mobile";
    public static final String ID = "id";
    public static CharSequence[] filtervalues = {"Show Wallet Transactions", "Show Wallet Requests"};
    public static final String WITHDRAWAL_REQUEST = "withdrawal_requests";
    public static final String FUND_TRANSFERS = "fund_transfers";
    public static final String TYPE_ID = "type_id";
    public static final String DELIVERY_BOY_ID = "delivery_boy_id";
    public static final String GET_ORDERS = "get_orders";
    public static final String CHANGE_AVAILABILITY = "change_availability";
    public static final String IS_AVAILABLE = "is_available";
    public static final String UPDATE_DELIVERY_BOY_FCM_ID = "update_delivery_boy_fcm_id";
    public static final String ITEM_IDS = "item_ids";
    public static final String NAME = "name";
    public static final String MOBILE = "mobile";
    public static final String PASSWORD = "password";
    public static final String ADDRESS = "address";
    public static final String BONUS = "bonus";
    public static final String BALANCE = "balance";
    public static final String CURRENCY = "currency";
    public static final String UPDATED_BALANCE = "updated_balance";
    public static final String STATUS = "status";
    public static final String CREATED_AT = "date_created";
    public static final String DATA = "data";
    public static final String DATA_TYPE = "data_type";
    public static final String TOTAL = "total";
    public static final String OLD_PASSWORD = "old_password";
    public static final String UPDATE_PASSWORD = "update_password";
    public static final String CONFIRM_PASSWORD = "confirm_password";
    public static final String MESSAGE = "message";
    public static final String AMOUNT = "amount";
    public static final String FROM = "from";
    public static final String ORDER_ITEM_ID = "order_item_id";
    public static final String POSITION = "position";
    public static final String ITEM = "item";
    public static final String IS_USER_LOGIN = "IsUserLoggedIn";
    public static final String FCM_ID = "fcm_id";
    public static final String AWAITING_PAYMENT = "awaiting_payment";
    public static final String OFFSET = "offset";
    public static final String LIMIT = "limit";
    public static final String RECEIVED = "Received";
    public static final String PROCESSED = "Processed";
    public static final String SHIPPED = "Shipped";
    public static final String DELIVERED = "Delivered";
    public static final String CANCELLED = "Cancelled";
    public static final String RETURNED = "Returned";
    public static final String SHOW = "show";
    public static final String HIDE = "hide";
    public static final String ERROR = "error";
    public static final int LOAD_ITEM_LIMIT = 10;
    public static DecimalFormat formatter = new DecimalFormat("0.00");

    public static String country_code = "";
    public static String verificationCode;
    public static String PRODUCT_LOAD_LIMIT = "10";
    public static boolean CLICK = false;

}
