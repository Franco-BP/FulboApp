package com.fulboapp.util;

import org.dozer.DozerBeanMapper;

public class DozerUtil {

  private static DozerUtil INSTANCE;

  private DozerBeanMapper mapper;

  private DozerUtil() {

  }

  public synchronized static DozerUtil getINSTANCE() {
    if (INSTANCE == null) {
      INSTANCE = new DozerUtil();
    }
    return INSTANCE;
  }

  public DozerBeanMapper getMapper() {
    if (mapper == null) {
      mapper = new DozerBeanMapper();
    }
    return mapper;
  }



}

