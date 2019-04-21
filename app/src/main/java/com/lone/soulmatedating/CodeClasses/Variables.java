package com.lone.soulmatedating.CodeClasses;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by AQEEL on 10/23/2018.
 */

public class Variables {

    public static String pref_name="pref_name";
    public static String f_name="f_name";
    public static String l_name="l_name";
    public static String birth_day="birth_day";
    public static String gender="gender";
    public static String uid="uid";
    public static String u_pic="u_pic";
    public static String islogin="islogin";
    public static String Lat="Lat";
    public static String Lon="Lon";
    public static String device_token="device_token";
    public static String ispuduct_puchase="ispuduct_puchase";

    public static String versionname="1.0";

    public static boolean is_reload_users =false;
    public static String show_me="show_me";
    public static String max_distance="max_distance";
    public static String max_age="max_age";
    public static String show_me_on_binder="show_me_on_Soulmate";


    public static int default_distance=100;
    public static int default_age=60;



    public static int permission_camera_code=786;
    public static int permission_location_code=787;
    public static int permission_write_data=788;
    public static int permission_Read_data=789;
    public static int permission_Recording_audio=790;





    public static String Pic_firstpart="https://graph.facebook.com/";
    public static String Pic_secondpart="/picture?width=500&width=500";

    public static String Pic_firstpart_200="https://graph.facebook.com/";
    public static String Pic_secondpart_200="/picture?width=200&width=200";

    public static String gif_firstpart="https://media.giphy.com/media/";
    public static String gif_secondpart="/100w.gif";

    public static String gif_firstpart_chat="https://media.giphy.com/media/";
    public static String gif_secondpart_chat="/200w.gif";




 public static String gif_api_key1="cSaTF4Z1U1GWQb2iri1nGY4HaoUFlGAZ";

    // Bottom two variable Related with in App Subscription
    //First step get licencekey
    public static String licencekey="IIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnrJw94gF4FSlSSd5FpGAu2wyqW/aSPI3m8gnSRYohyVVkZVVTe21hluxP79pqL6r2W8ZM6rMkyMKOjyjp0INTUSBEQqWdh+Cu9gsZ6SALOvRhhrkzm8FXIAIHym7qOCMkD+ZherCWO8HEq73zT9uxxGu01UFQCQOpA8ZL9Hrpe/uLV3VW0XcbFQxr0GihOv8UbdS7F+WgHW1xMh2vABV9dUB3dokK0GrmcY45brcGKQ2angpwa2QV4MskziFOzMj3qilizz6nCyc29gSFmyg/IQdC9eb33Kce+GFrLxdc9Cuxp5rEw77uswCrQ6veeQS9ufKlEe57ySlwv02O1kiHQIDAQAB";

    //create the Product id or in app subcription id
    public static String product_ID="com.lone.monthlysub1";



    public static SimpleDateFormat df =
            new SimpleDateFormat("dd-MM-yyyy HH:mm:ssZZ", Locale.ENGLISH);

    public static SimpleDateFormat df2 =
            new SimpleDateFormat("dd-MM-yyyy HH:mmZZ", Locale.ENGLISH);




    public static int Select_image_from_gallry_code=3;

   
    public static String domain="http://anytrackerbd.com/soulmate_backend/API/index.php?p=";


    public static String SignUp=domain+"signup";

    public static String Edit_profile=domain+"edit_profile";

    public static String getUserInfo=domain+"getUserInfo";

    public static String uploadImages=domain+"uploadImages";

    public static String deleteImages=domain+"deleteImages";

    public static String userNearByMe=domain+"userNearByMe";

    public static String flat_user=domain+"flat_user";

    public static String myMatch=domain+"myMatch";

    public static String firstchat=domain+"firstchat";

    public static String unMatch=domain+"unMatch";

    public static String show_or_hide_profile=domain+"show_or_hide_profile";

    public static String update_purchase_Status=domain+"update_purchase_Status";


    public static String deleteAccount=domain+"deleteAccount";



}
