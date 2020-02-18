package vn.poly.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moManHinhMoi(View view) {

        Intent intent =
                new Intent(MainActivity.this,
                        SecondActivity.class);
        // truyền 1 số int
        intent.putExtra("soNguyen",100);

        // truyền 1 chuỗi String
        intent.putExtra("chuoi","Hello");

        Bundle bundle = new Bundle();
        bundle.putString("NAME", "Huy Nguyen");

        intent.putExtra("data",bundle);

        startActivity(intent);

    }

    public void openNews(View view) {
        String news = "https://vnexpress.net";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(news));
        startActivity(intent);
    }


    public void openMaps(View view) {
        String news = "https://www.google.com/maps/place/Tr%C6%B0%E1%BB%9Dng+Cao+%C4%91%E1%BA%B3ng+th%E1%BB%B1c+h%C3%A0nh+FPT+Polytechnic+H%C3%A0+N%E1%BB%99i/@21.0381278,105.7445931,17z/data=!3m1!4b1!4m5!3m4!1s0x313454b991d80fd5:0x53cefc99d6b0bf6f!8m2!3d21.0381278!4d105.7467871";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(news));
        startActivity(intent);
    }

    public void openCall(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:0913360468"));
        startActivity(intent);
    }

    public void sendSMS(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        // This ensures only SMS apps respond
        intent.setData(Uri.parse("sms:"));
        intent.putExtra("sms_body", "ananan");
        startActivity(intent);
    }
}
