package com.servlet.controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
  
public class HibernateUtils {
 private static SessionFactory factory;
  
 public static SessionFactory getSessionFactory() {
  if (factory == null) {
   Configuration configuration = new Configuration();
   factory = configuration.configure().buildSessionFactory();
  }
  return factory;
 }
}