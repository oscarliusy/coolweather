package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //JSON中部分字段不适合作为java字段
    // 采用@SerializedName的方式建立JSON字段和java字段的映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    //这代表update字段下面还有loc字段，向下嵌套，格式相同
    public class  Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
