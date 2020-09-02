package com.example.wanandroid.databean;

import java.util.List;

/**
 * @data on 2020/9/2 4:24 PM
 * @auther
 * @describe
 */
public class HomeListRes extends BaseResponse{

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15088,"link":"https://juejin.im/post/6867776205253246983","niceDate":"2小时前","niceShareDate":"2小时前","origin":"","prefix":"","projectLink":"","publishTime":1599029615000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599029615000,"shareUser":"图你怀中安稳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"依赖注入及小型项目中网络框架的使用(结合Dagger2)","type":0,"userId":41223,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15059,"link":"https://www.jianshu.com/p/28a53aa986c0","niceDate":"8小时前","niceShareDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1599008185000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598961111000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"读源码长知识 | Android卡顿真的是因为&rdquo;掉帧&ldquo;？","type":0,"userId":29303,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15082,"link":"https://juejin.im/post/6867489001809379335","niceDate":"9小时前","niceShareDate":"9小时前","origin":"","prefix":"","projectLink":"","publishTime":1599007689000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599007689000,"shareUser":"xiaweizi","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"『Flutter-绘制篇』实现炫酷的雨雪特效","type":0,"userId":2148,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaotianzhen","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"kotlin在开发android的优势是逐渐显现（丰富的功能，并且在持续更新，能够快速运用在andorid上）,之前做过一款玩安卓的kotlin开源项目，采用的是MMVP的开发架构，这一次闲下来时间做了一块基于kotlin的MVP的开源app，然后还做过一款Flutter版本的开眼短视频项目,简书地址：https://www.jianshu.com/p/0f0c79853162","descMd":"","envelopePic":"https://wanandroid.com/blogimgs/15cf6db2-ac1d-4fa2-8370-25861138c0a5.png","fresh":true,"id":15063,"link":"https://www.wanandroid.com/blog/show/2783","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/xiaotianzhen/openEYE_Kotlin","publishTime":1598967193000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967193000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"Kotlin-MVP开源app--开眼短视频","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"LvKang-insist","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于鸿洋大佬的API，项目基于 Kotlin + MVP ","descMd":"","envelopePic":"https://wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":true,"id":15065,"link":"https://www.wanandroid.com/blog/show/2784","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/LvKang-insist/WanAndroid","publishTime":1598967151000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967151000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于 Kotlin + MVP 的 Wandroid","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"wwy863399246","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"学习Kotlin,JetPack,协程的Wanandroid客户端 Kotlin语言编程，JetPack组件架构，Material Design风格 repository层实现业务逻辑，viewmodel控制视图逻辑，并用koin框架依赖注入 使用Retrofit，ROOM（用户信息，阅读历史）,协程构建数据层 ","descMd":"","envelopePic":"https://wanandroid.com/blogimgs/0d83559f-2ce5-495c-ac71-3c3b254ae68d.png","fresh":true,"id":15061,"link":"https://www.wanandroid.com/blog/show/2781","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/wwy863399246/WanAndroid","publishTime":1598967052000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967052000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Kotlin+JetPack+协程+retrofit2实现的MVVM架构Material Design风格版Wanandroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaweizi","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"一款简约风格的 flutter 天气项目，提供实时、多日、24 小时、台风路径以及生活指数等服务，支持定位、删除、搜索等操作。 作为 flutter 实战项目，包含状态管理、网络请求、数据缓存、自定义 view、自定义动画，三方统计，事件管理等技术点，实用且丰富。","descMd":"","envelopePic":"https://wanandroid.com/blogimgs/1739af14-d772-41aa-a0f0-bc1fa3a27d08.png","fresh":true,"id":15079,"link":"https://www.wanandroid.com/blog/show/2785","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/xiaweizi/SimplicityWeather","publishTime":1598967002000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967002000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"『Flutter』一款风格简约功能丰富的天气","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15052,"link":"https://juejin.im/post/6867415249822154765/","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598944756000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598944756000,"shareUser":"图你怀中安稳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Retrofit + OkHttp3 + coroutines + LiveData打造一款网络请求框架","type":0,"userId":41223,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15051,"link":"https://juejin.im/post/6865836347630813192","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598932042000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598932042000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack组件之Paging Library源码篇","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15050,"link":"https://www.jianshu.com/p/b0f71c00970d","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598929941000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598929931000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"『Flutter』一款风格简约功能丰富的天气 app ","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15046,"link":"https://blog.csdn.net/willway_wang/article/details/108328820","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598925477000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598886653000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android筑基&mdash;&mdash;可视化方式理解 Handler 的同步屏障机制","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15048,"link":"https://www.jianshu.com/p/254a82722598","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598921395000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598921395000,"shareUser":"星星y","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【不务正业】如何开发一个摸鱼插件","type":0,"userId":15603,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15066,"link":"https://mp.weixin.qq.com/s/Fbc9wU_b0hoseaqDe75mmA","niceDate":"1天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968070000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Kotlin 协程与 JetPack 组件初探","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15070,"link":"https://mp.weixin.qq.com/s/4LEDM-HWRxHa4t_tuEVQGQ","niceDate":"1天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968184000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Kotlin 1.4 来了！全新语言特性和更多改进","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15073,"link":"https://mp.weixin.qq.com/s/ETRo-zCsTs_bYAW9MjzsBA","niceDate":"1天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968285000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"实际生产中的 Android SDK开发总结| 完结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15075,"link":"https://mp.weixin.qq.com/s/ICKnlTGygqRABdEPFnOc2Q","niceDate":"1天前","niceShareDate":"19小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968345000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"分享一个可以装逼的开发技巧","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15078,"link":"https://mp.weixin.qq.com/s/faeImHs3Sjj_Tq3CZrSVmA","niceDate":"1天前","niceShareDate":"19小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968408000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"一个人竟然撸了一个微博 App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15043,"link":"https://juejin.im/post/6866646512475209742","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598883818000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598883818000,"shareUser":"哈利迪","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | dagger细枝篇","type":0,"userId":6999,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15041,"link":"https://juejin.im/post/6866966991338242061","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598871843000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598871843000,"shareUser":"逮虾户","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"AndResGuard编译速度优化","type":0,"userId":63284,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15071,"link":"https://mp.weixin.qq.com/s/VhWN1SXxIngaDQJtv4Hbtw","niceDate":"2天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598803200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968204000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Android 敏感数据泄露引发的思考","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":457,"size":20,"total":9138}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15088,"link":"https://juejin.im/post/6867776205253246983","niceDate":"2小时前","niceShareDate":"2小时前","origin":"","prefix":"","projectLink":"","publishTime":1599029615000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599029615000,"shareUser":"图你怀中安稳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"依赖注入及小型项目中网络框架的使用(结合Dagger2)","type":0,"userId":41223,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15059,"link":"https://www.jianshu.com/p/28a53aa986c0","niceDate":"8小时前","niceShareDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1599008185000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598961111000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"读源码长知识 | Android卡顿真的是因为&rdquo;掉帧&ldquo;？","type":0,"userId":29303,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15082,"link":"https://juejin.im/post/6867489001809379335","niceDate":"9小时前","niceShareDate":"9小时前","origin":"","prefix":"","projectLink":"","publishTime":1599007689000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599007689000,"shareUser":"xiaweizi","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"『Flutter-绘制篇』实现炫酷的雨雪特效","type":0,"userId":2148,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaotianzhen","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"kotlin在开发android的优势是逐渐显现（丰富的功能，并且在持续更新，能够快速运用在andorid上）,之前做过一款玩安卓的kotlin开源项目，采用的是MMVP的开发架构，这一次闲下来时间做了一块基于kotlin的MVP的开源app，然后还做过一款Flutter版本的开眼短视频项目,简书地址：https://www.jianshu.com/p/0f0c79853162","descMd":"","envelopePic":"https://wanandroid.com/blogimgs/15cf6db2-ac1d-4fa2-8370-25861138c0a5.png","fresh":true,"id":15063,"link":"https://www.wanandroid.com/blog/show/2783","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/xiaotianzhen/openEYE_Kotlin","publishTime":1598967193000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967193000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"Kotlin-MVP开源app--开眼短视频","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"LvKang-insist","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于鸿洋大佬的API，项目基于 Kotlin + MVP ","descMd":"","envelopePic":"https://wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":true,"id":15065,"link":"https://www.wanandroid.com/blog/show/2784","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/LvKang-insist/WanAndroid","publishTime":1598967151000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967151000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于 Kotlin + MVP 的 Wandroid","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"wwy863399246","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"学习Kotlin,JetPack,协程的Wanandroid客户端 Kotlin语言编程，JetPack组件架构，Material Design风格 repository层实现业务逻辑，viewmodel控制视图逻辑，并用koin框架依赖注入 使用Retrofit，ROOM（用户信息，阅读历史）,协程构建数据层 ","descMd":"","envelopePic":"https://wanandroid.com/blogimgs/0d83559f-2ce5-495c-ac71-3c3b254ae68d.png","fresh":true,"id":15061,"link":"https://www.wanandroid.com/blog/show/2781","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/wwy863399246/WanAndroid","publishTime":1598967052000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967052000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Kotlin+JetPack+协程+retrofit2实现的MVVM架构Material Design风格版Wanandroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaweizi","canEdit":false,"chapterId":402,"chapterName":"跨平台应用","collect":false,"courseId":13,"desc":"一款简约风格的 flutter 天气项目，提供实时、多日、24 小时、台风路径以及生活指数等服务，支持定位、删除、搜索等操作。 作为 flutter 实战项目，包含状态管理、网络请求、数据缓存、自定义 view、自定义动画，三方统计，事件管理等技术点，实用且丰富。","descMd":"","envelopePic":"https://wanandroid.com/blogimgs/1739af14-d772-41aa-a0f0-bc1fa3a27d08.png","fresh":true,"id":15079,"link":"https://www.wanandroid.com/blog/show/2785","niceDate":"20小时前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"https://github.com/xiaweizi/SimplicityWeather","publishTime":1598967002000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1598967002000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=402"}],"title":"『Flutter』一款风格简约功能丰富的天气","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15052,"link":"https://juejin.im/post/6867415249822154765/","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598944756000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598944756000,"shareUser":"图你怀中安稳","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Retrofit + OkHttp3 + coroutines + LiveData打造一款网络请求框架","type":0,"userId":41223,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15051,"link":"https://juejin.im/post/6865836347630813192","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598932042000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598932042000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android Jetpack组件之Paging Library源码篇","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15050,"link":"https://www.jianshu.com/p/b0f71c00970d","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598929941000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598929931000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"『Flutter』一款风格简约功能丰富的天气 app ","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15046,"link":"https://blog.csdn.net/willway_wang/article/details/108328820","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598925477000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598886653000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android筑基&mdash;&mdash;可视化方式理解 Handler 的同步屏障机制","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15048,"link":"https://www.jianshu.com/p/254a82722598","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598921395000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598921395000,"shareUser":"星星y","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【不务正业】如何开发一个摸鱼插件","type":0,"userId":15603,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15066,"link":"https://mp.weixin.qq.com/s/Fbc9wU_b0hoseaqDe75mmA","niceDate":"1天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968070000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Kotlin 协程与 JetPack 组件初探","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15070,"link":"https://mp.weixin.qq.com/s/4LEDM-HWRxHa4t_tuEVQGQ","niceDate":"1天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968184000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Kotlin 1.4 来了！全新语言特性和更多改进","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15073,"link":"https://mp.weixin.qq.com/s/ETRo-zCsTs_bYAW9MjzsBA","niceDate":"1天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968285000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"实际生产中的 Android SDK开发总结| 完结","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15075,"link":"https://mp.weixin.qq.com/s/ICKnlTGygqRABdEPFnOc2Q","niceDate":"1天前","niceShareDate":"19小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968345000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"分享一个可以装逼的开发技巧","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15078,"link":"https://mp.weixin.qq.com/s/faeImHs3Sjj_Tq3CZrSVmA","niceDate":"1天前","niceShareDate":"19小时前","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968408000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"一个人竟然撸了一个微博 App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15043,"link":"https://juejin.im/post/6866646512475209742","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598883818000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598883818000,"shareUser":"哈利迪","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | dagger细枝篇","type":0,"userId":6999,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15041,"link":"https://juejin.im/post/6866966991338242061","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1598871843000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1598871843000,"shareUser":"逮虾户","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"AndResGuard编译速度优化","type":0,"userId":63284,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15071,"link":"https://mp.weixin.qq.com/s/VhWN1SXxIngaDQJtv4Hbtw","niceDate":"2天前","niceShareDate":"20小时前","origin":"","prefix":"","projectLink":"","publishTime":1598803200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968204000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Android 敏感数据泄露引发的思考","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 457
         * size : 20
         * total : 9138
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * id : 15088
             * link : https://juejin.im/post/6867776205253246983
             * niceDate : 2小时前
             * niceShareDate : 2小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1599029615000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1599029615000
             * shareUser : 图你怀中安稳
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : 依赖注入及小型项目中网络框架的使用(结合Dagger2)
             * type : 0
             * userId : 41223
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
