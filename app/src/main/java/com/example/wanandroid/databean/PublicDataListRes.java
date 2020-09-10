package com.example.wanandroid.databean;

import android.text.Html;
import android.text.Spanned;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @data on 2020/9/7 3:25 PM
 * @auther
 * @describe
 */
public class PublicDataListRes extends BaseResponse {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15121,"link":"https://mp.weixin.qq.com/s/66P1Q7QKEBzJ1ORxmiXdJA","niceDate":"2020-09-04 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599148800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599222632000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"App为什么会crash？事情没有你想得那么简单","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15105,"link":"https://mp.weixin.qq.com/s/58jr8YpATbxheQcmEbzY1A","niceDate":"2020-09-03 00:00","niceShareDate":"2020-09-03 22:14","origin":"","prefix":"","projectLink":"","publishTime":1599062400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599142452000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"用Flutter让列表侧滑更加丝滑","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15093,"link":"https://mp.weixin.qq.com/s/rpYQMwhTxXrqRH3tjq3M5w","niceDate":"2020-09-02 00:00","niceShareDate":"2020-09-02 21:46","origin":"","prefix":"","projectLink":"","publishTime":1598976000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599054373000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"使用MD风格，让你的项目更好看","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15075,"link":"https://mp.weixin.qq.com/s/ICKnlTGygqRABdEPFnOc2Q","niceDate":"2020-09-01 00:00","niceShareDate":"2020-09-01 21:52","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968345000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"分享一个可以装逼的开发技巧","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15074,"link":"https://mp.weixin.qq.com/s/U3_-SFp32CWHUCEq57borQ","niceDate":"2020-08-28 00:00","niceShareDate":"2020-09-01 21:52","origin":"","prefix":"","projectLink":"","publishTime":1598544000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968325000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"学习一个由阿里开发的Flutter框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15013,"link":"https://mp.weixin.qq.com/s/Pf1jhBUvzoQeqNMuRMai5Q","niceDate":"2020-08-27 00:00","niceShareDate":"2020-08-27 21:54","origin":"","prefix":"","projectLink":"","publishTime":1598457600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598536461000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"AS自定义模板，效率提升的不是一星半点","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14998,"link":"https://mp.weixin.qq.com/s/OmFVLmYK4OxZEN6qdyNqig","niceDate":"2020-08-26 00:00","niceShareDate":"2020-08-26 23:05","origin":"","prefix":"","projectLink":"","publishTime":1598371200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598454314000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"自定义一个密码输入框吧！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14976,"link":"https://mp.weixin.qq.com/s/rverE0OGRnncB5-K-_Wesg","niceDate":"2020-08-25 00:00","niceShareDate":"2020-08-25 22:55","origin":"","prefix":"","projectLink":"","publishTime":1598284800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598367304000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Jetpack新成员，App Startup一篇就懂","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14913,"link":"https://mp.weixin.qq.com/s/B2pHw9xuMRqH2c-eewQKWg","niceDate":"2020-08-21 00:00","niceShareDate":"2020-08-21 23:08","origin":"","prefix":"","projectLink":"","publishTime":1597939200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598022481000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"分析Retrofit与OkHttp的三个实战案例！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14885,"link":"https://mp.weixin.qq.com/s/Qt8ZHH_-1r8Kqg2wFz0U5g","niceDate":"2020-08-20 00:00","niceShareDate":"2020-08-20 22:38","origin":"","prefix":"","projectLink":"","publishTime":1597852800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597934310000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"LiveData还不熟悉？看完原理立马释怀！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14857,"link":"https://mp.weixin.qq.com/s/s4OcylT1KPCUKWK1jcTB7A","niceDate":"2020-08-19 00:00","niceShareDate":"2020-08-19 23:11","origin":"","prefix":"","projectLink":"","publishTime":1597766400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597849898000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"项目创建了几百个线程，你要怎么优化？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14844,"link":"https://mp.weixin.qq.com/s/7nhxiJncBRr4XwXJZTAIlg","niceDate":"2020-08-18 00:00","niceShareDate":"2020-08-18 22:28","origin":"","prefix":"","projectLink":"","publishTime":1597680000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597760890000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"跟着小老弟来学习Kotlin中的逆变和协变","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14766,"link":"https://mp.weixin.qq.com/s/tM27YqkHnDchvWHBQ6iTGQ","niceDate":"2020-08-13 00:00","niceShareDate":"2020-08-14 21:34","origin":"","prefix":"","projectLink":"","publishTime":1597248000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597412098000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"图解LinkedHashMap","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14741,"link":"https://mp.weixin.qq.com/s/Pok2deUD1H6EKcUpGA77-w","niceDate":"2020-08-12 00:00","niceShareDate":"2020-08-12 21:00","origin":"","prefix":"","projectLink":"","publishTime":1597161600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597237215000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"你平时开发会关注卡顿和卡顿率吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14733,"link":"https://mp.weixin.qq.com/s/WES_sP6w4XxqMYgWPlHy_Q","niceDate":"2020-08-11 00:00","niceShareDate":"2020-08-11 22:15","origin":"","prefix":"","projectLink":"","publishTime":1597075200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597155324000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"LitePal 3.2来了，千呼万唤的索引功能","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14682,"link":"https://mp.weixin.qq.com/s/SpCdNbBWXoOrUYA0HOeokg","niceDate":"2020-08-07 00:00","niceShareDate":"2020-08-07 23:33","origin":"","prefix":"","projectLink":"","publishTime":1596729600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596814431000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"使用RecyclerView优雅地实现复杂列表效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14667,"link":"https://mp.weixin.qq.com/s/7Z9UmvMCI90EyzFovV_rEw","niceDate":"2020-08-06 00:00","niceShareDate":"2020-08-06 22:57","origin":"","prefix":"","projectLink":"","publishTime":1596643200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596725871000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Lifecycle源码解析，让你一次学个够！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14641,"link":"https://mp.weixin.qq.com/s/NNClO9YmkPQMumzqsgnOgg","niceDate":"2020-08-05 00:00","niceShareDate":"2020-08-05 23:34","origin":"","prefix":"","projectLink":"","publishTime":1596556800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596641679000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Parcelable 是如何实现的？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14585,"link":"https://mp.weixin.qq.com/s/LCN3ACxbvtGLiahqokYxTw","niceDate":"2020-07-31 00:00","niceShareDate":"2020-07-31 23:15","origin":"","prefix":"","projectLink":"","publishTime":1596124800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596208544000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android内存管理知识百科","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14546,"link":"https://mp.weixin.qq.com/s/qMrKdv10MQQsNrRBARzxcA","niceDate":"2020-07-29 00:00","niceShareDate":"2020-07-29 21:56","origin":"","prefix":"","projectLink":"","publishTime":1595952000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596031006000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android Resources.arsc文件结构分析","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":47,"size":20,"total":922}
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
         * datas : [{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15121,"link":"https://mp.weixin.qq.com/s/66P1Q7QKEBzJ1ORxmiXdJA","niceDate":"2020-09-04 00:00","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1599148800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599222632000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"App为什么会crash？事情没有你想得那么简单","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15105,"link":"https://mp.weixin.qq.com/s/58jr8YpATbxheQcmEbzY1A","niceDate":"2020-09-03 00:00","niceShareDate":"2020-09-03 22:14","origin":"","prefix":"","projectLink":"","publishTime":1599062400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599142452000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"用Flutter让列表侧滑更加丝滑","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15093,"link":"https://mp.weixin.qq.com/s/rpYQMwhTxXrqRH3tjq3M5w","niceDate":"2020-09-02 00:00","niceShareDate":"2020-09-02 21:46","origin":"","prefix":"","projectLink":"","publishTime":1598976000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1599054373000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"使用MD风格，让你的项目更好看","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15075,"link":"https://mp.weixin.qq.com/s/ICKnlTGygqRABdEPFnOc2Q","niceDate":"2020-09-01 00:00","niceShareDate":"2020-09-01 21:52","origin":"","prefix":"","projectLink":"","publishTime":1598889600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968345000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"分享一个可以装逼的开发技巧","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15074,"link":"https://mp.weixin.qq.com/s/U3_-SFp32CWHUCEq57borQ","niceDate":"2020-08-28 00:00","niceShareDate":"2020-09-01 21:52","origin":"","prefix":"","projectLink":"","publishTime":1598544000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598968325000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"学习一个由阿里开发的Flutter框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15013,"link":"https://mp.weixin.qq.com/s/Pf1jhBUvzoQeqNMuRMai5Q","niceDate":"2020-08-27 00:00","niceShareDate":"2020-08-27 21:54","origin":"","prefix":"","projectLink":"","publishTime":1598457600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598536461000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"AS自定义模板，效率提升的不是一星半点","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14998,"link":"https://mp.weixin.qq.com/s/OmFVLmYK4OxZEN6qdyNqig","niceDate":"2020-08-26 00:00","niceShareDate":"2020-08-26 23:05","origin":"","prefix":"","projectLink":"","publishTime":1598371200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598454314000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"自定义一个密码输入框吧！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14976,"link":"https://mp.weixin.qq.com/s/rverE0OGRnncB5-K-_Wesg","niceDate":"2020-08-25 00:00","niceShareDate":"2020-08-25 22:55","origin":"","prefix":"","projectLink":"","publishTime":1598284800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598367304000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Jetpack新成员，App Startup一篇就懂","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14913,"link":"https://mp.weixin.qq.com/s/B2pHw9xuMRqH2c-eewQKWg","niceDate":"2020-08-21 00:00","niceShareDate":"2020-08-21 23:08","origin":"","prefix":"","projectLink":"","publishTime":1597939200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1598022481000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"分析Retrofit与OkHttp的三个实战案例！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14885,"link":"https://mp.weixin.qq.com/s/Qt8ZHH_-1r8Kqg2wFz0U5g","niceDate":"2020-08-20 00:00","niceShareDate":"2020-08-20 22:38","origin":"","prefix":"","projectLink":"","publishTime":1597852800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597934310000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"LiveData还不熟悉？看完原理立马释怀！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14857,"link":"https://mp.weixin.qq.com/s/s4OcylT1KPCUKWK1jcTB7A","niceDate":"2020-08-19 00:00","niceShareDate":"2020-08-19 23:11","origin":"","prefix":"","projectLink":"","publishTime":1597766400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597849898000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"项目创建了几百个线程，你要怎么优化？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14844,"link":"https://mp.weixin.qq.com/s/7nhxiJncBRr4XwXJZTAIlg","niceDate":"2020-08-18 00:00","niceShareDate":"2020-08-18 22:28","origin":"","prefix":"","projectLink":"","publishTime":1597680000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597760890000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"跟着小老弟来学习Kotlin中的逆变和协变","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14766,"link":"https://mp.weixin.qq.com/s/tM27YqkHnDchvWHBQ6iTGQ","niceDate":"2020-08-13 00:00","niceShareDate":"2020-08-14 21:34","origin":"","prefix":"","projectLink":"","publishTime":1597248000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597412098000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"图解LinkedHashMap","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14741,"link":"https://mp.weixin.qq.com/s/Pok2deUD1H6EKcUpGA77-w","niceDate":"2020-08-12 00:00","niceShareDate":"2020-08-12 21:00","origin":"","prefix":"","projectLink":"","publishTime":1597161600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597237215000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"你平时开发会关注卡顿和卡顿率吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14733,"link":"https://mp.weixin.qq.com/s/WES_sP6w4XxqMYgWPlHy_Q","niceDate":"2020-08-11 00:00","niceShareDate":"2020-08-11 22:15","origin":"","prefix":"","projectLink":"","publishTime":1597075200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1597155324000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"LitePal 3.2来了，千呼万唤的索引功能","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14682,"link":"https://mp.weixin.qq.com/s/SpCdNbBWXoOrUYA0HOeokg","niceDate":"2020-08-07 00:00","niceShareDate":"2020-08-07 23:33","origin":"","prefix":"","projectLink":"","publishTime":1596729600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596814431000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"使用RecyclerView优雅地实现复杂列表效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14667,"link":"https://mp.weixin.qq.com/s/7Z9UmvMCI90EyzFovV_rEw","niceDate":"2020-08-06 00:00","niceShareDate":"2020-08-06 22:57","origin":"","prefix":"","projectLink":"","publishTime":1596643200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596725871000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Lifecycle源码解析，让你一次学个够！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14641,"link":"https://mp.weixin.qq.com/s/NNClO9YmkPQMumzqsgnOgg","niceDate":"2020-08-05 00:00","niceShareDate":"2020-08-05 23:34","origin":"","prefix":"","projectLink":"","publishTime":1596556800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596641679000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Parcelable 是如何实现的？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14585,"link":"https://mp.weixin.qq.com/s/LCN3ACxbvtGLiahqokYxTw","niceDate":"2020-07-31 00:00","niceShareDate":"2020-07-31 23:15","origin":"","prefix":"","projectLink":"","publishTime":1596124800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596208544000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android内存管理知识百科","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":14546,"link":"https://mp.weixin.qq.com/s/qMrKdv10MQQsNrRBARzxcA","niceDate":"2020-07-29 00:00","niceShareDate":"2020-07-29 21:56","origin":"","prefix":"","projectLink":"","publishTime":1595952000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1596031006000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Android Resources.arsc文件结构分析","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 47
         * size : 20
         * total : 922
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
             * author : 郭霖
             * canEdit : false
             * chapterId : 409
             * chapterName : 郭霖
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * id : 15121
             * link : https://mp.weixin.qq.com/s/66P1Q7QKEBzJ1ORxmiXdJA
             * niceDate : 2020-09-04 00:00
             * niceShareDate : 2天前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1599148800000
             * realSuperChapterId : 407
             * selfVisible : 0
             * shareDate : 1599222632000
             * shareUser :
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/409/1"}]
             * title : App为什么会crash？事情没有你想得那么简单
             * type : 0
             * userId : -1
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
            private List<TagsBean> tags;

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

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 公众号
                 * url : /wxarticle/list/409/1
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
