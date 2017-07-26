项目地址：[https://github.com/YangJiexian/AndroidMvp](https://github.com/YangJiexian/AndroidMvp)
## 项目
项目基于RxJava + Retrofit2 + Dagger2，结合MVP模式的练习

MainPresenter作为MainActivity和MainModel之间的桥梁，当MainActivity需要请求数据时，通知MainPresenter；MainPresenter通知MainModel需要数据，MainModel通过Retrofit从网络中获取数据，若是请求成功，则把数据传给MainPresenter,若是请求失败，则把失败信息传给MainPresenter。
MainPresenter从MainModel中获取数据信息后通知MainActivity更新数据。


![](http://upload-images.jianshu.io/upload_images/1830482-0935e4212385518e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

下面是关于Mvp的一些链接。
1.Android官方MVP架构示例项目解析，一篇比较好的导读文章 

https://mp.weixin.qq.com/s?__biz=MzA3ODg4MDk0Ng==&mid=403539764&idx=1&sn=d30d89e6848a8e13d4da0f5639100e5f&scene=1&srcid=0412M65yVH3uABy3bpavy6x0&pass_ticket=5MIdEBvaDHMVsC%2BFJ3TixYz0hIsRA3xGpPK4qAFVQEeg5QSzD0XnSvXUaXx88e%2Fu#rd

2.Google原味mvp实践

http://www.jianshu.com/p/dc9733bc3a54?utm_campaign=haruki&utm_content=note&utm_medium=reader_share&utm_source=qq

3.官方Demo

https://github.com/googlesamples/android-architecture
