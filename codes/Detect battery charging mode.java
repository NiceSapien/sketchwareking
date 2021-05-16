IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED); Intent batteryStatus = registerReceiver(null, ifilter); int chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED,-1);

boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB; boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC; if(usbCharge){
/*BATTERY CHARGING THROUGH USB*/
 Toast.makeText(getApplicationContext(),"Device charging through USB",Toast.LENGTH_LONG).show(); } else if(acCharge) {
/*BATTERY CHARGING THROUGH AC*/
 Toast.makeText(getApplicationContext(),"Device charging through AC",Toast.LENGTH_LONG).show(); } else {
/*DEVICE NOT CHARGING*/

 Toast.makeText(getApplicationContext(),"Device not charging",Toast.LENGTH_LONG).show(); }
