package com.example.wanandroid.databean;

import android.text.Html;
import android.text.Spanned;

import java.util.List;

/**
 * @data on 2020/9/10 3:29 PM
 * @auther
 * @describe  搜索文章POST请求
 */
public class SearchArticleListRes extends BaseResponse {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":296,"chapterName":"阅读","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15174,"link":"https://juejin.im/post/6870111983933325319","niceDate":"15小时前","niceShareDate":"16小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666438000,"realSuperChapterId":180,"selfVisible":0,"shareDate":1599665587000,"shareUser":"鸿洋","superChapterId":203,"superChapterName":"延伸技术","tags":[],"title":"<em class='highlight'>Android<\/em> 筑基导论","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15175,"link":"https://juejin.im/post/6870389004387385352","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666424000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1599665786000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"<em class='highlight'>Android<\/em>性能优化之UI卡顿优化实例分析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":95,"chapterName":"相机Camera","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15176,"link":"https://juejin.im/post/6870357283899342862","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666411000,"realSuperChapterId":38,"selfVisible":0,"shareDate":1599665794000,"shareUser":"鸿洋","superChapterId":95,"superChapterName":"多媒体技术","tags":[],"title":"<em class='highlight'>Android<\/em> Camera 架构","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":185,"chapterName":"组件化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15179,"link":"https://www.jianshu.com/p/54bd094f6b00","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666389000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1599665874000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"<em class='highlight'>Android<\/em> 组件化思考与总结","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"iielse","canEdit":false,"chapterId":380,"chapterName":"ImageView","collect":false,"courseId":13,"desc":"提供查看缩略视图到原视图的无缝过渡转变的视觉效果，优雅的浏览普通图、长图、动图.\r\n主要功能\r\n过渡动画 缩略图到大图或大图到缩略图时提供无缝衔接动画\r\n浏览手势 浏览大图时可使用常势操用手.如缩放图片等.\r\n超大图 图片区块加载.避免OOM\r\nVideo 支持Video加载\r\n拖拽关闭 对大图进行上/下滑操作退出浏览.\r\n数据分页加载 在浏览大图的情况下异步加载百万数据.","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/23ca370f-ea42-4354-a4f4-5a69c4019232.png","fresh":true,"id":15184,"link":"https://www.wanandroid.com/blog/show/2789","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"https://github.com/iielse/imageviewer","publishTime":1599666299000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1599666299000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=380"}],"title":"一个简单且可自定义的<em class='highlight'>Android<\/em>全屏图像浏览器","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15172,"link":"https://www.jianshu.com/p/eef3daeeecbc","niceDate":"19小时前","niceShareDate":"19小时前","origin":"","prefix":"","projectLink":"","publishTime":1599652168000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599652168000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> Bitmap 详解：关于 Bitamp 你所要知道的一切","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15171,"link":"https://www.jianshu.com/p/1e07fa9b7085","niceDate":"21小时前","niceShareDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1599646652000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599646652000,"shareUser":"745612618","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 上传Apk至Google play store总结","type":0,"userId":8822,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15169,"link":"http://blog.csdn.net/summerrse/article/details/108491905","niceDate":"23小时前","niceShareDate":"23小时前","origin":"","prefix":"","projectLink":"","publishTime":1599640280000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599640280000,"shareUser":"zzs1994","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 代码混淆","type":0,"userId":27843,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15185,"link":"https://mp.weixin.qq.com/s/XF6yOGUdwngWzMQ54hS9kw","niceDate":"1天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599580800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599666495000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"<em class='highlight'>Android<\/em> 11 正式发布 | 开发者们的舞台已就绪","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15161,"link":"https://www.jianshu.com/p/51d63a1ffb95","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1599563210000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599563210000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> | 一个进程有多少个 Context 对象（答对的不多）","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15158,"link":"https://blog.csdn.net/lzllzllhl/article/details/108461777","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599533635000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599533635000,"shareUser":"只会写bug的咸鱼","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"记录<em class='highlight'>Android<\/em> 迁移到<em class='highlight'>Android<\/em>X时的步骤和注意事项","type":0,"userId":8350,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15154,"link":"https://www.jianshu.com/p/5005969bf37a","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599494674000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599494674000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> Q深色模式源码解析 ","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15152,"link":"https://www.jianshu.com/p/99d8466b8cee","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599494587000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599494587000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> RecyclerView自定义LayoutManager ","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15151,"link":"https://www.jianshu.com/p/8509e0228386","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599494580000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599494580000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 回收复用的RecyclerView ","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15146,"link":"https://blog.csdn.net/weixin_38478780/article/details/108307809","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599488530000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599488530000,"shareUser":"萌果爱吃柠檬","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 中的网络操作（HttpURLConnection）","type":0,"userId":65908,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15145,"link":"https://blog.csdn.net/weixin_38478780/article/details/108355483","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599488459000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599488459000,"shareUser":"萌果爱吃柠檬","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> Notification发送通知","type":0,"userId":65908,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15144,"link":"https://blog.csdn.net/weixin_38478780/article/details/108453422","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599488355000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599488355000,"shareUser":"萌果爱吃柠檬","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> handler 消息通信实践（附计时器 demo）","type":0,"userId":65908,"visible":0,"zan":0}],"offset":0,"over":false,"pageCount":237,"size":20,"total":4730}
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
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":296,"chapterName":"阅读","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15174,"link":"https://juejin.im/post/6870111983933325319","niceDate":"15小时前","niceShareDate":"16小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666438000,"realSuperChapterId":180,"selfVisible":0,"shareDate":1599665587000,"shareUser":"鸿洋","superChapterId":203,"superChapterName":"延伸技术","tags":[],"title":"<em class='highlight'>Android<\/em> 筑基导论","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15175,"link":"https://juejin.im/post/6870389004387385352","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666424000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1599665786000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"<em class='highlight'>Android<\/em>性能优化之UI卡顿优化实例分析","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":95,"chapterName":"相机Camera","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15176,"link":"https://juejin.im/post/6870357283899342862","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666411000,"realSuperChapterId":38,"selfVisible":0,"shareDate":1599665794000,"shareUser":"鸿洋","superChapterId":95,"superChapterName":"多媒体技术","tags":[],"title":"<em class='highlight'>Android<\/em> Camera 架构","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":185,"chapterName":"组件化","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15179,"link":"https://www.jianshu.com/p/54bd094f6b00","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599666389000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1599665874000,"shareUser":"鸿洋","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"<em class='highlight'>Android<\/em> 组件化思考与总结","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"iielse","canEdit":false,"chapterId":380,"chapterName":"ImageView","collect":false,"courseId":13,"desc":"提供查看缩略视图到原视图的无缝过渡转变的视觉效果，优雅的浏览普通图、长图、动图.\r\n主要功能\r\n过渡动画 缩略图到大图或大图到缩略图时提供无缝衔接动画\r\n浏览手势 浏览大图时可使用常势操用手.如缩放图片等.\r\n超大图 图片区块加载.避免OOM\r\nVideo 支持Video加载\r\n拖拽关闭 对大图进行上/下滑操作退出浏览.\r\n数据分页加载 在浏览大图的情况下异步加载百万数据.","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/23ca370f-ea42-4354-a4f4-5a69c4019232.png","fresh":true,"id":15184,"link":"https://www.wanandroid.com/blog/show/2789","niceDate":"15小时前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"https://github.com/iielse/imageviewer","publishTime":1599666299000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1599666299000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=380"}],"title":"一个简单且可自定义的<em class='highlight'>Android<\/em>全屏图像浏览器","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15172,"link":"https://www.jianshu.com/p/eef3daeeecbc","niceDate":"19小时前","niceShareDate":"19小时前","origin":"","prefix":"","projectLink":"","publishTime":1599652168000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599652168000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> Bitmap 详解：关于 Bitamp 你所要知道的一切","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15171,"link":"https://www.jianshu.com/p/1e07fa9b7085","niceDate":"21小时前","niceShareDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1599646652000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599646652000,"shareUser":"745612618","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 上传Apk至Google play store总结","type":0,"userId":8822,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15169,"link":"http://blog.csdn.net/summerrse/article/details/108491905","niceDate":"23小时前","niceShareDate":"23小时前","origin":"","prefix":"","projectLink":"","publishTime":1599640280000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599640280000,"shareUser":"zzs1994","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 代码混淆","type":0,"userId":27843,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15185,"link":"https://mp.weixin.qq.com/s/XF6yOGUdwngWzMQ54hS9kw","niceDate":"1天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1599580800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599666495000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"<em class='highlight'>Android<\/em> 11 正式发布 | 开发者们的舞台已就绪","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15161,"link":"https://www.jianshu.com/p/51d63a1ffb95","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1599563210000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599563210000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> | 一个进程有多少个 Context 对象（答对的不多）","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15158,"link":"https://blog.csdn.net/lzllzllhl/article/details/108461777","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599533635000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599533635000,"shareUser":"只会写bug的咸鱼","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"记录<em class='highlight'>Android<\/em> 迁移到<em class='highlight'>Android<\/em>X时的步骤和注意事项","type":0,"userId":8350,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15154,"link":"https://www.jianshu.com/p/5005969bf37a","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599494674000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599494674000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> Q深色模式源码解析 ","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15152,"link":"https://www.jianshu.com/p/99d8466b8cee","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599494587000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599494587000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> RecyclerView自定义LayoutManager ","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15151,"link":"https://www.jianshu.com/p/8509e0228386","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599494580000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599494580000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 回收复用的RecyclerView ","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15146,"link":"https://blog.csdn.net/weixin_38478780/article/details/108307809","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599488530000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599488530000,"shareUser":"萌果爱吃柠檬","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 中的网络操作（HttpURLConnection）","type":0,"userId":65908,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15145,"link":"https://blog.csdn.net/weixin_38478780/article/details/108355483","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599488459000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599488459000,"shareUser":"萌果爱吃柠檬","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> Notification发送通知","type":0,"userId":65908,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15144,"link":"https://blog.csdn.net/weixin_38478780/article/details/108453422","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599488355000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1599488355000,"shareUser":"萌果爱吃柠檬","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> handler 消息通信实践（附计时器 demo）","type":0,"userId":65908,"visible":0,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 237
         * size : 20
         * total : 4730
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
             * chapterId : 296
             * chapterName : 阅读
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * id : 15174
             * link : https://juejin.im/post/6870111983933325319
             * niceDate : 15小时前
             * niceShareDate : 16小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1599666438000
             * realSuperChapterId : 180
             * selfVisible : 0
             * shareDate : 1599665587000
             * shareUser : 鸿洋
             * superChapterId : 203
             * superChapterName : 延伸技术
             * tags : []
             * title : <em class='highlight'>Android</em> 筑基导论
             * type : 0
             * userId : 2
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

            public Spanned getTitle() {
                return Html.fromHtml(title);
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
