package com.japati.retrofitexample;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RegisterAPI {
    @FormUrlEncoded
    @POST("Insert.php") //jika ditambahkan / maka akan membaca base url server home
    Call<Value> daftar(@Field("npm") String npm,
                       @Field("nama") String nama,
                       @Field("kelas") String kelas,
                       @Field("sesi") String sesi);

    @GET("View.php")
    Call<Value> view();

    @FormUrlEncoded
    @POST("Update.php")
    Call<Value> ubah(@Field("npm") String npm,
                     @Field("nama") String nama,
                     @Field("kelas") String kelas,
                     @Field("sesi") String sesi);


    @FormUrlEncoded
    @POST("Delete.php")
    Call<Value> hapus(@Field("npm") String npm);

    @FormUrlEncoded
    @POST("Search.php")
    Call<Value> search(@Field("search") String search);
}
