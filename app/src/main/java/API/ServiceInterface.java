package API;

import java.util.ArrayList;
import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Query;
import tvcompany.salemanager.model.Book;
import tvcompany.salemanager.model.GroupProduct;
import tvcompany.salemanager.model.Order;
import tvcompany.salemanager.model.Product;
import tvcompany.salemanager.model.Shop;
import tvcompany.salemanager.model.Status;
import tvcompany.salemanager.model.Status1;
import tvcompany.salemanager.model.Status2;
import tvcompany.salemanager.model.Status3;
import tvcompany.salemanager.model.User;
import tvcompany.salemanager.model.User1;

public interface ServiceInterface {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Multipart
    @POST("/")
    Call<ResponseBody> postImage(@Part MultipartBody.Part image);

    @GET("/uploads")
    Call<ResponseBody> getImage(@Query("fileName") String fileName);

    ////////////////////////////////////////////////////////////////////////////////////////////////

    @GET("/GetAccount")
    Call<User> getUser(@Query("account") String account);

    @GET("/GetUserId")
    Call<Status> getUserID(@Query("account") String account);

    @GET("/listUsers")
    Call<List<User>> getUser();

    @GET("/CheckLogin")
    Call<Status> CheckLogin(@Query("userName") String userName,@Query("password") String password);

    @POST("/AddUser")
    Call<Status> addUser(@Body User user);

    @PUT("/UpdateUser")
    Call<Status> UpdateUser(@Body User user);

    @PUT("/DeleteUser")
    Call<Status> DeleteUser(@Query("account") String user);


    @POST("/AddOrder")
    Call<Status> newOrder(@Body Order order);

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Shop service
    @GET("/GetShop")
    Call<Shop> getShop(@Query("_id") String _id);

    @GET("/GetListShop")
    Call<ArrayList<Shop>> getListShop(@Query("manager") String manager);

    @POST("/AddShop")
    Call<Status> addShop(@Body Shop shop);

    @PUT("/UpdateShop")
    Call<Status> updateShop(@Body Shop shop);

    @PUT("/DeleteShop")
    Call<Status> DeleteShop(@Query("_id") String _id);
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Shop service
    @GET("/GetProduct")
    Call<Product> getProduct(@Query("_id") String _id);

    @GET("/GetListProduct")
    Call<ArrayList<Product>> getListProduct();

    @POST("/AddProduct")
    Call<Status> addProduct(@Body Product product,@Query("session_id") String manager);

    @PUT("/UpdateProduct")
    Call<Status> updatepProduct(@Body Product product);

    @PUT("/DeleteProduct")
    Call<Status> DeleteProduct(@Query("_id") String _id);
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //GroupProduct service
    @GET("/GetGroupProduct")
    Call<ArrayList<GroupProduct>> getGroupProduct();

    @PUT("/UpdateProduct")
    Call<Status> updateProduct(@Body Product product);

    ////////////////////////////////////

    @POST("/booxtown/rest/user/signup")
    Call<Status1> addUser1(@Body User1 user, @Query("hihi") String test);

    @POST("/booxtown/rest/user/login")
    Call<Status1> login(@Query("username") String username, @Query("password") String password,
                        @Query("device_type") String device_type);

    @POST("/booxtown/rest/user/getprofile")
    Call<Status2> getprofile(@Query("session_id") String session_id);

    @POST("/booxtown/rest/user/updateprofile")
    Call<Status1> updateprofile(@Body User1 user,@Query("session_id") String session_id);

    @POST("/booxtown/rest/user/changepassword")
    Call<Status1> changepassword(@Query("session_id") String session_id, @Query("pwd_old") String pwd_old,
                        @Query("pwd_new") String pwd_new);

    @POST("/booxtown/rest/user/logout")
    Call<Status1> logout(@Query("session_id") String session_id);

    @POST("/booxtown/rest/user/forgotpassword")
    Call<Status1> forgotpassword(@Query("email") String email);

    @POST("/booxtown/rest/book/addbook")
    Call<Status1> addbook(@Body Book book, @Query("session_id") String session_id);

    @POST("/booxtown/rest/book/getinfo")
    Call<Status3> getinfo(@Query("session_id") String session_id,@Query("book_id") String book_id);

    @POST("/booxtown/rest/book/getallbook")
    Call<Status3> getAllBook(@Query("session_id") String session_id);

}
