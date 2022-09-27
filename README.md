该项目不再维护，有需求的可以看下这个项目：
https://github.com/gzu-liyujiang/Android_CN_OAID

[ ![Download](https://api.bintray.com/packages/lany192/maven/UniqueDeviceId/images/download.svg) ](https://bintray.com/lany192/maven/UniqueDeviceId/_latestVersion)
## Gradle引用
    compile 'com.lany:UniqueDeviceId:1.0.4'
## 调用方式
    String uniqueId = DeviceUtils.getUniqueDeviceId(Context context);
## 注意
因为android 6.0以上系统的权限问题可能导致异常，所以要求主项目  targetSdkVersion<23

request target sdk version less than 23
