package com.testdroid.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testdroid.api.APIEntity;

/**
 * @author Michał Szpruta <michal.szpruta@bitbar.com>
 */
public class APIScreenshotExtended extends APIScreenshot {

    private APIDevice device;

    private Long projectId;

    private Long testRunId;

    private Long deviceRunId;

    public APIScreenshotExtended() {
    }

    public APIScreenshotExtended(
            Long id, String name, Boolean fail, Type type, Long timestamp, Long deviceModelId, String displayName,
            String manufacturer, Integer creditsPrice, String imagePrefix, Integer imageTop, Integer imageLeft,
            Integer imageWidth, Integer imageHeight, Integer frameExtraWidth, APIDevice.OsType osType,
            APIDevice.Platform platform, String releaseVersion, Integer apiLevel,
            Long projectId, Long testRunId, Long deviceSessionId) {
        super(id, name, fail, type, timestamp);
        this.device = new APIDevice(deviceModelId, displayName, manufacturer, releaseVersion,
                apiLevel, creditsPrice, imagePrefix, imageTop, imageLeft, imageWidth, imageHeight, frameExtraWidth,
                osType, platform, null, null, null, null, null, null, null);
        this.projectId = projectId;
        this.testRunId = testRunId;
        this.deviceRunId = deviceSessionId;
    }

    public APIDevice getDevice() {
        return device;
    }

    public void setDevice(APIDevice device) {
        this.device = device;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getTestRunId() {
        return testRunId;
    }

    public void setTestRunId(Long testRunId) {
        this.testRunId = testRunId;
    }

    public Long getDeviceRunId() {
        return deviceRunId;
    }

    public void setDeviceRunId(Long deviceRunId) {
        this.deviceRunId = deviceRunId;
    }

    @Override
    @JsonIgnore
    protected <T extends APIEntity> void clone(T from) {
        APIScreenshotExtended apiScreenshot = (APIScreenshotExtended) from;
        super.clone(from);
        this.device = apiScreenshot.device;
        this.projectId = apiScreenshot.projectId;
        this.testRunId = apiScreenshot.testRunId;
        this.deviceRunId = apiScreenshot.deviceRunId;
    }
}
