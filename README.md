/******************** AsyncTask ******************/



1. When you want to run a process in another thread apart from main thread Async Task is the one of the best.

2. AsyncTask is an abstract class, sub class must extend it and override the following methods
    2.1  "onPreExecutes"
    2.1  "doInBackground"
    2.3  "onProgressUpdate"
    2.4  "onPostExecute"
  
  
 3. So when you create an object of sub class you must call abstract method of parent class "execute()" with parameters
 
 4. Parametes can be PARAM , PROGRESS and RESULT.
 
 5. RESULT will be the return type of "doInBackground" method
 
 6. PARAMS will be the input to the "doInBackground" method
 
 7. PROGRESS will be the input of "onProgressUpdate" method
 
 8. you can cancel this thread at any point of time. so when you are willing to cancel the thread be sure about and it
    and implment "onCancled" method to do needful after cancellantion.
