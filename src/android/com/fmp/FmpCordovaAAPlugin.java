/**
 */
package android.com.fmp;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;

public class FmpCordovaAAPlugin extends CordovaPlugin {
  private static final String TAG = "FmpCordovaAAPlugin";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Initializing FmpCordovaAAPlugin");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("echo")) {
      String phrase = args.getString(0);
      // Echo back the first argument
      Log.d(TAG, phrase);
      final PluginResult result = new PluginResult(PluginResult.Status.OK, phrase);
      callbackContext.sendPluginResult(result);
    } else if(action.equals("getDate")) {
        // An example of returning data back to the web layer
        final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Date()).toString());
        callbackContext.sendPluginResult(result);
    } else if (action.equals("playlist")) {
        JSONArray playlist = args.getJSONArray(0);
        this.updatePlaylist(playlist);
    } else if (action.equals("playing")) {

    }
    return true;
  }

  public void updatePlaylist(JSONArray playlist) {
    for(int i=0;i<playlist.length();i++) {
        JSONObject item = playlist.getJSONObject(i);
    }
  }

}
