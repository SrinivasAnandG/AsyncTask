package com.sriniavsprojectpool.asynctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // initializing the AsyncTask
        new TaskToBeDone().execute("from Main activity","pringting will go on");
    }


    public class TaskToBeDone extends AsyncTask<String , String , String>
    {
        //This method will execute on just initialization of thr object.
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(MainActivity.this, "OnPreExecute", Toast.LENGTH_SHORT).show();
        }


        //after above method executes then this method will execute with in no time
        @Override
        protected String doInBackground(String... strings) {


            // if you try to run thos commented code then onCancled will execte and postExecution will not execute
//            try {
//                this.cancel(true);
//
//            }
//            catch (Exception e)
//            {
//                System.out.println(e);
//            }
            return strings[0];
        }



        // after succesful completion i=of the above method this method will execute mean  while on progress will execute
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(MainActivity.this, "onPostExecute after doInBackground: "+s, Toast.LENGTH_SHORT).show();

        }


        //this method executes when cancel is called and destroyes the object
        @Override
        protected void onCancelled() {
            super.onCancelled();
            Toast.makeText(MainActivity.this, "cancled ", Toast.LENGTH_SHORT).show();

        }
    }
}
