package com.github.oceanbbbbbb.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Feixiaohao {

  private long ctime;
//  private JSONArray jsonArray;
  private JSONObject jsonObject;

}
