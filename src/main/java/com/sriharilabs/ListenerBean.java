package com.sriharilabs;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerBean {
  @EventListener
  public void handleEvent(Object event) {
      System.out.println("event: GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG"+event);
  }
}