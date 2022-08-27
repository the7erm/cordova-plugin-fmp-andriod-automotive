
var exec = require('cordova/exec');

var PLUGIN_NAME = 'FmpCordovaAAPlugin';

var MyCordovaPlugin = {
  echo: function(phrase, cb) {
    exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
  },
  getDate: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'getDate', []);
  },
  playlist: function(playlist, cb) {
    exec(cb, null, PLUGIN_NAME, 'playlist', [playlist]);
  },
  playing: function(playing, cb) {
    exec(cb, null, PLUGIN_NAME, 'playing', [playing]);
  }
};

module.exports = MyCordovaPlugin;
