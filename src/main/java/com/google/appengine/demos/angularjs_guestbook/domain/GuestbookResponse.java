package com.google.appengine.demos.angularjs_guestbook.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Takashi Matsuo <tmatsuo@google.com>
 * Date: 4/8/13
 * Time: 11:43 AM
 */
public class GuestbookResponse {

  private final String guestbookName;

  private final List<Greeting> greetings;

  private final UserServiceInfo userServiceInfo;

  public GuestbookResponse(String guestbookName, List<Greeting> greetings,
                           UserServiceInfo userServiceInfo) {
    this.guestbookName = guestbookName;
    this.greetings = greetings;
    this.userServiceInfo = userServiceInfo;
  }

  public String getGuestbookName() {
    return guestbookName;
  }

  public List<Greeting> getGreetings() {
    return greetings;
  }

  public UserServiceInfo getUserServiceInfo() {
    return userServiceInfo;
  }
}
