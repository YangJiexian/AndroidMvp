项目地址：[https://github.com/YangJiexian/AndroidMvp](https://github.com/YangJiexian/AndroidMvp)
## 项目
项目基于RxJava + Retrofit2 + Dagger2，结合MVP模式的练习

MainPresenter作为MainActivity和MainModel之间的桥梁，当MainActivity需要请求数据时，通知MainPresenter；MainPresenter通知MainModel需要数据，MainModel通过Retrofit从网络中获取数据，若是请求成功，则把数据传给MainPresenter,若是请求失败，则把失败信息传给MainPresenter。
MainPresenter从MainModel中获取数据信息后通知MainActivity更新数据。


![](http://upload-images.jianshu.io/upload_images/1830482-0935e4212385518e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
