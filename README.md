# MutipleScaleView
Android多功能刻度尺(Kotlin)

## 演示效果
![刻度尺1](https://github.com/tzt1994/imageLib/blob/master/NotificationTest/mutiplescale1.png)
![刻度尺2](https://github.com/tzt1994/imageLib/blob/master/NotificationTest/mutiplescale2.png)

## 添加依赖
- **1.项目根目录下的build.gradle中**
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

- **2.app路径下的build.gradle中**
```
dependencies {
    ...
    ...
    implementation 'com.github.tzt1994:MutipleScaleView:v1.0.1'
}
```

## 自定义属性
属性名|属性含义|值类型|默认值
---|:--|:---|:---
`mscv_scale_type`|刻度尺模式:规则和不规则|枚举值TYPE_RULE,TYPE_IRREGULAR|TYPE_RULE
`msv_scale_line_able`|刻度值的显示:每多少个刻度画一个刻度值(规则刻度尺下有效)|枚举值SCALE_TEN,SCALE_TEN|SCALE_TEN
`msv_click_select`|是否点击选中|Boolean|false
`msv_indicator_src`|指针图片资源|图片资源id|R.mipmap.pointer
`msv_unit`|最小刻度代表的值(规则刻度尺下有效)|Float|1f
`msv_min`|最小值(规则刻度尺下有效)|Int|0
`msv_max`|最大值(规则刻度尺下有效)|Int|300
`msv_irregulars`|不规则刻度尺的数据|String(每个刻度值用英文输入法的,隔开)|"1,3,5,10,13,16,17"
`msv_value`|默认值|String|规则刻度尺 "100", 不规则刻度尺 "10"
`msv_scale_long_line_color`|长刻度线颜色(每5个和每10个刻度线)|ColorInt或颜色资源id|#333333
`msv_scale_long_line_width`|长刻度线宽度(每5个和每10个刻度线)|dp或尺寸资源id|2dp
`msv_scale_short_line_color`|短刻度线颜色(非每5个和每10个刻度线)|ColorInt或颜色资源id|#666666
`msv_scale_short_line_width`|短刻度线宽度(每5个和每10个刻度线)|dp或尺寸资源id|1dp
`msv_scale_line_height`|刻度线的长(最长刻度线的值)|dp或尺寸资源id|24dp
`msv_scale_line_space`|刻度线之间的最小间距|dp或尺寸资源id|8dp
`msv_scale_text_color`|刻度值未选中颜色|ColorInt或颜色资源id|#333333
`msv_select_color`|刻度值选中颜色|ColorInt或颜色资源id|#ff8f00
`msv_scale_text_size`|刻度值文字大小|sp或尺寸资源id|14sp
`msv_min_scrollable_nums`|最小可选刻度数(规则刻度尺下有效)|Int|1

## 在代码中动态设置的属性
- `mOnlyTenScaleLineAble` boolean 是否每10个刻度画一个刻度线 默认`false`
- `mScaleType` 见自定义属性`mscv_scale_type`
- `mScaleLineTextType` 见自定义属性`msv_scale_line_able`
- `mClickSelectAble` 见自定义属性`msv_click_select`
- `mIrregularList` 见自定义属性`msv_irregulars`
- `mUnitValue` 见自定义属性`msv_unit`
- `mMin` 见自定义属性`msv_min`
- `mMax` 见自定义属性`msv_max`
- `mCureentValue` 见自定义属性`msv_value`
- `mLongLineColor` 见自定义属性`msv_scale_long_line_color`
- `mLongLineWidth` 见自定义属性`msv_scale_long_line_width`
- `mShortLineColor` 见自定义属性`msv_scale_short_line_color`
- `mShortLineWidth` 见自定义属性`msv_scale_short_line_width`
- `mLineSpace` 见自定义属性`msv_scale_line_space`
- `mTextColor` 见自定义属性`msv_scale_text_color`
- `mSelectColor` 见自定义属性`msv_select_color`
- `mRecentlyNums` 见自定义属性`msv_min_scrollable_nums`

## 版本日志

v1.0.1:
- 修复xml设置不规则数据集，刻度值显示异常问题

v1.0.0:
- 支持点击选中，支持滑动选中，支持惯性滑动，支持边界回弹
- 支持设置刻度线长宽，刻度线颜色，刻度间距，
- 支持设置刻度值颜色及大小
- 支持设置指针图片

## License
    Copyright 2018-2020 
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
  
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
