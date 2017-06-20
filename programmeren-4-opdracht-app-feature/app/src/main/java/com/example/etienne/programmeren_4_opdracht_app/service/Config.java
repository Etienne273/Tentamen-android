package com.example.etienne.programmeren_4_opdracht_app.service;

public class Config {

    private Config() {
        // empty constructor
    }

    public static final String AUTHORIZATION = "Authorization";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String BEARER = "Bearer ";

  // public static final String URL_LOGIN = "http://10.0.2.2:3000/api/v1/login";
   // public static final String URL_REGISTER = "http://10.0.2.2:3000/api/v1/register";
  // public static final String URL_FILMS = "http://10.0.2.2:3000/api/v1/films";
 //   public static final String URL_INVENTORIES = "http://10.0.2.2:3000/api/v1/inventories/";
 //  public static final String URL_RENTALS_INVENTORY = "http://10.0.2.2:3000/api/v1/rentals/inventory/";
 //  public static final String URL_RENTALS_CUSTOMER = "http://10.0.2.2:3000/api/v1/rentals/customer/";
  //  public static final String URL_RENTALS = "http://10.0.2.2:3000/api/v1/rentals/";

  public static final String URL_LOGIN = "https://server-4.herokuapp.com/api/v1/login";
   public static final String URL_REGISTER = "https://server-4.herokuapp.com/api/v1/register";
    public static final String URL_FILMS = "https://server-4.herokuapp.com//api/v1/films";
  public static final String URL_INVENTORIES = "https://server-4.herokuapp.com//api/v1/inventories/";
    public static final String URL_RENTALS_INVENTORY = "https://server-4.herokuapp.com//api/v1/rentals/inventory/";
    public static final String URL_RENTALS_CUSTOMER = "https://server-4.herokuapp.com//api/v1/rentals/customer/";
    public static final String URL_RENTALS = "https://server-4.herokuapp.com/api/v1/rentals/";
}
