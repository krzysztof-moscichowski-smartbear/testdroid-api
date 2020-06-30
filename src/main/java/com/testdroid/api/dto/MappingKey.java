package com.testdroid.api.dto;

/**
 * @author Michał Szpruta <michal.szpruta@bitbar.com>
 */
public class MappingKey {

    // @formatter:off
    public static final String ACCESS_GROUP_ID = "accessGroupId";
    public static final String ACCOUNT_ID = "accountId";
    public static final String ACCOUNT_ROLE_ID = "accountRoleId";
    public static final String ACCOUNT_SERVICE_IDS = "accountServiceIds";
    public static final String ACTIVATED = "activated";
    public static final String ACTIVATED_BY_NAME = "activatedByName";
    public static final String ACTIVATE_TIME = "activateTime";
    public static final String ACTIVE = "active";
    public static final String ACTIVE_ONLY = "activeOnly";
    public static final String ADDITIONAL_HOURS = "additionalHours";
    public static final String ADDITIONAL_HOURS_PAYMENT_DATE = "additionalHoursPaymentDate";
    public static final String ADDITIONAL_HOURS_PRICE = "additionalHoursPrice";
    public static final String ADDRESS = "address";
    public static final String ADD_LABEL_TO_DEVICES = "addLabelToDevices";
    public static final String ALARM_ON = "alarmOn";
    public static final String ALWAYS_VALID = "alwaysValid";
    public static final String ANDROID_DEVICE_LIMIT = "androidDeviceLimit";
    public static final String ANDROID_ENABLED = "androidEnabled";
    public static final String ANDROID_PROJECT_LIMIT = "androidProjectLimit";
    public static final String API_KEY = "apiKey";
    public static final String API_LEVEL = "apiLevel";
    public static final String ARCHIVE_TIME = "archiveTime";
    public static final String ARCHIVING_ITEM_COUNT = "archivingItemCount";
    public static final String ARCHIVING_STRATEGY = "archivingStrategy";
    public static final String ASL_ON = "aslOn";
    public static final String ATTACHMENT = "attachment";
    public static final String AUTO_RENEW = "autoRenew";
    public static final String AVG_WAITING_TIME = "avgWaitingTime";
    public static final String BATTERY_LEVEL = "batteryLevel";
    public static final String BILLABLE = "billable";
    public static final String BLUETOOTH_ON = "bluetoothOn";
    public static final String BODY = "body";
    public static final String BRAINTREE_CLIENT_TOKEN = "braintreeClientToken";
    public static final String BRAINTREE_NONCE = "braintreeNonce";
    public static final String BUILD_ENABLED = "buildEnabled";
    public static final String BUILD_LIMIT = "buildLimit";
    public static final String CAN_RUN_FROM_UI = "canRunFromUI";
    public static final String CARD_NUMBER = "cardNumber";
    public static final String CENT_PRICE = "centPrice";
    public static final String CERT = "cert";
    public static final String CHARGE_TYPE = "chargeType";
    public static final String CITY = "city";
    public static final String CLOSE_TIME = "closeTime";
    public static final String CLUSTER_DOT_NAME = "cluster.name";
    public static final String CLUSTER_ID = "clusterId";
    public static final String CLUSTER_NAME = "clusterName";
    public static final String CODE = "code";
    public static final String COMMENT = "comment";
    public static final String COMMON = "common";
    public static final String CONFIRM_PASSWORD = "confirmPassword";
    public static final String CONTENT = "content";
    public static final String COUNT = "count";
    public static final String COUNTRY = "country";
    public static final String COUNTRY_CODE = "countryCode";
    public static final String CREATED_BY_EMAIL = "createdByEmail";
    public static final String CREATED_BY_ID = "createdById";
    public static final String CREATE_TIME = "createTime";
    public static final String CREDITS_PRICE = "creditsPrice";
    public static final String CURRENT_STEP_TYPE = "currentStepType";
    public static final String CUSTOM_PLAN = "customPlan";
    public static final String CVV = "cvv";
    public static final String DATA = "data";
    public static final String DAY = "day";
    public static final String DAYS = "days";
    public static final String DEACTIVATED_BY_NAME = "deactivatedByName";
    public static final String DEACTIVATE_REASON = "deactivateReason";
    public static final String DELETE_TIME = "deleteTime";
    public static final String DEPRECATED_RESOURCE = "deprecatedResource";
    public static final String DESCRIPTION = "description";
    public static final String DESKTOP_DEVICE_LIMIT = "desktopDeviceLimit";
    public static final String DESKTOP_ENABLED = "desktopEnabled";
    public static final String DESKTOP_PROJECT_LIMIT = "desktopProjectLimit";
    public static final String DEVICE_CLEANUP_CONFIGURATION_ID = "deviceCleanupConfigurationId";
    public static final String DEVICE_COUNT = "deviceCount";
    public static final String DEVICE_DOT_ARCHIVE_TIME = "device.archiveTime";
    public static final String DEVICE_DOT_DISPLAY_NAME = "device.displayName";
    public static final String DEVICE_DOT_ID = "device.id";
    public static final String DEVICE_ID = "deviceId";
    public static final String DEVICE_IDS_ARR = "deviceIds[]";
    public static final String DEVICE_MODEL_DOT_ID = "deviceModel.id";
    public static final String DEVICE_MODEL_ID = "deviceModelId";
    public static final String DEVICE_MODEL_NAME = "deviceModelName";
    public static final String DEVICE_NAME = "deviceName";
    public static final String DEVICE_RUN_IDS_ARR = "deviceRunIds[]";
    public static final String DEVICE_SESSION_CREATE_TIME = "deviceSession.createTime";
    public static final String DEVICE_SESSION_ID = "deviceSessionId";
    public static final String DEVICE_SESSION_USER_ID = "deviceSession.userId";
    public static final String DEVICE_TIME = "deviceTime";
    public static final String DEVICE_TIME_ZONE = "deviceTimeZone";
    public static final String DIRECTION = "direction";
    public static final String DISCRIMINATOR = "discriminator";
    public static final String DISPLAY_NAME = "displayName";
    public static final String DOCUMENTATION_URL = "documentationUrl";
    public static final String DURATION = "duration";
    public static final String EMAIL = "email";
    public static final String EMAIL_ACCOUNT = "emailAccount";
    public static final String ENABLED = "enabled";
    public static final String END_BILLING_PERIOD = "endBillingPeriod";
    public static final String END_TIME = "endTime";
    public static final String EXECUTION_RATIO = "executionRatio";
    public static final String EXPIRATION_DATE = "expirationDate";
    public static final String EXPIRE_TIME = "expireTime";
    public static final String EXTERNAL_STORAGE = "externalStorage";
    public static final String FAILED_DEVICES = "failedDevices";
    public static final String FAILED_DEVICE_SESSIONS = "failedDeviceSessions";
    public static final String FAILED_RATIO = "failedRatio";
    public static final String FAILED_TESTS = "failedTests";
    public static final String FIELD = "field";
    public static final String FILE = "file";
    public static final String FILENAME = "filename";
    public static final String FILE_TAGS_ARR = "fileTags[]";
    public static final String FINGERPRINT = "fingerprint";
    public static final String FINISH_TIME_MS = "finishTimeMS";
    public static final String FIRST_NAME = "firstName";
    public static final String FLASH_ON = "flashOn";
    public static final String FOR_WHOLE_ACCOUNT = "forWholeAccount";
    public static final String FOR_PROJECTS = "forProjects";
    public static final String FRAMEWORK_ID = "frameworkId";
    public static final String FRAMEWORK_NAME = "frameworkName";
    public static final String FRAME_EXTRA_WIDTH = "frameExtraWidth";
    public static final String FROM_TIME = "fromTime";
    public static final String GLOBAL = "global";
    public static final String GLOBAL_DEVICE_LIMIT = "globalDeviceLimit";
    public static final String GLOBAL_PROJECT_LIMIT = "globalProjectLimit";
    public static final String HANDLER_EMAIL = "handlerEmail";
    public static final String HANDLER_ID = "handlerId";
    public static final String HASH = "hash";
    public static final String HEIGHT = "height";
    public static final String HOST = "host";
    public static final String HTTP_METHOD = "httpMethod";
    public static final String ICON = "icon";
    public static final String ID = "id";
    public static final String IMAGE_HEIGHT = "imageHeight";
    public static final String IMAGE_LEFT = "imageLeft";
    public static final String IMAGE_PREFIX = "imagePrefix";
    public static final String IMAGE_TOP = "imageTop";
    public static final String IMAGE_WIDTH = "imageWidth";
    public static final String INCLUDED_HOURS = "includedHours";
    public static final String INIT_STEP = "initStep";
    public static final String INPUT_TYPE = "inputType";
    public static final String INSPECTOR_ENABLED = "inspectorEnabled";
    public static final String INTERNAL_STORAGE = "internalStorage";
    public static final String INTERNET_ACCESS = "internetAccess";
    public static final String IN_USE = "inUse";
    public static final String IOS_DEVICE_LIMIT = "iosDeviceLimit";
    public static final String IOS_ENABLED = "iosEnabled";
    public static final String IOS_PROJECT_LIMIT = "iosProjectLimit";
    public static final String IP_ADDRESS = "ipAddress";
    public static final String ISSUE_TYPE_ID = "issueTypeId";
    public static final String IS_EXCLUDED = "isExcluded";
    public static final String IS_MAIN_USER = "isMainUser";
    public static final String JOB_CONFIG_ID = "jobConfigId";
    public static final String KEY = "key";
    public static final String LABEL_GROUP_ID = "labelGroupId";
    public static final String LABEL_GROUP_NAME = "labelGroupName";
    public static final String LABEL_ID = "labelId";
    public static final String LABEL_IDS_ARR = "labelIds[]";
    public static final String LABEL_NAME = "labelName";
    public static final String LAST_LAUNCHED_TEST_TIME = "lastLaunchedTestTime";
    public static final String LAST_LOGIN_TIME = "lastLoginTime";
    public static final String LAST_MODIFICATION_TIME = "lastModificationTime";
    public static final String LAST_MODIFIED_BY = "lastModifiedBy";
    public static final String LAST_NAME = "lastName";
    public static final String LAST_PAYMENT_DATE = "lastPaymentDate";
    public static final String LAST_RETRY_TIME = "lastRetryTime";
    public static final String LAUNCH_APP_DURATION = "launchAppDuration";
    public static final String LOCALE_COUNTRY = "localeCountry";
    public static final String LOCATION_SERVICES_ON = "locationServiceOn";
    public static final String LOCKED = "locked";
    public static final String MAIL = "mail";
    public static final String MAIN_USER_EMAIL = "mainUserEmail";
    public static final String MAIN_USER_FIRST_NAME = "mainUserFirstName";
    public static final String MAIN_USER_ID = "mainUserId";
    public static final String MAIN_USER_LAST_NAME = "mainUserLastName";
    public static final String MFA_CODE = "mfaCode";
    public static final String MFA_ENABLED = "mfaEnabled";
    public static final String MIMETYPE = "mimetype";
    public static final String MOCK_LOCATION_ON = "mockLocationOn";
    public static final String MODE = "mode";
    public static final String MONITORING_ON = "monitoringOn";
    public static final String NAME = "name";
    public static final String NEW_PASSWORD = "newPassword";
    public static final String NOTIFICATION_CHANNEL = "channel";
    public static final String NOTIFICATION_CONTENT = "notificationContent";
    public static final String NOTIFICATION_DESTINATION = "destination";
    public static final String NOTIFICATION_SCOPE = "scope";
    public static final String NOTIFICATION_SUBJECT = "notificationSubject";
    public static final String NOT_ARCHIVED = "notArchived";
    public static final String ONLINE = "online";
    public static final String ONLY_MAIN_USERS = "onlyMainUsers";
    public static final String ONLY_WITH_DISABLED_SERVICES = "onlyWithDisabledServices";
    public static final String ON_DATE = "onDate";
    public static final String ORGANIZATION = "organization";
    public static final String ORIGINAL_NAME = "originalName";
    public static final String OS_TYPE = "osType";
    public static final String PAID = "paid";
    public static final String PARAMETERS = "parameters";
    public static final String PASSED_RATIO = "passedRatio";
    public static final String PASSED_TESTS = "passedTests";
    public static final String PASSWORD = "password";
    public static final String PATH = "path";
    public static final String PAYMENT_DATE = "paymentDate";
    public static final String PAYMENT_METHOD = "paymentMethod";
    public static final String PHONE = "phone";
    public static final String PLAN = "plan";
    public static final String PLUGIN_VERSION = "pluginVersion";
    public static final String PORT = "port";
    public static final String PRICE = "price";
    public static final String PRICE_PER_HOUR = "pricePerHour";
    public static final String PRIORITY = "priority";
    public static final String PRIORITY_ID = "priorityId";
    public static final String PRIVATE_INSTANCE = "privateInstance";
    public static final String PROJECT_ID = "projectId";
    public static final String PROJECT_NAME = "projectName";
    public static final String PROPERTY_GROUP_ID = "propertyGroupId";
    public static final String PROPERTY_GROUP_NAME = "propertyGroupName";
    public static final String QUANTITY = "quantity";
    public static final String QUEUE_SIZE = "queueSize";
    public static final String READ_ONLY = "readOnly";
    public static final String RECOVERY_KEY = "recoveryKey";
    public static final String RELEASE_VERSION = "releaseVersion";
    public static final String REQUIRED_APP_EXTENSIONS = "requiredAppExtensions";
    public static final String REQUIRED_TEST_EXTENSIONS = "requiredTestExtensions";
    public static final String REQUIRED_TEST_FILE_TAGS = "requiredTestFileTags";
    public static final String RESOURCE_ID = "resourceId";
    public static final String RESULT = "result";
    public static final String RETRYABLE = "retryable";
    public static final String RETRY_STATE = "retryState";
    public static final String ROLE_ID = "roleId";
    public static final String ROLE_IDS_ARR = "roleIds[]";
    public static final String RUNNING = "running";
    public static final String SAMPLE_APP_ID = "sampleAppId";
    public static final String SAMPLE_TEST_ID = "sampleTestId";
    public static final String SCOPE = "scope";
    public static final String SCREEN_LOCKED = "screenLocked";
    public static final String SDCARD_PRESENT = "sdcardPresent";
    public static final String SECURED = "secured";
    public static final String SELECTOR_ID = "selectorId";
    public static final String SELECTOR_IDS_ARR = "selectorIds[]";
    public static final String SENT = "sent";
    public static final String SENT_TIME = "sentTime";
    public static final String SERIAL_ID = "serialId";
    public static final String SERVICE_ID = "serviceId";
    public static final String SERVICE_IDS = "serviceIds";
    public static final String SERVICE_NAME = "serviceName";
    public static final String SERVICE_PRICE = "servicePrice";
    public static final String SHARED_BY_EMAIL = "sharedByEmail";
    public static final String SHOW_STATISTICS = "showStatistics";
    public static final String SIZE = "size";
    public static final String SKIP_COMMON_PROJECT = "skipCommonProject";
    public static final String SKIP_OLDER_SDK = "skipOlderSdk";
    public static final String SKIP_QUEUE = "skipQueue";
    public static final String SKIP_SHARED = "skipShared";
    public static final String SSID = "ssid";
    public static final String STARTED_BY_DISPLAY_NAME = "startedByDisplayName";
    public static final String START_BILLING_PERIOD = "startBillingPeriod";
    public static final String START_TIME = "startTime";
    public static final String START_TIME_MS = "startTimeMS";
    public static final String STATE = "state";
    public static final String STATE_CHANGE_TIME = "stateChangeTime";
    public static final String STATE_TIME = "stateTime";
    public static final String STATUS = "status";
    public static final String STRIPE_TOKEN = "stripeToken";
    public static final String SUBJECT = "subject";
    public static final String SUBSCRIPTION_END = "subscriptionEnd";
    public static final String SUBSCRIPTION_START = "subscriptionStart";
    public static final String SUCCESS_RATIO = "successRatio";
    public static final String SUMMARY = "summary";
    public static final String TAG = "tag";
    public static final String TAG_ARR = "tag[]";
    public static final String TAKE_TIMESTAMP = "takeTimestamp";
    public static final String TDS_VERSION = "tdsVersion";
    public static final String TEST_EXECUTING = "testExecuting";
    public static final String TEST_RUN_ID = "testRunId";
    public static final String TEST_RUN_NAME = "testRunName";
    public static final String TETHERING_ON = "tetheringOn";
    public static final String TIMESTAMP = "timestamp";
    public static final String TIME_LIMIT = "timeLimit";
    public static final String TIME_ZONE = "timeZone";
    public static final String TOTAL = "total";
    public static final String TOTAL_DEVICE_SESSIONS = "totalDeviceSessions";
    public static final String TOTAL_PRICE = "totalPrice";
    public static final String TOTAL_TESTS = "totalTests";
    public static final String TO_TIME = "toTime";
    public static final String TYPE = "type";
    public static final String TYPE_ID = "typeId";
    public static final String UNIT = "unit";
    public static final String UNIT_COUNT = "unitCount";
    public static final String UNLOCK_GESTURE = "unlockGesture";
    public static final String UPDATED_BY_DISPLAY_NAME = "updatedByDisplayName";
    public static final String UPDATED_BY_ID = "updatedById";
    public static final String UPDATE_TIME = "updateTime";
    public static final String URI = "uri";
    public static final String URL = "url";
    public static final String URL_SCHEMA = "urlSchema";
    public static final String USAGE_COUNT = "usageCount";
    public static final String USAGE_MILLIS = "usageMillis";
    public static final String USERNAME = "username";
    public static final String USER_AGENT = "userAgent";
    public static final String USER_DOT_ID = "user.id";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_ID = "userId";
    public static final String USER_NAME = "userName";
    public static final String VALUE = "value";
    public static final String VAT_ID = "vatId";
    public static final String VAT_RATE = "vatRate";
    public static final String VERSION = "version";
    public static final String VIDEO_RECORDING_ENABLED = "videoRecordingEnabled";
    public static final String WIDTH = "width";
    public static final String WITHOUT_PRIORITIES = "withoutPriorities";
    public static final String WITH_DEDICATED = "withDedicated";
    public static final String WITH_DEVICES = "withDevices";
    public static final String WITH_DISABLED = "withDisabled";
    public static final String WITH_PROPERTIES = "withProperties";
    public static final String WITH_PUBLIC = "withPublic";
    public static final String WITH_ROLE = "withRole";
    public static final String WITH_ROLES = "withRoles";
    public static final String WITH_SUPPORTED_CREATORS = "withSupportedCreators";
    public static final String WITH_VULNERABLE_DATA = "withVulnerableData";
    public static final String ZIP = "zip";

    // @formatter:on

}
