package rbac.sunprakon.kittisak.myrbac.manager;

import android.content.Context;
import android.os.AsyncTask;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

/**
 * Created by Administrator on 6/8/2560.
 */
public class PostUserToServer extends AsyncTask<String,Void,String>{

    private Context context;

    public PostUserToServer(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {

        try {

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("name", params[0])
                    .add("user", params[1])
                    .add("password", params[2])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(params[3]).post(requestBody).build();
            Response response = okHttpClient.newCall(request).execute();
            return response.body().string();



        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }


    }
}  //Main Class
