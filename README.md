[ ![Download](https://api.bintray.com/packages/lany192/maven/UniqueDeviceId/images/download.svg) ](https://bintray.com/lany192/maven/UniqueDeviceId/_latestVersion)

compile 'com.lany:UniqueDeviceId:1.0.3'

调用方式：String id = DeviceUtils.getUniqueDeviceId(this);

# AndroidUniqueDeviceId
根据安卓手机设备特征,生成设备唯一设备号。

#注意：因为android 6.0以上系统的权限问题可能导致异常，所以要求主项目targetSdkVersion<23
