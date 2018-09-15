package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by admin on 2018/9/14.
 */
@Controller
public class WsController {

  @MessageMapping("welcome")
  @SendTo("/demo_2/topic/getResponse")
  public String say(String msb) throws Exception{
    return msb;
  }
}
