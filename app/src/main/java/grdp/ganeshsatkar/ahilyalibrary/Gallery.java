package grdp.ganeshsatkar.ahilyalibrary;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Gallery extends AppCompatActivity {
    private Integer[] images = {R.drawable.suvidha_hall1, R.drawable.suvidha_acroom,
            R.drawable.flif4, R.drawable.flif2, R.drawable.flif3, R.drawable.suvidha2, R.drawable.suvidha4,
            R.drawable.suvidha10, R.drawable.flif1,
            R.drawable.flif7, R.drawable.flif6, R.drawable.suvidha13, R.drawable.suvidha10, R.drawable.suvidha9,
            R.drawable.suvidha4, R.drawable.suvidha8, R.drawable.suvidha5, R.drawable.suvidha7, R.drawable.suvidha6

    };

    private ImageView imageview;
    Button facebook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        @SuppressLint("WrongViewCast") android.widget.Gallery imgGallery = (android.widget.Gallery) findViewById(R.id.gallery);

        imgGallery.setAdapter(new ImageAdapter(this));
        imageview = (ImageView) findViewById(R.id.imageView);
        imgGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(getApplicationContext(), "Image " + arg2, Toast.LENGTH_SHORT).show();
                imageview.setImageResource(images[arg2]);
            }
        });
    }


    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context context) {

            this.context = context;
        }

        @Override
        public int getCount() {

            return images.length;
        }

        @Override
        public Object getItem(int arg0) {

            return arg0;
        }

        @Override
        public long getItemId(int arg0) {

            return arg0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {

            ImageView imageView = new ImageView(context);
            imageView.setImageResource(images[arg0]);
            return imageView;
        }
    }


}
